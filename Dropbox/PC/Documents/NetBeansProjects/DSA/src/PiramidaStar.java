/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NITRO
 */
public class PiramidaStar {

    public static void main(String[] args) {

        int a = 9;

        for (int i = 0; i <= a; i++) {
            for (int j = a - i; j >= 0; j--) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            
            System.out.println("");

        }
    }
}
