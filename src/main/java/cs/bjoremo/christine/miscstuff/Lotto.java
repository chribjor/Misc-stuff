package cs.bjoremo.christine.miscstuff;

import java.util.Map;

public class Lotto extends LotteryNumbers{

    private final Map<Integer, Integer> lottoNumbers;

    public Lotto() {
        super(1, 35, 7);
        lottoNumbers = generateMap();
    }

    public Map<Integer, Integer> getLottoNumbers(){
        System.out.println(lottoNumbers);
        return lottoNumbers;
    }

}
