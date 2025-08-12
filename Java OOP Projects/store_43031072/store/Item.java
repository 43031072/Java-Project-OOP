/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.store;

import java.util.Scanner;

/**
 *
 * @author 43031072
 */
public class Item {
    
    private String name;
    private double price;
    private int quantity;
    int numbQuantity;
    
    public void updateQuantity()
    {
        Scanner current = new Scanner(System.in);
        System.out.println("Enter the number of the new quantity");
        numbQuantity = current.nextInt();
    }
    
}
