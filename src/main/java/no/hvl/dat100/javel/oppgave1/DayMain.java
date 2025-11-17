package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        double[] usage = DayPowerData.powerusage_day;
        double[] prices = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("a) Strømpriser:");
        DailyPower.printPowerPrices(prices);
        System.out.println();

        System.out.println("b) Strømforbruk:");
        DailyPower.printPowerUsage(usage);
        System.out.println();

        System.out.println("c) Totalt strømforbruk:");
        System.out.println(DailyPower.computePowerUsage(usage) + " kWh\n");

        System.out.println("d) Spotpris for dagen:");
        System.out.println(DailyPower.computeSpotPrice(usage, prices) + " NOK\n");

        System.out.println("e/f) Strømstøtte for dagen:");
        System.out.println(DailyPower.computePowerSupport(usage, prices) + " NOK\n");

        System.out.println("g) Norgespris:");
        System.out.println(DailyPower.computeNorgesPrice(usage) + " NOK\n");

        System.out.println("h) Time med høyest forbruk:");
        System.out.println(DailyPower.findPeakUsage(usage) + " kWh\n");

        System.out.println("i) Gjennomsnittlig forbruk:");
        System.out.println(DailyPower.findAvgPower(usage) + " kWh\n");
    }
}
