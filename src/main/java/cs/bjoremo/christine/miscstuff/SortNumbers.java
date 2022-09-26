package cs.bjoremo.christine.miscstuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SortNumbers extends LotteryNumbers{

    public List<Integer> numericalOrder(){
        Set<Integer> lottoRowSet = generateSet(1,50, 10);
        List<Integer> lottoListSet = new ArrayList<>(lottoRowSet);

        Collections.sort(lottoListSet);

        System.out.println(lottoListSet);

        return lottoListSet;
    }

}
