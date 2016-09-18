package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 18.09.2016.
 */
public class JavaGenerator {

    Random random;
    List<Long> list;

    protected JavaGenerator(){
        random = new Random();
        list = new ArrayList<>();
    }
    protected void javaGenerator(int n){
        for(int i = 0; i<n; i++){
            list.add((random.nextLong()%256+256)%256);
        }
    }
    protected List getList(){
        return list;
    }
}
