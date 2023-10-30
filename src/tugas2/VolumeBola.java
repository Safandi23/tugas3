package tugas2;

import java.util.Scanner;

/**
 * @namakelas VolumeBola
 * @metod main
 */

public class VolumeBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Volume Bola");
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        System.out.println("Volume bola adalah: " + volume);


    }
}