package com.company.LFSR;

/**
 * Created by user on 11.10.2016.
 */
public class TestLFSR {
    public static void main(String[] args) {
        L20New l20New = new L20New();
        System.out.println(l20New.generatorB(100));

        L89New l89New = new L89New();
        System.out.println(l89New.generatorB(100));
    }
}
