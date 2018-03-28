/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
import java.util.concurrent.locks.*;

/**
 *
 * @author Black
 */
public class JavaApplication5 {

    static int a;
    public static void main(String[] args) {
       Thread firstEmployee = new Thread(() -> {
         try {
            for (int i = 0; i < a; i++) {
               Thread.sleep(100); 
               System.out.println("1 работник. Саженец: " + (i+1) + "/"+ a);
               Thread.sleep(100);               
               
            }
         } catch (InterruptedException ie) {         
         }
      });

      // метод join будет ждать выполнение потока
      Thread secondEmployee = new Thread(() -> {
         try {            
               for (int i = 0; i < a; i++) {
                  Thread.sleep(101);
                  System.out.println("2 работник. Саженец: " + (i+1) + "/"+ a);
                  Thread.sleep(100);
                  

               }
         } catch (InterruptedException ie) {            
         }
      });

      Thread thirdEmployee = new Thread(() -> {
         try {            
               for (int i = 0; i < a; i++) {
                  Thread.sleep(102);
                  System.out.println("3 работник. Саженец: " + (i+1) + "/"+ a+"\n");
                  Thread.sleep(100);
                  


               }            
         } catch (InterruptedException ie) {          
         }
      });

      Scanner in = new Scanner(System.in);
        System.out.println("Введите количество деревьев:");
        a = Integer.parseInt(in.nextLine());           
      
      firstEmployee.start();
      secondEmployee.start();
      thirdEmployee.start();
    }
    
}
