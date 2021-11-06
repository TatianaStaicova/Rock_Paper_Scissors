package staicova.tatiana.rps;

import java.util.Scanner;

public class Game {
    private Scanner userInput;

    public Game(){
        userInput = new Scanner(System.in);

    }

    public Player createPlayer(){
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Enter your taunting phrase: ");
        String taunt = userInput.nextLine();
        return new Player(name, taunt);
    }

    public void startGame(){
        Boolean continueFlag = true;
        System.out.println("Welcome to my version of Rock, Paper, Scissors!");
        Player player1 = createPlayer(); //call method to create each player
        Player player2 = createPlayer();
        System.out.println("Player 1's taunt is: " + player1.taunt()); //we start aggressive!
        System.out.println("Player 2's taunt is: " + player2.taunt());
        int player1Wins = 0;
        int player2Wins = 0;
        System.out.println("Let's begin!");
        System.out.println("Do you wanna play now? Hm?!");
        while (continueFlag){

            String continueMessage = userInput.nextLine().toLowerCase();

            switch (continueMessage){
                case "no": //if continue is yes, it will already continue, no need   to add case
                    continueFlag = false;
                    break;
                default: //anything but no - actual game
                    System.out.println("Player 1, Enter your selection 1-3: " +
                            "\n Rock (1), paper (2), scissors(3), shoot");
                    int player1choice = userInput.nextInt();
                    System.out.println("Player 2, Enter your selection 1-3: " +
                            "\n Rock (1), paper (2), scissors(3), shoot");
                    int player2choice = userInput.nextInt();
                    switch (player1choice){
                        case 1: //rock
                            if(player2choice == 2){
                                //lose
                                System.out.println(player2.taunt());
                                player2Wins++;
                            }
                            else if (player2choice == 3 ){
                                //win
                                System.out.println(player1.taunt());
                                player1Wins++;
                            } else {
                                //tie - make method??
                                System.out.println("Tie, try again");
                            }
                            System.out.println("Scores are: \n" + player1.getName() + "'s score: " + player1Wins +
                                    "\n" + player2.getName() + "'s score: " + player2Wins + "\n\n\n");
                            continue;

                        case 2: //paper
                            if(player2choice == 1){
                                //win
                                System.out.println(player1.taunt());
                                player1Wins++;
                            }
                            else if (player2choice == 3){
                                //lose
                                System.out.println(player2.taunt());
                                player2Wins++;
                            }
                            else {
                                //tie - make method??
                                System.out.println("Tie, try again");
                            }
                            System.out.println("Scores are: \n" + player1.getName() + "'s score: " + player1Wins +
                                    "\n" + player2.getName() + "'s score: " + player2Wins + "\n\n\n");
                            continue;

                        case 3: //scissors
                            if(player2choice == 1){
                                //lose
                                System.out.println(player2.taunt());
                                player2Wins++;
                            }
                            else if (player2choice == 2){
                                //win
                                System.out.println(player1.taunt());
                                player1Wins++;
                            } else {
                                //tie - make method??
                                System.out.println("Tie, try again");
                            }
                            System.out.println("Scores are: \n" + player1.getName() + "'s score: " + player1Wins +
                                    "\n" + player2.getName() + "'s score: " + player2Wins + "\n\n\n");
                            continue;

                        default:
                            System.out.println("Uh uh, choose something correct! try again!");
                            break;

                    }

                    System.out.println("play again?");

                    break;
            }

            System.out.println("See ya!");

        }

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame(); // created with empty method
    }
}
