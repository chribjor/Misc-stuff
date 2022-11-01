package cs.bjoremo.christine.miscstuff;

import java.util.List;
import java.util.Random;

public class Keno extends LotteryNumbers{
    private final List<Integer> kenoNumbers;
    private final int kingKeno;

    public Keno() {
        super(1, 70, 20);
        kenoNumbers = generateList();
        Random rand = new Random();
        kingKeno = kenoNumbers.get(rand.nextInt(kenoNumbers.size()));
    }

    public List<Integer> getKenoNumbers(){
        System.out.println(kenoNumbers);
        return kenoNumbers;
    }

    public int getKingKeno(){
        System.out.println(kingKeno);
        return kingKeno;
    }
}
