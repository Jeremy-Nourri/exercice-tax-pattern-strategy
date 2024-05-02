package org.example;

public class impotsForfaitaireStrategy implements TaxStrategy {
    @Override
    public void calculateTax(long income) {
        long tax;
        if (income < 1000) {
            tax = 0;
        } else {
            tax = income - 1000;
        }
        System.out.println("Les revenus générés par l'impôt forfaitaire seront de : "+ tax + " €");
    }
}
