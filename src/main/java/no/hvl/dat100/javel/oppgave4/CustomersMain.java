package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Create a Customers object (capacity 5)
        Customers list = new Customers(5);

        // Create some customers
        Customer c1 = new Customer("Ola", "ola@test.no", 1, PowerAgreementType.SPOT);
        Customer c2 = new Customer("Kari", "kari@test.no", 2, PowerAgreementType.NORGESPRIS);
        Customer c3 = new Customer("Per", "per@test.no", 3, PowerAgreementType.SPOT);

        // Test addCustomer
        list.addCustomer(c1);
        list.addCustomer(c2);
        list.addCustomer(c3);

        System.out.println("Antall kunder etter addCustomer: " + list.countNonNull());
        System.out.println();

        // Test getCustomer
        System.out.println("Henter kunde med ID 2:");
        System.out.println(list.getCustomer(2));
        System.out.println();

        // Test removeCustomer
        System.out.println("Fjerner kunde med ID 1:");
        Customer removed = list.removeCustomer(1);
        System.out.println("Fjernet: " + removed);
        System.out.println("Antall kunder nå: " + list.countNonNull());
        System.out.println();

        // Test getCustomers
        System.out.println("Innhold i kundelisten:");
        for (Customer c : list.getCustomers()) {
            System.out.println(c);
        }
    }
}
