
package CumulativeActivities;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ta
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        String playAgain="Yes";
        Scanner myScanner= new Scanner(System.in);
        while("Yes".equals(playAgain)){
            System.out.println("how many rounds you wants to play, it should be between 1 and 10?");
        //    int round=myScanner.nextInt();
            int round=Integer.parseInt(myScanner.nextLine());
            if (round<1 || round >10){
                System.out.println("Error: you have chosen rong number");
                myScanner.close();
                System.exit(0);
            }
            Random rng=new Random();
            int tie=0, userWin=0, compWin=0;
            for (int i = 1; i < round+1; i++) {
                
            //    int yourChoice=myScanner.nextInt();
                int yourChoice=0;
            try{
                do{
                System.out.println("What is your chice: 1=Rock, 2=Paper, 3=Scissors ");
                yourChoice=Integer.parseInt(myScanner.nextLine());
                }while(yourChoice <1 || yourChoice >3);
            }catch(NumberFormatException ex)
                {System.out.println("You should enter a number");}
                int computerChoice=rng.nextInt(3)+1;
                System.out.println("userchoice : " + yourChoice + " computer choce: " + computerChoice);
                if (yourChoice == computerChoice)
                    tie++;
                else if(computerChoice==1){
                    if(yourChoice ==2)
                        userWin++;
                    else
                        compWin++;
                }
                else if(computerChoice==2){
                    if(yourChoice ==3)
                        userWin++;
                    else
                        compWin++;
                }
                else if (computerChoice==3) {
                    if(yourChoice ==1)
                        userWin++;
                    else
                        compWin++;
                }   
            }
        //    System.out.println("Do you want play again: Yes or No");
        //    System.out.println();
        //    playAgain=myScanner.nextLine();
            System.out.println("the number of tie: " + tie);
            System.out.println("the number of user win: " + userWin);
            System.out.println("the number of computer win: " + compWin);
            System.out.println("The winner is: " + (userWin > compWin? "user win" : "Computer win"));
    //        myScanner.nextLine();
            System.out.println("Do you want play again: Yes or No");
            playAgain=myScanner.nextLine();
        }
        myScanner.close();
    }
}
