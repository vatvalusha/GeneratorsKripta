package kripta_laba2;

import com.company.JavaGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 07.11.2016.
 */
public class SimpleNumber {
    List<Integer> list = new ArrayList<>();
    JavaGenerator jg = new JavaGenerator();
    public void b(){
       list = jg.generatorB(1000);
    }



}
