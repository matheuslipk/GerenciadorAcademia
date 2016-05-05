package bancodedados;

import hide.Cliente;
import hide.constantes.Strings;
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

public class Conexao {
    static final String JDBC_DRIVER = Strings.getJDBCDriver();
    static final String URL_BANCO = Strings.getUrlBanco();
    static final String USUARIO = Strings.getUsuario();
    static final String SENHA_BANCO = Strings.getSenha();
    private final Cliente cliente = new Cliente();
    
    public Cliente pesqIDCliente(int id){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = String.format("SELECT * FROM cliente WHERE idCliente=%d", id);
            ResultSet resultSet = statement.executeQuery(comando);
            
            System.out.println(comando);
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberColumns = metaData.getColumnCount();
            
//            for(int i=1; i<=numberColumns; i++)
//                System.out.printf("%s\t", metaData.getCatalogName(i));
//            System.out.println("");
            
            if(resultSet.next()){
                cliente.setNome(resultSet.getObject(2).toString());
                
                try {
                    cliente.setDataInclusao(dataFormt(resultSet.getObject(3).toString()));
                    cliente.setDataNascimento(dataFormt(resultSet.getObject(4).toString()));
                } catch (ParseException ex) {
                    System.out.println("Erro na funcao pesquisarCliente.Conexão:"+ex);
                    return null;
                }
                                
                cliente.setRg(resultSet.getObject(5).toString());
                cliente.setCpf(resultSet.getObject(6).toString());
                cliente.setEmail(resultSet.getObject(7).toString());
                cliente.setTelefone1(resultSet.getObject(8).toString());                
                cliente.setTelefone2(resultSet.getObject(9).toString());
                cliente.setObjetivo(resultSet.getObject(10).toString());                
                cliente.setEndereco(resultSet.getObject(11).toString());
                cliente.setBairro(resultSet.getObject(12).toString());                
                cliente.setCidade(resultSet.getObject(13).toString());
                cliente.setUf(resultSet.getObject(14).toString());                
                cliente.setStatus(resultSet.getObject(15).toString());
                cliente.setSexo(resultSet.getObject(16).toString());
            }
            else
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
        return cliente;
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
    
    public void addCliente(Cliente cliente){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = null;
            
            comando = String.format("INSERT INTO cliente (nome, dataInclusao, dataNascimento, "
                    + "rg, email, telefone1, telefone2, objetivo, cpf, endereco, "
                    + "bairro, cidade, uf, status, sexo) VALUES (\'%s\', \'%s\',\'%s\', "
                    + "\'%s\',\'%s\',\'%s\',\'%s\',\'%s\',\'%s\',\'%s\',\'%s\', "
                    + "\'%s\',\'%s\',\'%s\', \'%s\')",  cliente.getNome(), dataFormatSql(cliente.getDataInclusao()),
                    dataFormatSql(cliente.getDataNascimento()), cliente.getRg(), cliente.getEmail(),
                    cliente.getTelefone1(), cliente.getTelefone2(), cliente.getObjetivo(),
                    cliente.getCpf(), cliente.getEndereco(), cliente.getBairro(),
                    cliente.getCidade(), cliente.getUf(), cliente.getStatus(), cliente.getSexo());
            
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
