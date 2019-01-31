import java.util.Scanner;
public class guessingGame{
    public static void main(String[] args)
    {
        guessing();
    }
    public static void guessing()
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter a maximum number");
    int number=input.nextInt();
    int max = number; 
    int min = 0; 
    int range = max - min + 1;     
    System.out.println("Guess the number");
    int guess=input.nextInt();
    int rand = (int)(Math.random() * range) + min; 
    boolean correct=true;
    do
    {
        if(rand>guess)
        {
            System.out.println("Too low. Guess again.");
            guess=input.nextInt();
        }
        else if(rand<guess)
        {
            System.out.println("Too high. Guess again");
            guess=input.nextInt();
        }
        else
        {
            correct=false;
            System.out.println("Correct!");
        } 
    }while(correct); 
}    
}