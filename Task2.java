import java.util.Scanner;
import java.util.Random;

public class Task2 {

    private static final int MIN=1;
    private static final int MAX=100;
    private static final int MAX_ATTEMPTS=12;
    private static final int MAX_ROUNDS=2;

    public static void main(String args[]){
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int total_score=0;

        System.out.println("Number Guessing Game");
        System.out.println("Total no.of rounds : 2");
        System.out.println("Attempts to Guess Number in Each Round : 12");//=/
        for(int i=0;i<=MAX_ROUNDS;i++){
            int num=ran.nextInt(MAX)+MIN;
            int attempts=0;

            System.out.printf("Round %d : Guess the Number between %d and %d in %d attempts.\n",i,MIN,MAX,MAX_ATTEMPTS);

            while(attempts<MAX_ATTEMPTS){
                System.out.println("Guess the Number");
                int guess=sc.nextInt();
                attempts=attempts+1;

                if(guess==num){
                    int score=MAX_ATTEMPTS - attempts;
                    total_score=total_score+score;
                    System.out.printf("Ewww! Number Guessed Successfully. Attempts = %d and Round Score = %d\n",attempts,score);
                    break;
                }

                else if(guess < num){
                    System.out.printf("Number is greater than %d. Attempts left = %d\n",guess,MAX_ATTEMPTS-attempts);
                }

                else if(guess > num){
                    System.out.printf("Number is less than %d. Attempts left = %d\n",guess,MAX_ATTEMPTS-attempts);
                }
            }

            if(attempts==MAX_ATTEMPTS){
                System.out.printf("\nRound = %d\n",i);
                System.out.println("Attempts=0");
                System.out.printf("The Random Number is %d\n",num);
            }
        }
        System.out.printf("GAME OVER. Total Score = %d",total_score);
    }
}
