package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 18.09.2016.
 */
public class JavaGenerator implements Generator {

    Random random;
    List<Integer> list;

    public JavaGenerator(){
        random = new Random();
        list = new ArrayList<>();
    }
    protected void javaGenerator(int n){
        for(int i = 0; i<n; i++){
            list.add((random.nextInt()%256+256)%256);
        }
    }
    protected List getList(){
        return list;
    }

    @Override
    public List<Integer> generatorB(int m) {
        javaGenerator(m);
        return getList();
    }
}
