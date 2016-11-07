package testGenerators;

import java.util.ArrayList;
import java.util.List;
import com.company.Generator;

/**
 * Created by user on 09.10.2016.
 */
public abstract class TestGenerators {
    public static final double Qua0_01= 2.32;
    public static final double Qua0_05 = 1.645;
     public static final double Qua0_1 = 1.26;
    private int generateBytes = 1000000;
    protected int l;

    public void test(Generator generetor) {

//        System.out.println(list);
        List<Integer> sequence = generetor.generatorB(generateBytes);
        double statistic = findStatistics(sequence);
        boolean statisticQ0_01 = (statistic < getLimit(Qua0_01));
        boolean statisticQ0_05 = (statistic < getLimit(Qua0_05));
        boolean statisticQ0_1 = (statistic < getLimit(Qua0_1));
        System.out.println("a = 0.01: " + statistic + " < " + getLimit(Qua0_01)
                + " : " + (statisticQ0_01));
        System.out.println("a = 0.05: " + statistic + " < " + getLimit(Qua0_05)
                + " : " + (statisticQ0_05));
        System.out.println("a = 0.1: " + statistic + " < " + getLimit(Qua0_1)
                + " : " + (statisticQ0_1));
        System.out.println();
    }

    public void setGenerateBytes(int generateBytes) {
        this.generateBytes = generateBytes;
    }

    public int getGenerateBytes() {
        return generateBytes;
    }


    public abstract double findStatistics(List<Integer> sequence);

    public double getLimit(double quantile) {
        return Math.sqrt(2*getL())*quantile + getL();
    }

    public int getL() {
        return l;
    }
}
