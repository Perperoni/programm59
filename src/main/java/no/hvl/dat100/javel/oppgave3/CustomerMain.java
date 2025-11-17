package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // Create a customer
        Customer c = new Customer(
                "Ola Nordmann",
                "ola@nordmann.no",
                12345,
                PowerAgreementType.SPOT
        );

        // Test getters
        System.out.println("Navn: " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("ID: " + c.getCustomer_id());
        System.out.println("Avtale: " + c.getAgreement());

        System.out.println();

        // Test setters
        c.setName("Kari Nordmann");
        c.setAgreement(PowerAgreementType.NORGESPRIS);

        // Test toString
        System.out.println(c.toString());
    }
}
