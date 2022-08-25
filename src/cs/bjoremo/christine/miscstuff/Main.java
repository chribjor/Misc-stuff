package cs.bjoremo.christine.miscstuff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        LotteryNumbers lb = new LotteryNumbers();
        FunWithNumbers fwn = new FunWithNumbers();

        System.out.println(lb.generateSet());
        System.out.println(lb.generateList());
        System.out.println(Arrays.toString(lb.generateArray()));
        System.out.println(fwn.divideNumbers(9, 3));
    }
}