package cs.bjoremo.christine.miscstuff;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LotteryNumbers lb = new LotteryNumbers();
        FunWithNumbers fwn = new FunWithNumbers();
        SortNumbers sn = new SortNumbers();
        TextUI ui = new TextUI();

       // System.out.println(lb.generateSet());
        //System.out.println(lb.generateList());
       // System.out.println(Arrays.toString(lb.generateArray()));
        //System.out.println(fwn.canDivideEvenly(9, 3));
       // System.out.println(sn.numericalOrder());
        //System.out.println(sn.generateMap());
        System.out.println("Welcome to Gambling With Numbers!\nLet's play some Lottery!\n");
        System.out.println(ui.startLotto());
    }
}