/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo ;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numerodepaginas ;
    
    public Libro(){
        
    }
    public Libro(int isbn , String titulo , String autor, int numerodepaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numerodepaginas=numerodepaginas;
    }
     public void Escribir (int isbn , String titulo , String autor, int numerodepaginas) {
        System.out.println("el isbn del libro es "+isbn+ " el titulo del libro es "+titulo+" el autor del libro es "+autor+ " la cantidad de paginas del libro es " + numerodepaginas);
}
    
}



    
