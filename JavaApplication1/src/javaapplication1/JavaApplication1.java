
package javaapplication1;

import java.util.Scanner;
import java.lang.Math;

public class JavaApplication1 {

  public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        float a = Float.parseFloat(in.nextLine());
        System.out.print("Введите b: ");
        float b = Float.parseFloat(in.nextLine());
        System.out.print("Введите шаг: ");
        float h = Math.abs(Float.parseFloat(in.nextLine()));
        float temp;
        if(a>b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        while(a<b)
        {        
            System.out.println("x: " + String.format("%.4f", a) + ", f(x): " + String.format("%.4f", (float) (Math.tan(2 * a) - 3)));            
            a += h;
        }       
    }    
}
