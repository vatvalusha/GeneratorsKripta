package com.company;

import util.BitConverter;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 18.09.2016.
 */
public class BBS implements Generator {
    BigInteger p;
    BigInteger q;
    BigInteger n;
    BigInteger r;
    BigInteger x;
    List<Integer> out;

    public BBS(){
        Random random = new Random();
        out = new ArrayList<>();
        r = new BigInteger(random.nextInt() + 2 + "");
//        r = new BigInteger("10");
        String p1 = "0D5BBB96D30086EC484EBA3D7F9CAEB07";
        String q1 = "425D2B9BFDB25B9CF6C416CC6E37B59C1F";
        p = new BigInteger(p1, 16);
        q = new BigInteger(q1, 16);
        this.n = p.multiply(q);
    }

    public void generatorBBS(int m) {
        for (int i = 0; i < m; i++) {
            r = r.multiply(r).mod(n);
            out.add(findX());
        }
    }
    public int findX(){
        x = r.mod(new BigInteger("2"));
        return x.intValue();
    }

    public List<Integer> getOut(){
        return out;
    }

    public List<Integer> getBytesOutput() {
        return BitConverter.getBytesOutput(out);
    }


    @Override
    public List<Integer> generatorB(int m) {
        generatorBBS(m*8);
        return getBytesOutput();
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
