import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            System.out.println("Player A, please enter your choice (R, P, or S):");
            playA = in.nextLine();
            playA = playA.toUpperCase();

            System.out.println("Player B, please enter your choice (R, P, or S):");
            playB = in.nextLine();
            playB = playB.toUpperCase();

            System.out.println("\nPlayer A chose: " + playA + "\nPlayer B chose: " + playB);

            if (!playA.matches("[RPS]") || !playB.matches("[RPS]")) // if either player enters an invalid move, print an error message
            {
                System.out.println("Illegal move! Please enter R, P, or S.");
            } else
            {
                if (playA.equals("R")) {
                    if (playB.equals("R")) {
                        System.out.println("Rock vs Rock: It's a tie!");
                    } else if (playB.equals("P")) {
                        System.out.println("Paper covers Rock: Player B wins!");
                    } else {
                        System.out.println("Rock breaks Scissors: Player A wins!");
                    }
                } else if ((playA.equals("P"))) {
                    if (playB.equals("R")) {
                        System.out.println("Paper covers Rock: Player A wins!");
                    } else if (playB.equals("P")) {
                        System.out.println("Paper vs Paper: It's a tie!");
                    } else {
                        System.out.println("Scissors cut Paper: Player B wins!");
                    }
                } else if (playA.equals("S")) {
                    if (playB.equals("R")) {
                        System.out.println("Rock breaks Scissors: Player B wins!");
                    } else if (playB.equals("P")) {
                        System.out.println("Scissors cut Paper: Player A wins!");
                    } else {
                        System.out.println("Scissors vs Scissors: It's a tie!");
                    }
                    System.out.println("Do you want to play again? (Y/N)");
                    playAgain = String.valueOf(in.nextLine().equalsIgnoreCase("Y"));
                }
                while (playAgain.equalsIgnoreCase("N")) ;

                System.out.println("Thanks for playing Rock, Paper, Scissors!");
                in.close();
            }
        }

    }