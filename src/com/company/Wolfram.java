package com.company;

import util.BitConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public class Wolfram implements Generator{
    long r = 1;
    int next;

    private List<Integer> output;

    public Wolfram(){
        output = new ArrayList<>();
        setR();
    }

    public  void getRandomWolfram(int n){
        for(int i =0; i<n;i++) {
            output.add((int)(r & 1));
            r = (cycleLeftShift(r))^(r | (r >>> 1));
        }
    }
    private long cycleLeftShift(long shift) {
        long last = (shift >> 31) & 1;
        long began = (shift << 1);
        long result = began | last;
        return result;
    }
//    private long cycleRightShift(long shift) {
//        long last = (shift << 31) & 1;
//        long began = (shift >> 1);
//        long result = began | last;
//        return result;
//    }

    public List<Integer> getOutput() {
        return output;
    }

    public List<Integer> getBytesOutput() {
        return BitConverter.getBytesOutput(output);
    }
    @Override
    public List<Integer> generatorB(int m) {
        getRandomWolfram(m);
        return getBytesOutput();
    }
    public void setR(){
        r =(int)(Math.random()*100+50);
    }
    public long getR(){
        return r;
    }
}
