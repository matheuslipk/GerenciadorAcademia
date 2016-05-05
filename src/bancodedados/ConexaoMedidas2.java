package bancodedados;

import hide.Medidas2;
import hide.constantes.Strings;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ConexaoMedidas2 {
    static final String JDBC_DRIVER = Strings.getJDBCDriver();
    static final String URL_BANCO = Strings.getUrlBanco();
    static final String USUARIO = Strings.getUsuario();
    static final String SENHA_BANCO = Strings.getSenha();
    private final Medidas2 medidas = new Medidas2();    
    
    
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
    
    public void addMedidas(Medidas2 medidas){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = null;
            
            
            comando = String.format("INSERT INTO medidas2 (idCliente, peso, "
                    + "altura, imc, dataMedicao) VALUES (%d, %s, %s, %s ,\'%s\')", 
                    medidas.getIdCliente(), medidas.getPeso(), medidas.getAltura(),
                    medidas.getImc(), dataFormatSql(medidas.getDataMedicao()));
            
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
