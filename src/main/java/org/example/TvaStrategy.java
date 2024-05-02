package org.example;

public class TvaStrategy implements TaxStrategy {
    @Override
    public void calculateTax(long income) {
        long result = (long) (income * 0.2);
        System.out.println("Les revenus générés par la TVA seront de : "+ result  + " €");
    }
}
