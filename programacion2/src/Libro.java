package com.company;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public int getISBN() { return ISBN;}
    public void setISBN(int ISBN) { this.ISBN =ISBN;}
    public String getTitulo() { return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) { this.autor = autor;}
    public int getPaginas() { return paginas;}
    public void setPaginas(int paginas) { this.paginas = paginas;}

}
