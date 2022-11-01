package cs.bjoremo.christine.miscstuff;

import java.util.Scanner;

public class TextUI  {

    private final Scanner in = new Scanner(System.in);
    private final Lotto lotto = new Lotto();
    private final Keno keno = new Keno();
    private final Eurojackpot euro = new Eurojackpot();
    private final Vikinglotto vikinglotto = new Vikinglotto();

    public void lottoMenu() {
        System.out.println("Which method do you want to play? Choose from the menu below:\n");
        System.out.println("1. Lotto with the help of a Map");
        System.out.println("2. Keno with the help of a List");
        System.out.println("3. Vikinglotto with the help of a Set");
        System.out.println("4. Eurojackpot with the help of an Array");
    }

    // private för att den behövs bara användas i denna klass. Ingen ska ändra på innehållet
    private int getValueFromUserInt() {
        String s = in.nextLine().trim();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect value! Please try again!\n");
            return -1;
        }
    }

    // private för att den behövs bara användas i denna klass. Ingen ska ändra på innehållet
    private String getValueFromUserString() {
        return in.nextLine().trim();
    }

    public void addName() {
        getValueFromUserString();
        startLotto();
    }

    public void startLotto() {
        int age = 0;

        while (true) {
            System.out.println("Please enter your age: ");
            age = getValueFromUserInt();
            if (age >= 18) {
                do {
                    lottoMenu();
                    int menuSelection = getValueFromUserInt();
                    String thankYou = "\nThank you for playing!";
                    String lotteryrowText = "\nThis is your lotteryrow:";
                    switch (menuSelection) {
                        case 1 -> {
                            System.out.println(lotteryrowText);
                            lotto.getLottoNumbers();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 2 -> {
                            System.out.println(lotteryrowText);
                            keno.getKenoNumbers();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 3 -> {
                            System.out.println(lotteryrowText);
                            vikinglotto.getOrdinaryNumber();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 4 -> {
                            System.out.println(lotteryrowText);
                            euro.getOrdinaryNumbers();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                    }
                } while (true);
            } else if (age != -1) {
                System.out.println("Sorry, you have to be 18 or older.");
                System.exit(0);;
            }
        }
    }

    public void saveUser(){

    }
}
