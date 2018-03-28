/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Black
 */
public class JavaApplication3 
{

    public static void main(String[] args) 
    {
        
             Scanner in = new Scanner(System.in);
             System.out.println("Введите путь:");
             String path = in.nextLine();
             System.out.println("Введите ключ");
             String key = in.nextLine();
                          
             Properties prop = new Properties();
             InputStream input = null;
             
             try
             {
                 input = new FileInputStream(path);
                 prop.load(input);
                 System.out.println(prop.getProperty((key)));
             }
              catch (FileNotFoundException fnfe) 
              {
		System.out.println(fnfe.getMessage());
              } 
              catch (IOException ioe) 
              {
		System.out.println(ioe.getMessage());
              }
             finally
             {
                 if(input != null)
                 {
                     try
                     {
                         input.close();
                     }
                     catch (FileNotFoundException fnfe) 
                     {
                      System.out.println(fnfe.getMessage());
                     } 
                     catch (IOException ioe) 
                     {
                      System.out.println(ioe.getMessage());
                     }
                 }
             }
		
    }
    
    
}
