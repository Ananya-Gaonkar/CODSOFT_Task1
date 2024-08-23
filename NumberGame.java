
// 1. Generate a random number within a specified range, such as 1 to 100.
// 2. Prompt the user to enter their guess for the generated number.
// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.
// 4. Repeat steps 2 and 3 until the user guesses the correct number.
// You can incorporate additional details as follows:
// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        //Generating a random number
        Scanner sc = new Scanner(System.in);
        double random = Math.random();
        random = Math.round((random*100))+1;
        System.out.println(random);
        System.out.println("1.Multiple Rounds\n2.Single Round");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1://Input the number of attempts
                     System.out.println("Enter the number of attempts you need: ");
                     int n = sc.nextInt();
                     int i=0;
                     int score=0;    //Success in each attempt will add 10 marks
                     while(i<n){
                        System.out.println("Attempt:"+(i+1));
                        System.out.println("Enter a number (1 to 100)");
                        int num = sc.nextInt();
                       
                        if(num==random){
                        System.out.println("Correct Guess");
                        score+=10;
                        }
                        else if(num+10<random){
                        System.out.println("Too Low");
                        }
                        else if(num-10>random){
                        System.out.println("Too High");
                        }
                        System.out.println("Play again");
                        i++;
                    }
                    System.out.println("Score:"+score);
                    break;
            case 2: System.out.println("Enter a number (1 to 100)");
                    int num = sc.nextInt();
                    while(random != num ){
                        if(num==-1){
                            break;
                        }
                        if(num+10 < random){
                            System.out.println("Too Low");
                        }
                        else if(num-10>random){
                            System.out.println("Too High");
                        }
                        else{
                            System.out.println("Closer Guess");
                        }
                        
                        System.out.println("Try again");
                        System.out.println("Enter a number (1 to 100)");
                        num = sc.nextInt();

                    }
                    if(random ==num){
                        System.out.println("correct Guess");
                    }
                    break;
            default:System.out.println("Invalid choice");
        }
        sc.close();
    }
}
