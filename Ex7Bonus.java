package tp3;

import java.util.Random;
import java.util.Scanner;

public class Ex7Bonus {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int nombre = rand.nextInt(10) + 1; // nombre entre 1 et 10
        int tentative;
        int compteur = 0;

        System.out.println("Devinez un nombre entre 1 et 10 :");

        do {
            System.out.print("Votre choix : ");
            tentative = sc.nextInt();
            compteur++;

            if (tentative < nombre) {
                System.out.println("Plus grand");
            } 
            else if (tentative > nombre) {
                System.out.println("Plus petit");
            } 
            else {
                System.out.println("Bravo !");
            }

        } while (tentative != nombre);

        System.out.println("Nombre de tentatives : " + compteur);

        sc.close();
    }
}
