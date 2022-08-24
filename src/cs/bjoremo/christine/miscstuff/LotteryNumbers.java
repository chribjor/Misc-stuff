package cs.bjoremo.christine.miscstuff;

import java.util.*;

public class LotteryNumbers {

    Random rand = new Random();
    int min = 1;
    int max = 35;

    // olika metoder som generar olika lottorader
    public Set<Integer> generateSet() {
        //Skapar ett set där lottoraden ska förvaras
        // Set<> tillåter inga dubbletter av element, därför behövs inte kontroll göras
        Set<Integer> lotteryRow = new HashSet<Integer>();

        //slumpa 7 olika nummer som ska sparas i settet.
        while (lotteryRow.size() <7) {
            int number = rand.nextInt(max + 1 - 1) + min;

            if (!lotteryRow.contains(number)){
                lotteryRow.add(number);
            }
        }
        //Skriv ut hela settet/lottoraden
        return lotteryRow;
    }

    public List<Integer> generateList() {
        List<Integer> lottoRow = new ArrayList<>();

        while (lottoRow.size() < 7) {
            int number = rand.nextInt(max + 1 - 1) + min;

            if (!lottoRow.contains(number)) {
                lottoRow.add(number);
            }
        }
        return lottoRow;
    }
}
