/*
 * public String nombre;
    public String Apellido;
    public int Edad;
    public String Provincia;

    public Persona(String nombre, String Apellido, int Edad, String Provincia) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Provincia = Provincia;
    }

    public Persona() {
        
    }

    public void SetNombre() {
} 

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Provincia=" + Provincia + '}';
    }
Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona();
        System.out.println("Ingrese El Nombre :");
        p1.nombre = leer.next();
        System.out.println("Ingrese El Apellido : ");
        p1.Apellido = leer.next();
        System.out.println("Ingrese La Edad : ");
        p1.Edad = leer.nextInt();
        System.out.println("Ingrese La Provincia : ");
        p1.Provincia = leer.next();
        
        System.out.println(p1);
 */
package dia.pkg13;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Dia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona();
        
        System.out.println("Ingrese El Nombre :");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese El Apellido : ");
        p1.setApellido(leer.next());
        
        System.out.println("Ingrese La Edad : ");
        p1.setEdad(leer.nextInt());
         
        System.out.println("Ingrese La Provincia : ");
        p1.setProvincia(leer.next());
        
        System.out.println(p1);
    }

}
