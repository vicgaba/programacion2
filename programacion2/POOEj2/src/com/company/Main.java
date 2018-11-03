package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Libro libro1 = new Libro();
        libro1.setISBN(954000123);
        libro1.setTitulo("El primer libro");
        libro1.setAutor("Pimero sombra");
        libro1.setPaginas(120);
        Libro libro2 = new Libro();
        libro2.setISBN(954000456);
        libro2.setTitulo("El segundo libro");
        libro2.setAutor("Segundo sombra");
        libro2.setPaginas(130);

        System.out.println("El libro con ISBN: "+libro1.getISBN() + " creado por el atuor "+ libro1.getAutor() +
                " tiene " + libro1.getPaginas() + " páginas.");
        //int l1=libro1.getPaginas();
        //int l2=libro2.getPaginas();
        if (libro1.getPaginas() < libro2.getPaginas()) {
            System.out.println("EL libro con mayor cantidad de páginas es: "+libro2.getTitulo()+" con "+libro2.getPaginas()+" páginas");
        }  else {
            System.out.println("EL libro con mayor cantidad de páginas es: "+libro1.getTitulo()+" con "+libro1.getPaginas()+" páginas");
        }
    }
}
