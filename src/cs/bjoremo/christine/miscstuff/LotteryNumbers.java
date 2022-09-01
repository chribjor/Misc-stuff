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
        Set<Integer> lotteryRow = new HashSet<>();

        //slumpa 7 olika nummer som ska sparas i settet.
        while (lotteryRow.size() < 7) {
            int number = rand.nextInt(max + 1 - 1) + min;

            lotteryRow.add(number);
        }
        //Skriv ut hela settet/lottoraden
        System.out.println("This is your lotto row: " + lotteryRow);
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
        System.out.println("This is your lotto row: " + lottoRow);
        return lottoRow;
    }

    public void generateArray() {
        int[] lottoArray = new int[7];
        int pointer = 0; //pekar på nästa nummers plats i arrayen
        boolean isRepeated = false;

        do {
            int number = rand.nextInt(max + 1 - 1) + min;
            for (int i = 0; i <= pointer; i++) {
                if (number == lottoArray[i]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                lottoArray[pointer] = number;
                pointer++;
            }
        } while (lottoArray[6] == 0);
        System.out.println(Arrays.toString(lottoArray));
    }

    public Map<Integer, Integer> generateMap() {
        HashMap<Integer, Integer> lottoMap = new HashMap<>();
        int size = 0;

        while (lottoMap.size() < 7) {
            Integer hej = rand.nextInt(max + 1 - 1) + min;

            if (!lottoMap.containsValue(hej)) {
                lottoMap.put(size, hej);
                size++;
            }
        }
        System.out.println("This is your lotto row: " + lottoMap);
        return lottoMap;
    }
}
