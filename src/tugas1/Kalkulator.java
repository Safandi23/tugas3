package tugas1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("Pilih operasi yang Anda inginkan: +, -, *, /");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
                    case '+':
                        hasil = angka1 + angka2;
                        System.out.println("Hasil penambahan: " + hasil);
                        break;
                    case '-':
                        hasil = angka1 - angka2;
                        System.out.println("Hasil pengurangan: " + hasil);
                        break;
                    case '*':
                        hasil = angka1 * angka2;
                        System.out.println("Hasil perkalian: " + hasil);
                        break;
                    case '/':
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                            System.out.println("Hasil pembagian: " + hasil);
                        } else {
                            System.out.println("Tidak bisa membagi dengan nol.");
                        }
                        break;
                    default:
                        System.out.println("Operasi tidak valid.");
                        break;
        }

        input.close();
    }
}
