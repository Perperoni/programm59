package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        for (Invoice inv : invoices) {

            if (inv != null) {
                inv.computeAmount();
                inv.printInvoice();
            }
        }
    }
}
