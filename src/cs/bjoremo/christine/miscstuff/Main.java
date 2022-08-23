import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 35;

        //Skapar ett set där lottoraden ska förvaras
        Set<Integer> lotteryRow = new HashSet<Integer>();

        //slumpa 7 olika nummer som ska sparas i settet.
        for (int i = 0; i < 7; i++){
            //Lägger till random objekt i settet som består av en slumpad siffra mellan 1-35
            lotteryRow.add(rand.nextInt(max +1 - min) + min);
        }
        //Skriv ut hela settet/lottoraden
        System.out.println(lotteryRow);
    }
}