package com.company.Lehmer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.10.2016.
 */
abstract public class Lehmer {
    protected final long a;
    protected final long m;
    protected final long c;
    protected long xn;

    public List<Integer> getList() {
        return list;
    }


    List<Integer> list;
    public Lehmer(long a, long m, long c, ArrayList<Integer> list, long xn){
        this.a = a = 65537;
        this.m = m = 4294967296L;
        this.c = c = 119;
        this.list = list = new ArrayList();
        this.xn = xn = 3453465L;
    }
    abstract public String getNextSet();
    abstract public List getSequence(int times);
}
