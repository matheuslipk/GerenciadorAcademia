package bancodedados;

import hide.Cliente;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;

public class Conexao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL_BANCO = "jdbc:mysql://localhost/academia";
    static final String USUARIO = "root";
    static final String SENHA_BANCO = "2104";
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
            
            while(resultSet.next()){
                cliente.setNome(resultSet.getObject(2).toString());
                cliente.setEndereco(resultSet.getObject(3).toString());
                cliente.setBairro(resultSet.getObject(5).toString());                
                cliente.setCidade(resultSet.getObject(6).toString());
                cliente.setUf(resultSet.getObject(7).toString());                
                cliente.setCpf(resultSet.getObject(9).toString());
                cliente.setNome(resultSet.getObject(2).toString());                
                cliente.setEndereco(resultSet.getObject(3).toString());
                cliente.setBairro(resultSet.getObject(5).toString());                
                cliente.setCidade(resultSet.getObject(6).toString());
                cliente.setUf(resultSet.getObject(7).toString());                
                cliente.setCpf(resultSet.getObject(9).toString());
            }

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
    
    public void editarCliente(Cliente cliente){
        Connection connection = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA_BANCO);
            statement = connection.createStatement();
            String comando = null;
            
//            comando = String.format("UPDATE cliente SET nome=\'%s\', "
//                    + "endereco=\'%s\', numero=%d, bairro=\'%s\', cidade=\'%s\', cep=\'%s\', "
//                    + "uf=\'%s\', cpf=\'%s\' WHERE idCliente=%d",  cliente.getNome(), cliente.getEndereco(),
//            Integer.parseInt(cliente.getNumero()), cliente.getBairro(), cliente.getCidade(), cliente.getCep(),
//            cliente.getUf(), cliente.getCpf(), cliente.getId());
            
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
            
//            comando = String.format("INSERT INTO cliente (nome, endereco, numero, "
//                    + "bairro, cidade, cep, uf, cpf) VALUES (\'%s\', \'%s\',\'%d\',"
//                    + "\'%s\',\'%s\',\'%s\',\'%s\',\'%s\')",  cliente.getNome(), cliente.getEndereco(),
//            Integer.parseInt(cliente.getNumero()), cliente.getBairro(), cliente.getCidade(), cliente.getCep(),
//            cliente.getUf(), cliente.getCpf(), cliente.getId());
            
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
