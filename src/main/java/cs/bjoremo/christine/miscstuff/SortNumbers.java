package cs.bjoremo.christine.miscstuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SortNumbers extends LotteryNumbers{

    public List<Integer> numericalOrder(){
        List<Integer> lottoRowList = generateList();
        Set<Integer> lottoRowSet = generateSet();
        List<Integer> lottoListSet = new ArrayList<>(lottoRowSet);

        Collections.sort(lottoRowList);
        Collections.sort(lottoListSet);

        System.out.println(lottoListSet);

        return lottoListSet;
    }

}
