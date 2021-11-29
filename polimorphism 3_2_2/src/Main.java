import ru.netology.taxtypes.IncomeTaxType;
import ru.netology.taxtypes.ProgressiveTaxType;
import ru.netology.taxtypes.VATaxType;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(1000.0, new IncomeTaxType(), new TaxService()),
                new Bill(1000.0, new VATaxType(), new TaxService()),
                new Bill(1000.0, new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}

