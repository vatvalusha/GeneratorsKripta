package testGenerators;

import java.util.*;

/**
 * Created by user on 09.10.2016.
 */
public class IndependenceOfCharacters extends TestGenerators {
    Map<Integer,Integer> frequency;
    Map<Integer, Integer> firstByteCounts;
    Map<Integer, Integer> secondByteCounts;

    public IndependenceOfCharacters() {
        this.l = 255*255;
    }


    public Map<Integer, Integer> getFrequency() {
        return frequency;
    }

     public void fillStatistics(){
         frequency = new HashMap<Integer, Integer>();
         for (int i = 0; i < 256*256; i++) {
             frequency.put(i, 0);
         }
     }
    public Map<Integer, Integer> countStatistics(List<Integer> seq){
        for (int i = 0; i < seq.size() - 1; i=i+2) {
            int pairs = seq.get(i)+seq.get(i+1)*256;
            frequency.put(pairs, (frequency.get(pairs) + 1));
        }
        return frequency;
    }
    public int firstByteAppear(Map<Integer, Integer> frequency, int byteValue) {
        int count = 0;
        for (int i = byteValue; i < frequency.size(); i += 256) {
            count += frequency.get(i);
        }
        return count;
    }

    public void countStatForFirstByte(){
        firstByteCounts = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            firstByteCounts.put(i, firstByteAppear(frequency, i));
        }
    }
    public void countStatForSecondByte(){
        secondByteCounts = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            secondByteCounts.put(i, secondByteAppear(frequency, i));
        }
    }
    public int secondByteAppear(Map<Integer, Integer> frequency, int byteValue) {
        int count = 0;
        for (int j = byteValue*256; j < byteValue*256 + 256; j++) {
            count += frequency.get(j);
        }
        return count;
    }

    public double findStatistics(List<Integer> seq){
        fillStatistics();
        // count statistics
        countStatistics(seq);
        countStatForFirstByte();
        countStatForSecondByte();
        // count frequency
        double sum = 0;
        int n = seq.size()/2;
        for(int j = 0; j < 255; j++) {
            double sumByFirstByte = 0;
            for(int i = 0; i < frequency.size(); i++) {
                if(frequency.get(i)==0) {
                    continue;
                }
                if(i%256 == j) {
                    sumByFirstByte += ((double)frequency.get(i)*frequency.get(i))
                            / (double)secondByteCounts.get(i/256);
                }
            }
            if (sumByFirstByte == Double.NaN || sumByFirstByte == 0) {
                continue;
            }
            sum += sumByFirstByte / firstByteCounts.get(j);
        }
        double result = n*(sum - 1);
        return Double.valueOf(result).intValue();
    }

}
