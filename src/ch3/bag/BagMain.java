package ch3.bag;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagMain {
    public static void main(String args[]) {
        //edu.princeton.cs.algs4.Bag<Double> numbers = new edu.princeton.cs.algs4.Bag<Double>();

        MyBag<Double> numbers = new MyBagImpl<Double>();
        try {
            while (!StdIn.isEmpty()) {
                double number = StdIn.readDouble();
                numbers.add(number);
            }
        } catch (Exception e) {
        }

        int n = numbers.size();

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / n;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double variance = sum / n;
        double std = Math.sqrt(sum / (n));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Variance: %.2f\n", variance);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
