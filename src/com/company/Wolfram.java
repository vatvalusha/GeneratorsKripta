package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public class Wolfram {
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
            r = (r << 1) ^ (r | (r >>> 1));
        }
    }
    public List<Integer> getOutput() {
        return output;
    }

    public void setR(){
        r =(int)(Math.random()*100+50);
    }
    public long getR(){
        return r;
    }
}
