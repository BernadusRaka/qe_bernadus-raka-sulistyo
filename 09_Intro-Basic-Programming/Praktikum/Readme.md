# Soal Prioritas 1 bagian 1
import java.util.Scanner;
class Latihan {
    public static void main(String[] args) {
        Scanner bangunDatar = new Scanner(System.in);

        //Perhitungan untuk luas segitiga
        System.out.println("Perhitungan Luas Segitiga");
        System.out.println("Masukkan nilai tinggi : ");
        double tinggi = bangunDatar.nextDouble();
        System.out.println("Masukkan nilai alas : ");
        double alas = bangunDatar.nextDouble();
        System.out.println("Luas segitiga  : " + 0.5 * (alas*tinggi));

        //Perhitungan luas persegi panjang
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("Masukkan nilai panjang : ");
        double panjang = bangunDatar.nextDouble();
        System.out.println("Masukkan nilai lebar : ");
        double lebar = bangunDatar.nextDouble();
        System.out.println("Luas persegi panjang  : " + panjang * lebar);

        //Perhitungan luas lingkaran
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("Masukkan nilai jari-jari : ");
        double Radius = bangunDatar.nextDouble();
        System.out.println("Luas lingkaran : " + 3.14 * Math.pow(Radius,2));


    }
}

# Soal Prioritas 1 bagian 2 

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("harga beli : ");
        double beli = money.nextDouble();
        System.out.println("harga jual : ");
        double jual = money.nextDouble();
        double a = beli;
        double b = jual;
        double c = b - a;
        if (c > 0) {
            System.out.println("hasil keuntungan :"+ c);
        } else if (c < 0){
            System.out.println("Kerugian :"+ -1*c );
        } else if (c == 0) {
            System.out.println("sama saja :" + c);
        }
    }
}

# Soal eksplorasi

import java.util.Scanner;

public class Eksplorasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String plaintext = scanner.nextLine();
        int shift = 10;

        String encryptedText = encrypt(plaintext, shift);

        System.out.println("Teks awal: " + plaintext);
        System.out.println("Teks terenkripsi: " + encryptedText);

        scanner.close();
    }

    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char originalChar = plaintext.charAt(i);
            char encryptedChar;

            if (Character.isLetter(originalChar)) {
                char base = Character.isUpperCase(originalChar) ? 'A' : 'a';
                encryptedChar = (char) (((originalChar - base + shift) % 26) + base);
            } else {
                encryptedChar = originalChar;
            }

            encryptedText.append(encryptedChar);
        }

        return encryptedText.toString();
    }
}