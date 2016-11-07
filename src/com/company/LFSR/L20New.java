package com.company.LFSR;

import com.company.Generator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class L20New  extends LFSR implements Generator{
    public L20New() {
        super(20, 17, 15, 11, 0);
    }
    public List ppp() {
        List list = new ArrayList<>();
        for(
                int i = 0;
                i<1000;i++)

        {
            //            map.put(i,0);
            list.add(i, 0);
        }
        return list;
//    System.out.println(list);
    }

    @Override
    public List<Integer> generatorB(int m)


    {

        generateRandomNumbers(m);
        return getGeneratedRandomNumbers();
        //return ppp();

    }
}
