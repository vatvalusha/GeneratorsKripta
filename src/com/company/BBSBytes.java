package com.company;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by user on 18.09.2016.
 */
public class BBSBytes extends BBS{
    public BBSBytes(){
        super();
    }

    @Override
    public int findX(){
        x = r.remainder(new BigInteger("256"));
        return x.intValue();
    }
    @Override
    public List<Integer> generatorB(int m) {
        generatorBBS(m);
        return out;
    }
}
