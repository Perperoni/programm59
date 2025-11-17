package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;

    private double amount;

    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {

        switch (c.getAgreement()) {

            case SPOT:
                amount = MonthlyPower.computeSpotPrice(usage, prices);
                break;

            case SUPPORT:
                amount = MonthlyPower.computeSpotPrice(usage, prices)
                        - MonthlyPower.computePowerSupport(usage, prices);
                break;

            case NORGESPRIS:
                amount = MonthlyPower.computeNorgesPrice(usage);
                break;
        }
    }

    public void printInvoice() {
        System.out.println("---- Faktura ----");
        System.out.println("Kunde: " + c.getName());
        System.out.println("Epost: " + c.getEmail());
        System.out.println("Kunde-ID: " + c.getCustomer_id());
        System.out.println("Avtale: " + c.getAgreement());
        System.out.println("Måned: " + month);
        System.out.println("Beløp å betale: " + String.format("%.2f", amount) + " NOK");
        System.out.println("-----------------");
        System.out.println();
    }

    public double getAmount() {
        return amount;
    }
}
