/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author Black
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] productImplCount = new int[4];

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество книг: ");        
        productImplCount[0] = Integer.parseInt(in.nextLine());
        
        System.out.print("Введите количество обуви: ");
        productImplCount[1] = Integer.parseInt(in.nextLine());
        
        System.out.print("Введите количество игрушек: ");
        productImplCount[2] = Integer.parseInt(in.nextLine());
        
        System.out.print("Введите количество картин: ");
        productImplCount[3] = Integer.parseInt(in.nextLine());
        
        Product[] products = new Product[productImplCount[0] + productImplCount[1] + productImplCount[2] + productImplCount[3]];
        System.out.print("\nТовары:\n\n");
        int productsCounter = 0;
        for (int i = 0; i < productImplCount[0]; i++) {
                products[productsCounter++] = new javaapplication2.Book();
        }

        for (int i = 0; i < productImplCount[1]; i++) {
                products[productsCounter++] = new Shoe();
        }

        for (int i = 0; i < productImplCount[2]; i++) {
                products[productsCounter++] = new Toy();
        }

        for (int i = 0; i < productImplCount[3]; i++) {
                products[productsCounter++] = new javaapplication2.Picture();
        }
        
         for (Product prod : products) {
                System.out.println("\"" + prod.whoAmI()  + "\" Это подарок?: " + ((prod instanceof javaapplication2.Present) ? ((javaapplication2.Present) prod).itCanBePresented() : "Нет"));
         }
         
         System.out.println("\nТолько подарки:\n");
        for (Product prod : products) {
            if(prod instanceof javaapplication2.Present)
            {
                System.out.println("\"" + prod.whoAmI()  + "\" " + ((javaapplication2.Present) prod).itCanBePresented());
            }
               
        }
    }
    
}
