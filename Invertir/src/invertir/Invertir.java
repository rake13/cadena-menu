/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir;

/**
 *
 * @author Jorge Dominguez J
 */
public class Invertir
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    System.out.print ("instituto tecnologico superior de escarcega");
    System.out.print("  raquel");
    
     
     int menu=0;
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        
          
          menu=lectura.nextInt();
          
          
          switch (menu)
          
          {
              case 1:
                  
                  System.out.print("el programa tiene como objetivo realizar una serie de instrucciones, las cuales se les a asignado un numero ,elija un numero y espere resultados");
                  break;
     
    case 2:
                  
                  String rakel=lectura.next();
                  for(int i=rakel.length() - 1; i >= 0; i--)
                  {
                      char c = rakel.charAt(i);
                      System.out.print(c);
                  }
                  break;

    
    }
     }
    }

