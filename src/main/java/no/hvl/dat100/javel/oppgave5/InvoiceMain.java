package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // create some customers
        Customer c1 = new Customer("Ola", "ola@test.no", 1, PowerAgreementType.SPOT);
        Customer c2 = new Customer("Kari", "kari@test.no", 2, PowerAgreementType.SUPPORT);
        Customer c3 = new Customer("Per", "per@test.no", 3, PowerAgreementType.NORGESPRIS);

        // load month data
        double[][] usage = MonthPowerData.powerusage_month;
        double[][] prices = MonthPowerData.powerprices_month;

        // create invoices
        Invoice i1 = new Invoice(c1, "Januar", usage, prices);
        Invoice i2 = new Invoice(c2, "Januar", usage, prices);
        Invoice i3 = new Invoice(c3, "Januar", usage, prices);

        Invoice[] invoiceList = { i1, i2, i3 };

        // process invoices
        Invoices.processInvoices(invoiceList);
    }
}
