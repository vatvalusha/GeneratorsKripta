package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 09.10.2016.
 */
public class BitConverter {
    public static List<Integer> getBytesOutput(List<Integer> bitArray) {
        List<Integer> byteOutput = new ArrayList<>();
        int bytesInOutput = bitArray.size()/8;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bytesInOutput*8; i++) {
            if (i % 8 == 0) {
                if(i != 0) {
                    byteOutput.add(Integer.valueOf(builder.reverse().toString(), 2));
                }
                builder = new StringBuilder();
            }
            builder.append(bitArray.get(i));
        }
        return byteOutput;
    }
}
