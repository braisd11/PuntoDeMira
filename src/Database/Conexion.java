/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import View.VentanaPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author a22braisdr
 */
public class Conexion {
    public Connection con=null;
    public VentanaPrincipal ventanaPrincipal;
    
    public Conexion(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        abrirConexion();
    }
    
    
    /**
     * 
     * @return 
     */
    public Connection abrirConexion(){
        String url="jdbc:mysql://localhost/punto_de_mira";
        String user="root";
        String password="root";
        try{
            con=DriverManager.getConnection(url, user, password);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    
    public void engadirUsuarioNovo (String usuario,String contrasinal){
        String insertString= "insert into jugadores (Id,Nombre,Contrasenha) values (null,?,?)";
        try{
            PreparedStatement insertJugador=con.prepareStatement(insertString);
            insertJugador.setString(1, usuario);
            insertJugador.setString(2, contrasinal);
            insertJugador.execute();
            JOptionPane.showMessageDialog(ventanaPrincipal, "Usuario Registrado!");
        }
        catch(SQLException e){
            if (comprobarUsuarios(usuario)){
                JOptionPane.showMessageDialog(ventanaPrincipal, "Este usuario ya existe");
            }
            else{
                JOptionPane.showMessageDialog(ventanaPrincipal, "Error al registrar al usuario!");
            }
        }
    }
    
    
    private boolean comprobarUsuarios(String usuario){
        boolean existir=false;
        try{
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery("select Nombre from jugadores");
            while (result.next()){
                String nombre=result.getString(1);
                if (nombre.equals(usuario)){
                    existir=true;
                }
            }
        }
        catch (SQLException e){
            e.getMessage();
        }
        return existir;
    }
}
