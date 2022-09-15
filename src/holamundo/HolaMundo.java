/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
        
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = 3;
               
        resultado++;    
        System.out.println(resultado);
        System.out.println("Hola Mundo");
        System.err.println("Hola");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto y presione enter");
        String text = sc.nextLine();
        
        System.out.println("Texto ingresado"+text);
    }
    
}
