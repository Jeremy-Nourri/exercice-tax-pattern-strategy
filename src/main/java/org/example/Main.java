package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        SimulatorTax simulator = SimulatorTax.builder().build();

        long income;

        do {
            System.out.println("_____________________________________________________________");
            System.out.println("##### SELECTION DE LA STRATEGIE FISCALE ET SIMULATION #######");
            System.out.println("Choissisez votre stratégie fiscale");
            System.out.println("1) Impôt progressif sur le revenu");
            System.out.println("2) TVA");
            System.out.println("3) Impôt forfaitaire");
            System.out.println("0) Quitter le programme");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi l'impôt progressif");
                    System.out.println("Entrez votre somme");
                    income = scanner.nextLong();
                    simulator.setIncome(income);
                    simulator.calculateTax(new ImpotsProgressifStrategy());
                    break;
                case 2:
                    System.out.println("Vous avez choisi la TVA");
                    System.out.println("Entrez votre somme");
                    income = scanner.nextLong();
                    simulator.setIncome(income);
                    simulator.calculateTax(new TvaStrategy());
                    break;
                case 3:
                    System.out.println("Vous avez choisi l'impôt forfaitaire");
                    System.out.println("Entrez votre somme");
                    income = scanner.nextLong();
                    simulator.setIncome(income);
                    simulator.calculateTax(new impotsForfaitaireStrategy());
                    break;
                case 0:
                    System.out.println("Vous avez quitté le programme");
                    break;
            }

        } while (choix != 0);


    }
}