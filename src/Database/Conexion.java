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
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author a22braisdr
 */
public class Conexion {
    /**
     * Variable para a conexión
     */
    public Connection con=null;
    /**
     * Variable para a interfaz gráfica
     */
    public VentanaPrincipal ventanaPrincipal;
    private ArrayList<Partida> partida=new ArrayList<>();
    
    /**
     * Construtor da Clase Conexion
     * @param ventanaPrincipal Interface gráfica
     */
    public Conexion(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        abrirConexion();
    }
    
    
    /**
     * Abre a conexión coa Base de Datos
     * @return 
     */
    public Connection abrirConexion(){
        String url="jdbc:mysql://localhost/punto_de_ira";
        String user="root";
        String password="root";
        try{
            con=DriverManager.getConnection(url, user, password);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(ventanaPrincipal, "Error al acceder a la Base de Datos");
        }
        return con;
    }
    
    /**
     * Engade o novo Usuario á Base de Datos
     * @param usuario Usuario a engadir
     * @param contrasinal Contrasinal a engadir
     */
    public void engadirUsuarioNovo (String usuario,String contrasinal){
        String insertString= "insert into jugadores (Id,Nombre,Contrasenha) values (null,?,MD5(?))";
        if (!comprobarUsuario(usuario)){
            try{
            PreparedStatement insertJugador=con.prepareStatement(insertString);
            insertJugador.setString(1, usuario);
            insertJugador.setString(2, contrasinal);
            insertJugador.execute();
            JOptionPane.showMessageDialog(ventanaPrincipal, "Usuario Registrado!");
            }
            catch (NullPointerException | SQLException e){
                JOptionPane.showMessageDialog(ventanaPrincipal, "Hubo un error al acceder a la Base de Datos");
                ventanaPrincipal.getDialogPuntuaciones().setVisible(false);
            }
        }
        else {
            JOptionPane.showMessageDialog(ventanaPrincipal, "Este usuario ya existe!");
        }
    }
    
    
    /**
     * Comproba que se o usuario existe
     * @param usuario Usuario a comprobar
     * @return true se existe e false se non existe
     */
    public boolean comprobarUsuario(String usuario){
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
        catch (NullPointerException | SQLException e){
                JOptionPane.showMessageDialog(ventanaPrincipal, "Hubo un error al acceder a la Base de Datos");
                ventanaPrincipal.getDialogPuntuaciones().setVisible(false);
            }
        return existir;
    }
    
    
    /**
     * Comproba que se o contrasinal existe
     * @param usuario Usuario a comprobar
     * @param contrasenha Contrasinal a comprobar
     * @return true se existe e false se non existe
     */
    public boolean comprobarContrasenha(String usuario,String contrasenha){
        boolean existir=false;
        try{
            String consulta="select Nombre,Contrasenha from jugadores where Nombre=? and Contrasenha=MD5(?);";
            PreparedStatement stmt=con.prepareStatement(consulta);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenha);
            ResultSet result=stmt.executeQuery();
            if (result.next()){
                existir=true;
            }
        }
        catch (NullPointerException | SQLException e){}
        return existir;
    }
    
    
    /**
     * Garda a Partida na Base de Datos
     * @param usuario Usuario que está na partida
     */
    public void guardarPuntuacion(String usuario){
        String insertString= "insert into partidas (Id_partida,Nombre_jugador,Aciertos,Fallos,Duracion,Fecha,Dificultad) values (null,?,?,?,?,current_date(),?)";
        try{
            PreparedStatement insertPartida=con.prepareStatement(insertString);
            insertPartida.setString(1, usuario);
            insertPartida.setInt(2, ventanaPrincipal.getXogo1().getPuntos());
            insertPartida.setInt(3, ventanaPrincipal.getXogo1().getFallos());
            insertPartida.setInt(4, ventanaPrincipal.getXogo1().getDuracionTotal());
            insertPartida.setString(5, ventanaPrincipal.getXogo1().getDificultad());
            insertPartida.execute();
            JOptionPane.showMessageDialog(ventanaPrincipal, "Puntuación Guardada");
        }
        catch(SQLException | NullPointerException e){}
    }
    
    
    public ArrayList<Partida> listar(){
        String query="select * from partidas";
        try{
            PreparedStatement stmt= con.prepareStatement(query);
            ResultSet result = stmt.executeQuery(query);
            partida.removeAll(partida);
            while (result.next()){
                int id=result.getInt(1);
                String nombre=result.getString(2);
                int aciertos=result.getInt(3);
                int errores=result.getInt(4);
                int duracion=result.getInt(5);
                Date fecha=result.getDate(6);
                String dificultad=result.getString(7);
                partida.add(new Partida(id, nombre, aciertos, errores, duracion, fecha, dificultad));
            }
        }
        catch (NullPointerException | SQLException e){
            JOptionPane.showMessageDialog(ventanaPrincipal, "Hubo un error al acceder a la Base de Datos");
            ventanaPrincipal.getDialogPuntuaciones().setVisible(false);
        }
        return partida;
    }
}
