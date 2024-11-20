package main;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciok = {"Kő", "Papír", "Olló"};
        Random random = new Random();

        System.out.println("Kérlek, válassz: Kő (0), Papír (1), Olló (2):");
        int jatekosValasztas = sc.nextInt();

        while (jatekosValasztas < 0 || jatekosValasztas > 2) {
            System.out.println("Helytelen választás! Csak 0, 1 vagy 2 lehet.");
            System.out.println("Kérlek, válassz: Kő (0), Papír (1), Olló (2):");
            jatekosValasztas = sc.nextInt();
        }
        
        int gepValasztas = random.nextInt(3);

        System.out.println("Játékos választása: " + opciok[jatekosValasztas]);
        System.out.println("Gép választása: " + opciok[gepValasztas]);

        if (jatekosValasztas == gepValasztas) {
            System.out.println("Döntetlen!");
        } else if ((jatekosValasztas == 0 && gepValasztas == 2)
                || (jatekosValasztas == 1 && gepValasztas == 0)
                || (jatekosValasztas == 2 && gepValasztas == 1)) {
            System.out.println("Játékos nyert!");
        } else {
            System.out.println("Gép nyert!");
        }
    }
}
