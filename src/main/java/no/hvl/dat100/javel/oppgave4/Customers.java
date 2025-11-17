package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for (Customer c : customers) {
            if (c != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for (Customer cust : customers) {
            if (cust != null && cust.getCustomer_id() == customer_id) {
                c = cust;
                break;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {

            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer removed = null;

        for (int i = 0; i < customers.length; i++) {

            if (customers[i] != null &&
                    customers[i].getCustomer_id() == customer_id) {

                removed = customers[i];
                customers[i] = null;   // remove by setting to null
                break;
            }
        }

        return removed;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        // return a COPY of the array to avoid external direct access
        Customer[] copy = new Customer[customers.length];

        for (int i = 0; i < customers.length; i++) {
            copy[i] = customers[i];
        }

        return copy;
    }
}
