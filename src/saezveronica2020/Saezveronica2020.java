/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saezveronica2020;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Saezveronica2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    float []punD = new float [7];
    float datos=0;
    int i=0;
        do {            
         System.out.println("Ingrese la puntuación obtenia");
        datos=sc.nextFloat();
            if (datos>0) {
                punD[i]=datos;
                i++;
            } else {
                System.out.println("La puntuación ingresada es negativa");
            }
        } while (i<7);
   
    //Menú Principal
        System.out.println("1.Calcular la puntuación de la semana");
        System.out.println("2.Calcular el promedio de las puntuaciones");
        System.out.println("3.Mostrar el día con la puntuación mas altay más baja");
        System.out.println("4.Calcular el total de las puntuaciones acumiladas de los primeros 4 días y de los 4 ultimos dias ");
        System.out.println("5.Salir");
        
    int opccion = sc.nextInt();
        switch (opccion) {
            case 1:
                System.out.println("1.Carcular el totalde la puntuación de la semana ");
                float suma=0;
                for (int j = 0; j < 7; j++) {
                   suma=punD[i]+suma; 
                }
                
                System.out.println("Total de la puntuación es:"+ suma);
                break;
                 case 2:
                     System.out.println("2.Calcular el promedio de las puntuaciones");
                     
                break;
                 
            case 3:
                
                break;
                
            case 4:
                
                break;
                 
            case 5:
                
                break;
            default:
                throw new AssertionError();
        }
    
    
    }
    
      
         
}
