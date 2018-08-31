/*
confeccionar un programa que permita cargar los o nombres de  operarios y su sueldos respectivos.
mostrar el sieldo mayor y el nombre del operario
 */
package java_004;
import java.util.Scanner;

public class Java_004 
{
 private Scanner sc;
 private String[] nombres;
 private float[] sueldos;
 
 
 
 public void cargar()
 {
   sc = new Scanner(System.in);
   nombres = new String[5];
   sueldos = new float[5];
     for (int f = 0; f < nombres.length; f++) 
     {
         System.out.println("Ingrese nombre del operador: ");  
         nombres[f] = sc.next();
         System.out.println("Ingrese el sueldo:  ");
         sueldos[f] =sc.nextFloat();
         
     }
 }
 
 public void mayorSueldo()
 {
    float mayor;
    int pos;
    mayor = sueldos[0];
    pos=0;
     for (int f = 0; f <nombres.length; f++)
     {
         if(sueldos[f]>mayor)
         {
           mayor=sueldos[f];
           pos = f;
         }
     }
     System.out.println("El empleado con sueldo mayor es: "+nombres[pos]);
     System.out.println("Tienes un sueldo: "+mayor);
     System.out.println("Gracias por su consulta!");
     
     
 }
 
    
    public static void main(String[] args) 
    {
       Java_004 jv4 = new Java_004();
               jv4.cargar();
               jv4.mayorSueldo();
               
    }
}
