package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 18.09.2016.
 */
public class BBS {
    BigInteger p;
    BigInteger q;
    BigInteger n;
    BigInteger r;
    BigInteger x;
    List<BigInteger> out;

    public BBS(){
        Random random = new Random();
        out = new ArrayList<>();
        r = new BigInteger(random.nextInt() + 2 + "");
//        r = new BigInteger("10");
        String p1 = "D5BBB96D30086EC484EBA3D7F9CAEB07";
        String q1 = "425D2B9BFDB25B9CF6C416CC6E37B59C1F";
        p = new BigInteger(p1, 16);
        q = new BigInteger(q1, 16);
        this.n = p.multiply(q);
    }

    public void generatorBBS(int m) {
        for (int i = 0; i < m; i++) {
            r = r.multiply(r).mod(n);
            findX();
            out.add(x);
        }
    }
    public void findX(){
        x = r.mod(new BigInteger("2"));
    }

    public List<BigInteger> getOut(){
        return out;
    }
    public void writeResult(){
        try(FileWriter writer = new FileWriter("src/result/BBS.txt")) {
            writer.write(String.valueOf(getOut()));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
