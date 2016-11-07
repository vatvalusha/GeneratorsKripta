package com.company.jiffi;

/**
 * Created by user on 17.09.2016.
 */
public class TestGenerator {
    public static void main(String[] args) {
        Register register1 = new Register(9);
        Register register2 = new Register(10);
        Register register3 = new Register(11);
        JiffyGenerator jGen = new JiffyGenerator(register1, register2, register3);

        jGen.getL1().setPol(1, 0, 1, 1, 0, 1, 1, 1, 1);             //from the smallest degree
        jGen.getL2().setPol(1, 0, 0, 0, 0, 1, 0, 1, 0, 1);
        jGen.getL3().setPol(1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1);


        jGen.getL1().setValues(1, 0, 1, 1, 0, 1, 1, 1, 1 );
        jGen.getL2().setValues(1, 0, 0, 1, 1, 1, 0, 1, 0, 1);
        jGen.getL3().setValues(1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1);


        System.out.println("Jiffy: ");
        System.out.println(jGen.generatorB(100000));

//        System.out.println(jGen.getOutput());
//        System.out.println(jGen.getGamma());


    }
}
