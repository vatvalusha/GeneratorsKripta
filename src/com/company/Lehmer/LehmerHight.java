package com.company.Lehmer;

import com.company.Generator;
import util.BitConverter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17.09.2016.
 */
public class LehmerHight implements Generator {

    private final long a = 65537;
    private final long m = 4294967296L;
    private final long c = 119;
    private List<Integer> list = new ArrayList();
    private long xn = 3453465L;
    List<Integer> out = new ArrayList<>();
    public String getNextSet(){
        String buff;
        long xnNext = ((a * xn) + c) % m;
        xn = xnNext;
        buff = Long.toBinaryString(xnNext);
        if(buff.length() != 32){
            while(buff.length() != 32){
                buff = "0" + buff;
            }
        }
        return buff.substring(0, 8);
    }

    public List getSequence(int times){
        String line;
        for(int i = 0; i < times; i++){
            line = getNextSet();
            for(int j = 0; j < 8; j++){
                list.add(Integer.valueOf(line.substring(j, j + 1)));
            }
        }
        return list;
    }

    public List<Integer> getBytesOutput() {
        return BitConverter.getBytesOutput(list);
    }
    @Override
    public List<Integer> generatorB(int m) {
        getSequence(m);
        return getBytesOutput();
    }
    protected List getOut(){
        return list;
    }
    public void writeResult(){
        try(FileWriter writer = new FileWriter("src/result/LehmerHight.txt")) {
            writer.write(String.valueOf(list));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
