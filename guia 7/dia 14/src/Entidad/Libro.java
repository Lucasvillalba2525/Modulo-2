/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author User
 */
public class Libro {

    // atributos
    private int isbn ,paginas;
//    private int paginas;
    private String titulo;
    private String autor;

    // constructor
    public Libro() {
    }

    public Libro(int isbn, int paginas, String titulo, String autor) {
        this.isbn = isbn;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    // métodos
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro" + "\nisbn=" + isbn + "\npaginas=" + paginas + "\ntitulo=" + titulo + "autor=" + autor;
    }

}
