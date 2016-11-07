package com.company;

import util.BitConverter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 18.09.2016.
 */
public class BMBytes implements Generator{
    BigInteger p;
    BigInteger a;
    BigInteger q;
    BigInteger t;

    BigInteger one;
    BigInteger two;
    List<Integer> out;

    public BMBytes(){
        Random random = new Random();
        out = new ArrayList<>();
        String p1 = "0CEA42B987C44FA642D80AD9F51F10457690DEF10C83D0BC1BCEE12FC3B6093E3";
        String a1 = "5B88C41246790891C095E2878880342E88C79974303BD0400B090FE38A688356";
        String q1 = "675215CC3E227D3216C056CFA8F8822BB486F788641E85E0DE77097E1DB049F1";
        p = new BigInteger(p1, 16);
        a = new BigInteger(a1, 16);
        q = new BigInteger(q1, 16);
        t = new BigInteger(String.valueOf(random.nextLong()));
        one = new BigInteger("1");
        two = new BigInteger("2");
    }
    public void generatorBMByte(int n){
        for(int i = 0; i < n; i++){
            t = a.modPow(t,p);
            out.add(verificationT());
        }
    }

    BigInteger num = new BigInteger("256");

    public Integer verificationT(){
        BigInteger bytes = (getT().multiply(num)).divide(getP().subtract(one));
        return bytes.intValue();
    }

    @Override
    public List<Integer> generatorB(int m) {
        generatorBMByte(m);
        return getOut();
    }
    public List<Integer> getOut(){
        return out;
    }
    public BigInteger getP() {
        return p;
    }

    public BigInteger getA() {
        return a;
    }

    public BigInteger getQ() {
        return q;
    }

    public BigInteger getT() {
        return t;
    }

    public BigInteger getOne() {
        return one;
    }

    public BigInteger getTwo() {
        return two;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public void setA(BigInteger a) {
        this.a = a;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public void setT(BigInteger t) {
        this.t = t;
    }

    public void setOne(BigInteger one) {
        this.one = one;
    }

    public void setTwo(BigInteger two) {
        this.two = two;
    }

    public void setOut(List<Integer> out) {
        this.out = out;
    }


}
