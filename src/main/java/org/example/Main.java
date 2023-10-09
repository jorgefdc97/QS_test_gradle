package org.example;

public class Main {
    public static void main(String[] args) {
        double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }
        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();

        for (double value : values) {
            System.out.println(value);
        }

        System.out.println("\nMean: " + mean + "\nMedian: " + median +
                "\nStandard deviation: " + standardDeviation);
    }
}