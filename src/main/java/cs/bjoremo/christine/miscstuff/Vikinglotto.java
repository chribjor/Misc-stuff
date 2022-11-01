package cs.bjoremo.christine.miscstuff;

import java.util.List;
import java.util.Set;

public class Vikinglotto extends LotteryNumbers{

    private final Set<Integer> ordinaryNumber;
    private final List<Integer> vikingNumber;

    public Vikinglotto(){
        super(1,48,11);
        ordinaryNumber = generateSet();
        vikingNumber = generateList();
    }

    public Set<Integer> getOrdinaryNumber() {
        System.out.println(ordinaryNumber);
        return ordinaryNumber;
    }

    public List<Integer> getVikingNumber() {
        System.out.println(vikingNumber);
        return vikingNumber;
    }
}
