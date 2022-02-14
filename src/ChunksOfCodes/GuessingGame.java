//package ChunksOfCodes;
//
//import java.util.Scanner;
//
//public class GuessingGame {
//    /**
//     * the players
//     */
//    Players  player1;
//    Players player2;
//    Players player3;
//
//    public void startGame(){
//        p1 = new Players();
//        p2 = new Players();
//        p3 = new Players();
//
//        int guessP1 = 0;
//        int guessP2 = 0;
//        int guessP3 = 0;
//
//        boolean isPlayer1Right = false;
//        boolean isPlayer2Right = false;
//        boolean isPlayer3Right = false;
//
//
//        int guessNumber = (int)(Math.random() * 10);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess a number between 1 and 9");
//        int playerGuessed = scanner.nextInt();
//
//        scanner.close();
//
//        while(true){
//            System.out.println("Number to guess is " + guessNumber);
//
//            p1.guess();
//            p2.guess();
//            p3.guess();
//
//            guessp1 = p1.number;
//            System.out.println("Player one guessed " + guessp1);
//
//            guessp2 = p2.number;
//            System.out.println("Player two guessed " + guessp2);
//
//            guessp3 = p3.number;
//            System.out.println("Player three guessed " + guessp3);
//
//            if(guessp1 == guessNumber ){
//                isPlayer1Right = true;
//            }
//
//            if(guessp2 == guessNumber ){
//                isPlayer2Right = true;
//            }
//
//            if(guessp3 == guessNumber ){
//                isPlayer3Right = true;
//            }
//
//            if(isPlayer1Right || isPlayer2Right || isPlayer3Right){
//                System.out.println("We have a player");
//                System.out.println("Player one got it right " + isPlayer1Right);
//                System.out.println("Player two got it right " + isPlayer2Right);
//                System.out.println("Player three got it right " + isPlayer3Right);
//                System.out.println("Game is over");
//            }else{
//                System.out.println("Player would have to try again");
//            }
//        }
//    }
//}
