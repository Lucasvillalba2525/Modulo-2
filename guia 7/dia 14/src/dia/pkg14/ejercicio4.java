/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkg14;

import Entidad.Rectangulo;

/**
 *
 * @author User
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        r1.superficieRectangulo();
        r1.perimetroRectangulo();
        r1.dibujarRectangulo();
        System.out.println(r1);
    }

}
