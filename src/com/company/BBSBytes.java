package com.company;

import java.math.BigInteger;

/**
 * Created by user on 18.09.2016.
 */
public class BBSBytes extends BBS {
    public BBSBytes(){
        super();
    }

    @Override
    public void findX(){
        x = r.mod(new BigInteger("256"));
    }
}
