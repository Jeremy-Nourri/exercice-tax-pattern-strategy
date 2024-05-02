package org.example;

public class ImpotsProgressifStrategy implements TaxStrategy {
    @Override
    public void calculateTax(long income) {
        double tax = 0;
        if (income <= 11294) {
            tax = 0;
        } else if (income <= 28797) {
            tax = income * 0.11;
        } else if (income <= 82341) {
            tax = income * 0.3;
        } else {
            tax = income * 0.4;
        }
        System.out.println("Les revenus générés par l'impôt progressif seront de : "+ tax + " €");
    }
}
