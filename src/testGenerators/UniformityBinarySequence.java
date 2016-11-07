package testGenerators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 11.10.2016.
 */
public class UniformityBinarySequence extends TestGenerators{
    Map<Integer, Integer> generalFrequency;
    Map<Integer, Map<Integer, Integer>> rFrequency;
    Map<Integer, Integer> frequency;
    private int r;

    public UniformityBinarySequence(int r) {
        this.r = r;
        this.l = 255*(r - 1);
    }

    @Override
    public double findStatistics(List<Integer> seq) {
        return findStatistics(seq, r);
    }

    public void fillRFrequency(List<Integer> seq, int r){
        rFrequency = new HashMap<>();
        for (int i = 0; i < r; i++) {
            rFrequency.put(i, findRStatistic(seq, r, i));
        }
    }
    public void fillGenFrequency(){
        generalFrequency = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            generalFrequency.put(i, 0);
        }
    }

    public double findStatistics(List<Integer> seq, int r) {
        int m1 = seq.size() / r;
        fillRFrequency(seq,r);
        fillGenFrequency();
        for (int j = 0; j < r; j++) {
            for (int i = 0; i < 256; i++) {
                generalFrequency.put(i, generalFrequency.get(i) + rFrequency.get(j).get(i));
            }
        }
        double sum = 0;
        double result = 0;
        for (int j = 0; j < 256; j++) {
            double sumJ = 0;
            if(generalFrequency.get(j)==0) {
                continue;
            }
            for (int i = 0; i < r; i++) {
                int value = rFrequency.get(i).get(j);
                sumJ += value*value;
            }
            sum += sumJ / generalFrequency.get(j);
        }

        result = m1*r * (sum/m1 - 1);
        return result;
    }

    public void fillFrequency(){
        frequency = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            frequency.put(i, 0);
        }
    }
    private Map<Integer,Integer> findRStatistic(List<Integer> sequence, int r, int ind) {
        int m1 = sequence.size() / r;
        fillFrequency();
        int tempInd;
        for (int i = ind*m1; i < (ind+1)*m1; i++) {
            tempInd = sequence.get(i);
            frequency.put(tempInd, frequency.get(tempInd) + 1);
        }
        return frequency;
    }
}
