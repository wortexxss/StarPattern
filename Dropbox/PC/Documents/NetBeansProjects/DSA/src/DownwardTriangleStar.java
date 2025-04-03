/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NITRO
 */
public class DownwardTriangleStar {

    public static void main(String[] args) {
        int k = 7;

        for (int i = k - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println("");
        }

       

    }
}
