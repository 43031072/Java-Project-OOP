/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.store;

import java.util.Scanner;

/**
 * String item;
        item = getItem();
        System.out.println("Enter the name of the new item:");
 * @author 43031072
 */
public class Store {
    
    private String name;
    private String address;
    private String inventory;
    String arrayItem[];
    int i =0;

    public static void main(String[] args) {
       
        
        
    }
    public void addItem()
    {
        Scanner item = new Scanner(System.in);
        System.out.println("Enter the name of the new item: ");
        String newItem = item.next();
    }
    
    public void removeItem(){
        Scanner remove = new Scanner(System.in);
        System.out.println("Enter the name of the item you want to remove: ");
        String removed = remove.next();
        
        
    }
    public void listItem(){
        for(int i = 0; i < arrayItem.length; i++);
        {
            System.out.println(arrayItem[i]);
        }
    }
}
