package testGenerators;

import com.company.*;
import com.company.LFSR.L20New;
import com.company.LFSR.L89New;
import com.company.Lehmer.LehmerHight;
import com.company.Lehmer.LehmerLow;
import com.company.jiffi.JiffyGenerator;
import com.company.jiffi.Register;
import com.company.librarian.Librarian;

import java.io.IOException;

/**
 * Created by user on 11.10.2016.
 */
public class UniformityBinarySeqTest {
    public static void main(String[] args) {
        UniformityBinarySequence binarySequence = new UniformityBinarySequence(25);
        binarySequence.setGenerateBytes(1000000);



//        JavaGenerator jg = new JavaGenerator();
//        binarySequence.test(jg);

//        JavaGenerator scr = new JavaGenerator();
//        System.out.println(scr.getClass().getSimpleName());
//        binarySequence.test(scr);
//
        L20New l20New = new L20New();
        System.out.println(l20New.getClass().getSimpleName());
        binarySequence.test(l20New);
//
//        L89New l89New = new L89New();
//        System.out.println(l89New.getClass().getSimpleName());
//        binarySequence.test(l89New);

//        L20 l20 = new L20();
//        probability.test(l20);
//        System.out.println(l20.getBytesOutput().size());
//        System.out.println(l20.getBytesOutput().size());
//        System.out.println(l20.getBytesOutput());
//
//        L89 l89 = new L89();
//        probability.test(l89);
//        System.out.println(l89.getBytesOutput().size());

//        LehmerHight lehmerHight = new LehmerHight();
//        System.out.println(lehmerHight.getClass().getSimpleName());
//        binarySequence.test(lehmerHight);
//
//        LehmerLow lehmerLow = new LehmerLow();
//        System.out.println(lehmerLow.getClass().getSimpleName());
////        binarySequence.test(lehmerLow);
//
//        Librarian librarian = null;
//
//        try {
//            librarian = new Librarian();
//            System.out.println(librarian.getClass().getSimpleName());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        binarySequence.test(librarian);
//
//        Register register1 = new Register(9);
//        Register register2 = new Register(10);
//        Register register3 = new Register(11);
//        JiffyGenerator jGen = new JiffyGenerator(register1, register2, register3);
//        System.out.println(jGen.getClass().getSimpleName());
//
//        jGen.getL1().setPol(1, 0, 1, 1, 0, 1, 1, 1, 1);             //from the smallest degree
//        jGen.getL2().setPol(1, 0, 0, 0, 0, 1, 0, 1, 0, 1);
//        jGen.getL3().setPol(1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1);
//
//        jGen.getL1().setValues(1, 0, 1, 1, 0, 1, 1, 1, 1 );
//        jGen.getL2().setValues(1, 0, 0, 1, 1, 1, 0, 1, 0, 1);
//        jGen.getL3().setValues(1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1);
//        binarySequence.test(jGen);
//
//        BBS bbs = new BBS();
//        System.out.println(bbs.getClass().getSimpleName());
//        binarySequence.test(bbs);
//
//        BBSBytes bbsBytes = new BBSBytes();
//        System.out.println(bbsBytes.getClass().getSimpleName());
//        binarySequence.test(bbsBytes);
//
//        BM bm = new BM();
//        System.out.println(bm.getClass().getSimpleName());
//        binarySequence.test(bm);
//
//
//        BMBytes bmBytes = new BMBytes();
//        System.out.println(bmBytes.getClass().getSimpleName());
//        binarySequence.test(bmBytes);
//
//        Wolfram wolfram = new Wolfram();
//        System.out.println(wolfram.getClass().getSimpleName());
//        binarySequence.test(wolfram);
    }
}
