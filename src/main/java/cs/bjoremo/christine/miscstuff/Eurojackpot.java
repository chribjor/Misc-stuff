package cs.bjoremo.christine.miscstuff;

import java.util.Random;
import java.util.Set;

public class Eurojackpot extends LotteryNumbers {

    private final Set<Integer> ordinaryNumbers;
    private final int starNumbers;

    public Eurojackpot() {
        super(1, 50, 5);
        ordinaryNumbers = generateSet();
        Random rand = new Random();
        starNumbers = rand.nextInt(1 + 1 -1) +1;
    }

    public Set<Integer> getOrdinaryNumbers(){
        System.out.println(ordinaryNumbers);
        return ordinaryNumbers;
    }

    public int getStarNumbers(){
        System.out.println(starNumbers);
        return starNumbers;
    }
}
