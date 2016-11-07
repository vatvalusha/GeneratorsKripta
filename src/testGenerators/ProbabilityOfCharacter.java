package testGenerators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 10.10.2016.
 */
public class ProbabilityOfCharacter extends TestGenerators {
    Map<Integer, Integer> freq;
    public ProbabilityOfCharacter(){
        this.l = 255;
    }


    public List ppp() {
        List list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
//            map.put(i,0);
            list.add(i, 0);
        }
        return list;
//  System.out.println(list);
    }

    public double findStatistics(List<Integer> sequence) {
        freq = new HashMap<>();
        for(int i = 0; i<256;i++ ){
            freq.put(i,0);
        }
        for(int i: sequence){
            freq.put(i,freq.get(i)+1);
        }
        double n = (double)sequence.size()/256;
        double sum = 0;
        for(int v:freq.values()){
            sum +=((v-n)*(v-n))/n;
        }

        return sum;
    }
}
