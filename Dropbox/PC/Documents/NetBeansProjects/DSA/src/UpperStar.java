/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NITRO
 */
public class UpperStar {

    public static void main(String[] args) {

        int k = 7;

        for (int a = 0; a <= k; a++) {

            for (int b = 1; b <= k - a; b++) {

                System.out.print(" ");
            }

            for (int l = 0; l <= a; l++) {

                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
