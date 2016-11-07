package com.company.jiffi;

import com.company.Generator;
import util.BitConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public class JiffyGenerator implements Generator {
    private Register l1;
    private Register l2;
    private Register l3;
    private StringBuffer gamma;
    List<Integer> output = new ArrayList<>();

    public JiffyGenerator(Register l1, Register l2, Register l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.gamma = new StringBuffer();
    }

    public List<Integer> getOutput(){
        return output;
    }
    public int genZ(){
        int x = l1.move();
        int y = l2.move();
        int s = l3.move();

        int out = (s * x + ((1 + s) % 2) * y) % 2;
        gamma.append(out);
        output.add(out);
        return out;
    }

    public Register getL1(){
        return l1;
    }

    public Register getL2(){
        return l2;
    }

    public Register getL3(){
        return l3;
    }

    public void step(int n) {
        for (int i = 0; i < n; i++){
            genZ();
        }
    }
    public String getGamma() {
        return gamma.toString();
    }

    public List<Integer> getBytesOutput() {
        return BitConverter.getBytesOutput(output);
    }
    @Override
    public List<Integer> generatorB(int m) {
        step(m);
        return getBytesOutput();
    }
}
