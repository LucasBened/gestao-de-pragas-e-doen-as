
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class GestaoPragas {

    Connection conectado;
    PreparedStatement st;
    ResultSet resultado;
    
    
    private void conectar() throws ClassNotFoundException, SQLException {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/dadosGestao", "root", "p@$$w0rd");
            
    }
    
    public void salvarUsuario (String usuario, String senha, String cargo) throws ClassNotFoundException, SQLException{
            conectar();
                   
            // O PREPAREDSTATEMENT SERVE PARA EXECUTARMOS COMANDOS SQL
             st = conectado.prepareStatement("INSERT INTO usuarios values(?,?,?)");

            st.setString(1, usuario); 
            st.setString(2, senha);
            st.setString(3, cargo);
            st.executeUpdate(); // SALVAR NO BANCO DE DADOS
    }
    
    public ResultSet entrar(String usuario, String senha) throws ClassNotFoundException, SQLException{
        conectar();
           
            st = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?;");
            st.setString(1, usuario); 
            st.setString(2, senha);
            resultado =  st.executeQuery();
        
        return resultado;
    }

    
}
