package testGenerators;

import com.company.JavaGenerator;
import com.company.jiffi.TestGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        JavaGenerator jg = new JavaGenerator();

        IndependenceOfCharacters Tg = new IndependenceOfCharacters();
        List<Integer> list = new ArrayList<>();
        list = jg.generatorB(1000000);
//        System.out.println(Tg.findStatistics(jg.generatorB(100000)));
        Tg.fillStatistics();
        System.out.println(Tg.getFrequency());
//        Tg.countStatistics(list);
        System.out.println(Tg.getFrequency());
        Tg.countStatForFirstByte();
        System.out.println(Tg.getFrequency());

    }
}
