package ru.netology.taxtypes;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.doubleValue() <= 100000.0) {
            return amount.multiply(BigDecimal.valueOf(0.1));
        } else if (amount.doubleValue() > 100000) {
            return amount.multiply(BigDecimal.valueOf(0.15));
        } else {
            return BigDecimal.valueOf(0.0);
        }

    }
}