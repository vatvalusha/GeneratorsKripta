package com.company;

import com.company.jiffi.JiffyGenerator;
import com.company.jiffi.Register;
import com.company.librarian.Librarian;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //JavaGenerator-------------------------------------------------
        JavaGenerator jg = new JavaGenerator();
        jg.javaGenerator(1000);
        System.out.println(jg.getList());

        //L20------------------------------------------------------------
        System.out.println("L20:");
        L20 l20 =new L20();
        for(int i = 0; i<1000000; i++){
            l20.getNext();
        }
        System.out.println(l20.toString());

        //L89------------------------------------------------------------
        System.out.println("L89:");
        L89 l89 = new L89();
        for(int i = 0; i<1000000; i++){
            l89.getNext();
        }
        System.out.println(l89.toString());

        //Wolfram------------------------------------------------------
        System.out.println("Wolfram:");
        Wolfram wolfram = new Wolfram();
        System.out.println(wolfram.getR());
        wolfram.getRandomWolfram(100);
        System.out.println(wolfram.getOutput());
        //Librarian------------------------------------------------------

        System.out.println("Librarian: ");
        Librarian librarian = new Librarian();
        try {
            System.out.println(librarian.getSequence());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //BM-------------------------------------------------------------

        BM bm = new BM();
        BM bm1 = new BMBytes();
        bm.generatorBM(30);
        System.out.println(" Bluma-Mikali:");
        System.out.println(bm.getOut());
//        System.out.println(bm1.verificationT());
        bm1.generatorBM(30);
        System.out.println(" Bluma-Mikali bytes:");
        System.out.println(bm1.getOut());
        //BBS--------------------------------------------------------------------
        BBS bbs = new BBS();
        bbs.generatorBBS(100);
        System.out.println("Blum-Bluma-Shuba:");
        System.out.println(bbs.getOut());
        bbs.writeResult();
        BBS bbsb = new BBSBytes();
        bbsb.generatorBBS(100);
        System.out.println("(Blum-Bluma-Shuba bytes:");
        System.out.println(bbsb.getOut());
    }
}
