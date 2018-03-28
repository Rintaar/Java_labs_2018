/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
import java.util.*;
/**
 *
 * @author Black
 */
public class JavaApplication4 
{

    //за основу взято задание 3 и доделано под текущие задачи
    public static void main(String[] args) 
    {
      
        Map<String, String> map = new HashMap();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь:");
        String path = in.nextLine();                          
        Properties prop = new Properties();
        InputStream input = null;             
             try
             {
                input = new FileInputStream(path);
                prop.load(input);              
		Enumeration keys = prop.propertyNames();
		while (keys.hasMoreElements()) 
                {
			String currentKey = (String) keys.nextElement();
			map.put(currentKey, prop.getProperty(currentKey));
		}                
             }
              catch (FileNotFoundException fnfe) 
              {
		System.out.println(fnfe.getMessage());
              } 
              catch (IOException ioe) 
              {
		System.out.println(ioe.getMessage());
              }
             String key;
             while (true) 
             {        

                System.out.print("Введите ключ или  'exit': ");
                key = in.nextLine();
                if (!key.equals("exit"))
                    System.out.println("Значение ключа " + key + ": " + map.get(key));
                else
                    break;
            }
//      
    }
    
}
