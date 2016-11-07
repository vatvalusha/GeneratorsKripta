package com.company.Lehmer;

/**
 * Created by user on 18.09.2016.
 */
public class MainLehmer {
    public static void main(String[] args) {
        //LehmerLow--------------------------------------------------
        System.out.println("LehmerLow:");
        LehmerLow lehmerLow = new LehmerLow();
        System.out.println(lehmerLow.generatorB(10000));
//        lehmerLow.writeResult();
//
//        int c = 0;
//        String f = String.valueOf(c);
//        System.out.println("1"+f);

        //LehmerHight--------------------------------------------------
        System.out.println("LehmerHight: ");
        LehmerHight lehmerHight = new LehmerHight();
        System.out.println(lehmerHight.generatorB(10000));
//        lehmerHight.writeResult();

    }
}
