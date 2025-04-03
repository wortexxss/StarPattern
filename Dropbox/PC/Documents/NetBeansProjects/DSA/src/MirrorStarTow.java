/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NITRO
 */
public class MirrorStarTow {

    static void stars(int size) {
        int m, n;

        for (m = size - 1; m >= 0; m--) {
            for (n = 0; n < m; n++) {
                System.out.println(" ");
            }

            for (n = m; n < size - 1; n++) {
                System.out.println("*" + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int size = 7;
         stars(size);
    }
}
