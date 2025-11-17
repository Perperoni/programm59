package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Totalt forbruk: " +
                MonthlyPower.computePowerUsage(power_usage_month));

        System.out.println("Over 5000 kWh? " +
                MonthlyPower.exceedThreshold(power_usage_month, 5000));

        System.out.println("Spot pris: " +
                MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println("Strømstøtte: " +
                MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));

        System.out.println("Norgespris: " +
                MonthlyPower.computeNorgesPrice(power_usage_month));


    }
}