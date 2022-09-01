package cs.bjoremo.christine.miscstuff;

import java.util.Scanner;

public class TextUI extends LotteryNumbers {

    private final LotteryNumbers lot = new LotteryNumbers();
    private final Scanner in = new Scanner(System.in);

    public void userMenu() {
        System.out.println("Press 1 to enter your age:");
    }

    public void lottoMenu() {
        System.out.println("Which method do you want to play your lotto row with? Choose from the menu below:\n");
        System.out.println("1. Lotto row with a 'Set'");
        System.out.println("2. Lotto row with a 'List'");
        System.out.println("3. Lotto row with an 'Array'");
        System.out.println("4. Lotto row with a 'Map'");
    }

    public boolean startLotto() {
        boolean playing = true;
        do {
            userMenu();
            int menuSelection = getValueFromUserInt();
            if (menuSelection == 1) {
                addAge();
                //case 2 -> addName();
            } else {
                System.out.println("Incorrect value!");
            }
        } while (playing);
        return playing;
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

    public void addAge() {
        int age = 0;
        boolean playing = true;

        while (true) {
            System.out.println("Please enter your age: ");
            age = getValueFromUserInt();
            if (age >= 18) {
                do {
                    lottoMenu();
                    int menuSelection = getValueFromUserInt();
                    String thankYou = "\nThank you for playing!";
                    switch (menuSelection) {
                        case 1 -> {
                            generateSet();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 2 -> {
                            generateList();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 3 -> {
                            generateArray();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                        case 4 -> {
                            generateMap();
                            System.out.println(thankYou);
                            System.exit(0);
                        }
                    }
                } while (playing);
            } else if (age != -1) {
                System.out.println("Sorry, you have to be 18 or older.");
                System.exit(0);;
            }
        }
    }

    public void saveUser(){

    }
}
