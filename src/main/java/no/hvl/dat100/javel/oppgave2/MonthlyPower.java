package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int day = 0; day < usage.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            // bruk metoden fra oppgave 1
            DailyPower.printPowerUsage(usage[day]);

            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int day = 0; day < prices.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            DailyPower.printPowerPrices(prices[day]);

            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int d = 0; d < usage.length; d++) {
            for (int h = 0; h < usage[d].length; h++) {
                sum += usage[d][h];
            }
        }
        return sum;
    }

    // d) determine whether a threshold has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        double total = 0;
        int d = 0;

        while (d < powerusage.length && total <= threshold) {

            for (int h = 0; h < powerusage[d].length; h++) {
                total += powerusage[d][h];

                if (total > threshold) {
                    return true;
                }
            }

            d++;
        }

        return false;
    }

    // e) compute spot price (sum of usage * price)
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int d = 0; d < usage.length; d++) {
            for (int h = 0; h < usage[d].length; h++) {
                price += usage[d][h] * prices[d][h];
            }
        }

        return price;
    }

    // f) compute power support
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int d = 0; d < usage.length; d++) {
            for (int h = 0; h < usage[d].length; h++) {

                double spotpris = prices[d][h];

                // strømstøtte gis bare for pris over 0.70 kr
                if (spotpris > 0.70) {

                    // 90% støtte over 0.7
                    double overstigning = spotpris - 0.70;
                    double støttesats = overstigning * 0.90;

                    support += støttesats * usage[d][h];
                }
            }
        }

        return support;
    }

    // g) compute Norgespris (fastpris 0.70 kr/kWh)
    public static double computeNorgesPrice(double[][] usage) {

        double total = 0;

        for (double[] day : usage) {
            for (double u : day) {
                total += u;
            }
        }

        return total * 0.70;
    }
}
