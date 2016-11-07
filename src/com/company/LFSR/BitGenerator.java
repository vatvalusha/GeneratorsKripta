package com.company.LFSR;

/**
 * Created by user on 11.10.2016.
 */
public abstract class BitGenerator extends Gen {
    @Override
    public int generateRandomNumber() {
        return generateByte();
    }

    public int generateByte() {
        int result = 0;
        for (int i = 0; i < 8; i++) {
            result ^= (generateRandomBit() << i);
        }

        return result;
    }

    public abstract int generateRandomBit();
}
