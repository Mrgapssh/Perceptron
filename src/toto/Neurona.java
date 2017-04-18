/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toto;
  import java.util.Random;
/**
 *
 * @author USER
 */
public class Neurona {
    
    public  void iteraciones (int[][] neu,int filas,int columnas){
      // Generamos los tres pesos de forma aleatoria
          double w1 = new Random().nextDouble();
          double w2 = new Random().nextDouble();
          double w3 = new Random().nextDouble();
          /* Metemos los tres pesos iniciales en un vector
              para poder trabajar mejor y calcular.    */
          double e[] = new double [3];
          e[0]=w1;
          e[1]=w2;
          e[2]=w3;
          //Inicio Ciclo
             for (int x=0; x < filas ; x++) {
                 // Bandera pra controlar el vector de pesos
                 int a = 0;
                 // Vobtenido
                  double z= 0;
                  // Inicio del segundo ciclo
                        for (int y=0; y < columnas ; y++) {
                          
                            //Calculo de la forma x1*w1+x2*w2+x3*w3
                             z = z +  (neu[x][y]*e[a]);
                           // Impresión para guiarnos 
                             System.out.println("x = " + neu[x][y]+ " * " + e[a]);
                               a++;
                      }
                        //Impresión de Z para recalcular los pesos 
                            System.out.println("-----------------");    
                            System.out.println("z =  " + z);
                            System.out.println("-----------------");   
                }
    }
}
