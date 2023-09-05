package Semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



// JDBC - Java Database Connection
// - Conjunto de interface e classe para acesso a SGBDs

// APP Java ---- MySQL
// como abrir conexão?
// como executar um código SQL?
// Qual o formato de resultados de uma consulta SELECT * FROM ...

// JAVA App ---> JDBC ---> Driver(biblioteca que implementa JDBC) ---> SGBD
public class Main {

     public static void main(String[] args) throws SQLException {
        // 1- Criar a conexão

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        // 2 - Executar a consulta
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);"; 
        Statement stm = conn.createStatement();
        stm.execute(sql);

        // 3- Fechar Conexão
        stm.close();
        conn.close();
    }
    
}
