package cs.bjoremo.christine.miscstuff;

import java.util.*;

public class LotteryNumbers {

    Random rand = new Random();

    // olika metoder som generar olika lottorader
    public Set<Integer> generateSet(int minNumber, int maxNumber, int quantity) {
        //Skapar ett set där lottoraden ska förvaras
        // Set<> tillåter inga dubbletter av element, därför behövs inte kontroll göras
        Set<Integer> lotteryRow = new HashSet<>();

        //slumpa 7 olika nummer som ska sparas i settet.
        while (lotteryRow.size() < quantity) {
            int number = rand.nextInt(maxNumber + 1 - 1) + minNumber;

            lotteryRow.add(number);
        }
        //Skriv ut hela settet/lottoraden
        System.out.println("This is your lotto row: " + lotteryRow);
        return lotteryRow;
    }

    public List<Integer> generateList(int minNumber, int maxNumber, int quantity) {
        List<Integer> lottoRow = new ArrayList<>();

        while (lottoRow.size() < quantity) {
            int number = rand.nextInt(maxNumber + 1 - 1) + minNumber;

            if (!lottoRow.contains(number)) {
                lottoRow.add(number);
            }
        }
        System.out.println("This is your lotto row: " + lottoRow);
        return lottoRow;
    }

    public int[] generateArray(int minNumber, int maxNumber, int quantity) {
        int[] lottoArray = new int[quantity];
        int pointer = 0; //pekar på nästa nummers plats i arrayen
        boolean isRepeated = false;

        do {
            int number = rand.nextInt(maxNumber + 1 - 1) + minNumber;
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
        } while (lottoArray[quantity-1] == 0);
        System.out.println(Arrays.toString(lottoArray));
        return lottoArray;
    }

    public Map<Integer, Integer> generateMap(int minNumber, int maxNumber, int quantity) {
        HashMap<Integer, Integer> lottoMap = new HashMap<>();
        int size = 0;

        while (lottoMap.size() < quantity) {
            Integer number = rand.nextInt(maxNumber + 1 - 1) + minNumber;

            if (!lottoMap.containsValue(number)) {
                lottoMap.put(size, number);
                size++;
            }
        }
        System.out.println("This is your lotto row: " + lottoMap);
        return lottoMap;
    }
}
