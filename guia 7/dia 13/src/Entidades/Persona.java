/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author User
 */
public class Persona {

    private String nombre;
    private String Apellido;
    private int Edad;
    private String Provincia;
    
     public Persona() {
    }

    public Persona(String nombre, String Apellido, int Edad, String Provincia) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Provincia = Provincia;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getProvincia() {
        return Provincia;
    }


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Provincia=" + Provincia + '}';
    }
}
