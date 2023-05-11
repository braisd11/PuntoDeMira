/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;


import java.util.Date;

/**
 *
 * @author a22braisdr
 */
public class Partida {
    private int id;
    private String nombre;
    private int aciertos;
    private int errores;
    private int duracion;
    private Date fecha;
    private String dificultad;

    public Partida(int id, String nombre, int aciertos, int errores, int duracion, Date fecha, String dificultad) {
        this.id = id;
        this.nombre = nombre;
        this.aciertos = aciertos;
        this.errores = errores;
        this.duracion = duracion;
        this.fecha = fecha;
        this.dificultad = dificultad;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    
    
}
