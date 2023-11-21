package com.switchfully.dicer;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;

public class DicerApplication {

    private static final int START_INCLUSIVE = 1;
    private static final int END_EXCLUSIVE = 7;

    public static void main(String[] args) {
        ArrayList<Integer> diceRolls = Lists.newArrayList(
                RandomUtils.nextInt(START_INCLUSIVE, END_EXCLUSIVE),
                RandomUtils.nextInt(START_INCLUSIVE, END_EXCLUSIVE),
                RandomUtils.nextInt(START_INCLUSIVE, END_EXCLUSIVE));

        diceRolls.forEach(diceRoll -> System.out.println("Rolled " + diceRoll));
    }
}
