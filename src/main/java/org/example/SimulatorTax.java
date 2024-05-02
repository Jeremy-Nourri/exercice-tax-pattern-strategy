package org.example;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SimulatorTax {
    private long income;

    public void calculateTax(TaxStrategy taxStrategy) {
        taxStrategy.calculateTax(income);
    }
}
