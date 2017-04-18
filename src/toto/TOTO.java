/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toto;
  import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TOTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      


Scanner leer = new Scanner(System.in);
System.out.print("Cuantas fila tiene la matriz:");
        int f=leer.nextInt();
System.out.print("Cuantas columnas tiene la matriz:");
        int c=leer.nextInt();

            int neu[][] = new int[f][c];
                for (int x=0; x < f; x++) {
                        for (int y=0; y < c; y++) {
                            System.out.println("Fila: "+ x + " Columna "+" "+y);

                            neu[x][y] = leer.nextInt();
                      }
            }
                
           
                Neurona neurona = new Neurona ();
                
              
                neurona.iteraciones(neu, f, c);
       
}
    
    
}
