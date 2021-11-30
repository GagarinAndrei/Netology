import ru.netology.taxtypes.IncomeTaxType;
import ru.netology.taxtypes.ProgressiveTaxType;
import ru.netology.taxtypes.VATaxType;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("1000.0"), new IncomeTaxType(), new TaxService()),
                new Bill(new BigDecimal("1000.0"), new VATaxType(), new TaxService()),
                new Bill(new BigDecimal("1000.0"), new ProgressiveTaxType(), new TaxService())
        };

        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}

