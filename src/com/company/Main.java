package com.company;

import com.company.jiffi.JiffyGenerator;
import com.company.jiffi.Register;
import com.company.librarian.Librarian;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        //JavaGenerator-------------------------------------------------
        System.out.println("JavaGenerator");
        JavaGenerator jg = new JavaGenerator();
        System.out.println(jg.generatorB(1000));
//
////        //L20------------------------------------------------------------
//        System.out.println("L20:");
//        L20 l20 =new L20();
//        l20.generatorL20(1000);
//        System.out.println(l20.generatorB(1000));
////
////        //L89------------------------------------------------------------
//        System.out.println("L89:");
//        L89 l89 = new L89();
//        System.out.println(l89.generatorB(10000));
//
////        //Wolfram------------------------------------------------------
//        System.out.println("Wolfram:");
//        Wolfram wolfram = new Wolfram();
//        System.out.println(wolfram.getR());
////        wolfram.getRandomWolfram(100);
//        System.out.println(wolfram.generatorB(10000));
////        System.out.println(wolfram.getOutput());
//////        System.out.println(1 & 1);
////        //Librarian------------------------------------------------------
//////
//        System.out.println("Librarian: ");
//        Librarian librarian = new Librarian();
//        System.out.println(librarian.getSeq().size());
//        System.out.println(librarian.generatorB(1).size());

        System.out.println("HH");
        Map map = new HashMap<>();
        List list = new ArrayList<>();
        for(int i = 0; i<1000; i++){
//            map.put(i,0);
            list.add(i,0);
        }
        System.out.println(list);

//        //BM-------------------------------------------------------------

//        BM bm = new BM();
//        BMBytes bm1 = new BMBytes();
//        System.out.println(" Bluma-Mikali:");
//        System.out.println(bm.generatorB(1000));
//        System.out.println(bm.getOut().size());
//        System.out.println(bm.verificationT());
//        System.out.println(bm1.verificationT());
//        System.out.println(bm1.getOut());
//            bm1.generatorBM(1000);
//
//        System.out.println(bm1.generatorB(10000));
//        System.out.println(bm1.getOut().size());
//        System.out.println(bm1.verificationT());
//        System.out.println(" Bluma-Mikali bytes:");
//        System.out.println(bm1.generatorB(10000));
//        //BBS--------------------------------------------------------------------
/*        BBS bbs = new BBS();
//        bbs.generatorBBS(10000);
        System.out.println("Blum-Bluma-Shuba:");
        System.out.println(bbs.generatorB(10000));
//        bbs.writeResult();
        BBS bbsb = new BBSBytes();
        System.out.println("(Blum-Bluma-Shuba bytes:");
        System.out.println(bbsb.generatorB(10000));
*/
    }
}
