package com.company.Lehmer;

/**
 * Created by user on 18.09.2016.
 */
public class MainLehmer {
    public static void main(String[] args) {
        //LehmerLow--------------------------------------------------
        System.out.println("LehmerLow:");
        LehmerLow lehmerLow = new LehmerLow();
        System.out.println(lehmerLow.getSequence(10000));
        lehmerLow.writeResult();

        //LehmerHight--------------------------------------------------
        System.out.println("LehmerHight: ");
        LehmerHight lehmerHight = new LehmerHight();
        System.out.println(lehmerHight.getSequence(1000));
        lehmerHight.writeResult();

    }
}
