package com.company.librarian;

import com.company.Generator;
import util.BitConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public class Librarian implements Generator{
    private List<Integer> seq;
//    File text;

    public Librarian() throws IOException {
//        text = new File("src/1.txt");
        getSequence();
    }
    public List<Integer> getSequence() throws IOException {
        seq = new ArrayList();
        File text = new File("src/1.txt");
        FileInputStream in = new FileInputStream(text);
        int count = 0;
        int b = in.read();

        while ( b != -1  ){
            count++;
            String temp = new String(Integer.toBinaryString(b));
            if( temp.length() != 8){
                while(temp.length() != 8){
                    temp = "0"+temp;
                }
            }
            for(int i=0 ; i<8; i++){
                seq.add(Integer.valueOf(temp.substring(i, i+1)));
            }
            b = in.read();
        }
        return seq;
    }

    public List<Integer> getSeq(){
        return seq;
    }
    public List<Integer> getBytesOutput() {
        return BitConverter.getBytesOutput(getSeq());
    }
    @Override
    public List<Integer> generatorB(int m) {
        int c = m;
        return getBytesOutput();
    }
}
