/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el isbn");
        int isbn = leer.nextInt();
        System.out.println("ingrese el autor");
        String autor = leer.next();
        System.out.println("ingrese el titulo");
        String titulo = leer.next();
        System.out.println("ingrese la cantidad de paginas");
        int numerodepaginas = leer.nextInt();
        Libro l1 = new Libro(isbn, autor, titulo, numerodepaginas);
        l1.Escribir(isbn, titulo, autor, numerodepaginas);
    }
    
}
