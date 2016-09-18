package com.company;

import java.math.BigInteger;

/**
 * Created by user on 18.09.2016.
 */
public class BMBytes extends BM {
    public BMBytes(){
        super();
    }

    BigInteger num = new BigInteger("256");

    @Override
    public Integer verificationT(){
        BigInteger bytes = ((getT().multiply(num)).divide(getP().subtract(one))).subtract(one);
        return bytes.intValue();
    }
}
