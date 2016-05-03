package bancodedados;

import hide.Cliente;
import hide.Medidas;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ConexaoMedidas {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL_BANCO = "jdbc:mysql://localhost/academia";
    static final String USUARIO = "root";
    static final String SENHA_BANCO = "2104";
    private final Medidas medidas = new Medidas();
    
    public Medidas pesqIDMedidas(int idCliente){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = String.format("SELECT * FROM medidas WHERE idCliente=%d", idCliente);
            ResultSet resultSet = statement.executeQuery(comando);
            
            System.out.println(comando);
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberColumns = metaData.getColumnCount();
            
//            for(int i=1; i<=numberColumns; i++)
//                System.out.printf("%s\t", metaData.getCatalogName(i));
//            System.out.println("");
            int idEncontrado = 0;
            while(resultSet.next()){
                medidas.setIdCliente(Integer.parseInt(resultSet.getObject(2).toString()));
                idEncontrado++;
                try {
                    medidas.setDataMedicao(dataFormt(resultSet.getObject(3).toString()));
                } catch (ParseException ex) {
                    System.out.println("Erro na funcao pesquisarIdMedidas.Conexão:"+ex);
                    return null;
                }
                                
//                medidas.setRg(resultSet.getObject(5).toString());
//                medidas.setCpf(resultSet.getObject(6).toString());
//                medidas.setEmail(resultSet.getObject(7).toString());
//                medidas.setTelefone1(resultSet.getObject(8).toString());                
//                medidas.setTelefone2(resultSet.getObject(9).toString());
//                medidas.setObjetivo(resultSet.getObject(10).toString());                
//                medidas.setEndereco(resultSet.getObject(11).toString());
//                medidas.setBairro(resultSet.getObject(12).toString());                
//                medidas.setCidade(resultSet.getObject(13).toString());
//                medidas.setUf(resultSet.getObject(14).toString());                
//                medidas.setStatus(resultSet.getObject(15).toString());
//                medidas.setSexo(resultSet.getObject(16).toString());
            }
            if(idEncontrado==0)
                return null;

            
            
        }catch(SQLException e){
            System.out.println("ERRO SQLException");
            e.printStackTrace();            
            System.exit(1);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
        return medidas;
    }
    
    private Date dataFormt(String data) throws ParseException{
        data = dataFormatSqlInver(data);
        DateFormat f = DateFormat.getDateInstance();
        return f.parse(data);
    }
    
    private String dataFormatSql(Date data){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DAY_OF_MONTH, data.getDate());
        a.set(Calendar.MONTH, data.getMonth());
        a.set(Calendar.YEAR, data.getYear()+1900); 
        
        return String.format("%d-%d-%d", a.get(Calendar.YEAR), a.get(Calendar.MONTH)+1,
                a.get(Calendar.DAY_OF_MONTH));
    }
    
    private String dataFormatSqlInver(String dataSql){
        String arrayData[] = dataSql.split("-");               
        return String.format("%s/%s/%s", arrayData[2], arrayData[1], arrayData[0]);
    }        
    
    public void editarCliente(Cliente cliente){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando;
            
            comando = String.format("UPDATE cliente SET nome=\'%s\', "
                    + "dataInclusao=\'%s\', dataNascimento=\'%s\', rg=\'%s\', email=\'%s\', telefone1=\'%s\', "
                    + "telefone2=\'%s\',objetivo=\'%s\', cpf=\'%s\', endereco=\'%s\',"
                    + "bairro=\'%s\', cidade=\'%s\', uf=\'%s\', status=\'%s\', "
                    + "sexo=\'%s\' WHERE idCliente=%d",
                    cliente.getNome(), dataFormatSql(cliente.getDataInclusao()),
            dataFormatSql(cliente.getDataNascimento()), cliente.getRg(), cliente.getEmail(), 
            cliente.getTelefone1(), cliente.getTelefone2(), cliente.getObjetivo(), cliente.getCpf(),
            cliente.getEndereco(),cliente.getBairro(), cliente.getCidade(), cliente.getUf(),
            cliente.getStatus(),cliente.getSexo() ,cliente.getIdCliente());
            
            System.out.println(comando);
            
            int resultado = statement.executeUpdate(comando);
            
            System.out.println("retorno = "+resultado);

        }catch(SQLException e){
            System.out.println("ERRO SQLException");
            e.printStackTrace();            
            System.exit(1);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
    
    public void addMedidas(Medidas medidas){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = null;
            
            
            comando = String.format("INSERT INTO medidas (idCliente, peso, altura, "
                    + "imc, pescoco, ombro, bracoRlxDir, bracoRlxEsq, bracoConDir, "
                    + "bracoConEsq, anteBracoDir, anteBracoEsq, toraxRlx, toraxInsp, "
                    + "cintura, abdomen, quadril, rcq, coxaDir, coxaEsq, panturrilhaDir, "
                    + "panturrilhaEsq, dataMedicao) VALUES (%d, %s, %s, %s, "
                    + "%s, %s, %s, %s, %s, %s, %s, %s, %s, "
                    + "%s, %s, %s, %s, %s, %s,"
                    + "%s, %s, %s, \'%s\')", medidas.getIdCliente(), 
                    Double.toString(medidas.getPeso()), Double.toString(medidas.getAltura()),
                    Double.toString(medidas.getImc()), Double.toString(medidas.getPescoco()), 
                    Double.toString(medidas.getOmbro()), Double.toString(medidas.getBracoRlxDir()),
                    Double.toString(medidas.getBracoRlxEsq()), Double.toString(medidas.getBracoConDir()),
                    Double.toString(medidas.getBracoConEsq()), Double.toString(medidas.getAntebracoDir()), 
                    Double.toString(medidas.getAntebracoEsq()),
                    Double.toString(medidas.getToraxRlx()), Double.toString(medidas.getToraxInsp()), 
                    Double.toString(medidas.getCintura()), Double.toString(medidas.getAbdomen()), 
                    Double.toString(medidas.getQuadril()), Double.toString(medidas.getRcq()), 
                    Double.toString(medidas.getCoxaDir()), Double.toString(medidas.getCoxaEsq()), 
                    Double.toString(medidas.getPanturrilhaDir()), Double.toString(medidas.getPanturrilhaEsq()), 
                    dataFormatSql(medidas.getDataMedicao()));
            
            System.out.println(comando);
            
            int resultado = statement.executeUpdate(comando);
            System.out.println("retorno = "+resultado);

        }catch(SQLException e){
            System.out.println("ERRO SQLException");
            e.printStackTrace();            
            System.exit(1);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
