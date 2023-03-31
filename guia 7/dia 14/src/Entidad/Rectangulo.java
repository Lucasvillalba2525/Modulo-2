/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;
    public double superficie;
    public double perimetro;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double superficie, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;

    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void crearRectangulo() {

        System.out.println("Ingrese el valor de la base");
        this.base = leer.nextInt();
        System.out.println("Ingrese el valor de la altura");
        this.altura = leer.nextInt();

    }

    public void superficieRectangulo() {
        superficie = base * altura;
        System.out.println("La superficie es: " + superficie);

    }

    public void perimetroRectangulo() {
        perimetro = (base + altura) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }

//    public void dibujarRectangulo() {
//        for (int i = 0; i < altura; i++) {
//            for (int j = 0; j < base; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
    public void dibujarRectangulo() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i > 1 && i < altura && j > 1 && j < base) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }

}
