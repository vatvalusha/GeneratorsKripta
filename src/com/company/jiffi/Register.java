package com.company.jiffi;

/**
 * Created by user on 12.09.2016.
 */
public class Register {
    private int s[];
    private int a[];
    private int sNext;

    public Register(int size){
        s = new int [size];
        a = new int [size];
    }

    public int move(){
        int out = s[0];
        calcsNext();
        int i = 0;
        while(i != s.length - 1){
            s[i] = s[i + 1];
            i++;
        }
        s[i] = sNext;
        calcsNext();
        return out;
    }

    public void calcsNext(){
        sNext = 0;
        for(int i = 0; i < s.length; i++){
            sNext += s[i] * a[i];
        }
        sNext %= 2;
    }

    public void setPol(int...values){
        if(values.length != s.length){
            throw new UnsupportedOperationException();
        }
        a = values;
    }

    public void setValues(int...values){
        if(values.length != s.length){
            throw new UnsupportedOperationException();
        }
        s = values;
    }

    public int getS(int index){
        return s[index];
    }

    public int getsNext(){
        return sNext;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i < s.length; i++){
            result += String.valueOf(s[i]);
        }
        return result;
    }
}
