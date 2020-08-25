import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String welcomeMessage = "Your number: ";
        System.out.println(welcomeMessage);
        //I need to store whatever they type into a variable.
        int userNumber=input.nextInt();

// Now I can test whatever the user typed in with the userNumber variable.
        if(userNumber >0){
            System.out.println("Number is positive.");
        }
else if (userNumber<0)
        {
            System.out.println("Number is negative.");
        } else {
    System.out.println("The number is zero.");
        }




    }

}
