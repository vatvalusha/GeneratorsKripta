package com.company.librarian;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 12.09.2016.
 */
public class Librarian {
    public ArrayList<Integer> getSequence() throws IOException {
        ArrayList<Integer> seq = new ArrayList();
        File text = new File("src/1.txt");
        FileInputStream in = new FileInputStream(text);
        while ( in.read() != -1  ){
            String temp = new String(Integer.toBinaryString(in.read()));
            if( temp.length() != 8){
                while(temp.length() != 8){
                    temp = "0"+temp;
                }
            }
            for(int i=0 ; i<8; i++){
                seq.add(Integer.valueOf(temp.substring(i, i+1)));
            }
        }
        return seq;
    }
}
