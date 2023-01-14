import java.util.Scanner;
import java.lang.Math.*;

public class calculator {
    public static void main(String[] args) {
        Scanner menuOption = new Scanner(System.in);
        Scanner numberOne = new Scanner(System.in);
        Scanner numberTwo = new Scanner(System.in);
        Scanner numberThree = new Scanner(System.in);
        Scanner numberFour = new Scanner (System.in);
        Scanner numberFive = new Scanner(System.in);
        Scanner numberSix = new Scanner(System.in);
        Scanner numberSeven = new Scanner(System.in);
        Scanner numberEight = new Scanner(System.in);
        System.out.print("What operation do you want to use? ");
        
        String menuOptionConfirmed = menuOption.nextLine();
        
        if (menuOptionConfirmed.equals("MULTIPLICATION")) {
            System.out.println("Enter an integer: ");
            
            int numberOneConfirmed = numberOne.nextInt();
            
            System.out.println("Enter another integer: ");
            
            int numberTwoConfirmed = numberTwo.nextInt();
            
            int product = numberOneConfirmed * numberTwoConfirmed;
            
            System.out.println("The product is " + product);
        }
        
        if (menuOptionConfirmed.equals("DIVISION")) {
            System.out.println("Enter an integer: ");
            
            int numberThreeConfirmed = numberThree.nextInt();
            
            System.out.println("Enter another integer: ");
            
            int numberFourConfirmed = numberFour.nextInt();
            
            int product2 = numberThreeConfirmed / numberFourConfirmed;
            
            System.out.println("The product is " + product2);
        }
        
        if (menuOptionConfirmed.equals("ADDITION")) {
            System.out.println("Enter an integer: ");
            
            int numberFiveConfirmed = numberFive.nextInt();
            
            System.out.println("Enter another integer: ");
            
            int numberSixConfirmed = numberSix.nextInt();
            
            int product3 = numberFiveConfirmed + numberSixConfirmed;
            
            System.out.println("The sum is " + product3);
        }
        
        if (menuOptionConfirmed.equals("SUBTRACTION")) {
            System.out.println("Enter an integer: ");
            
            int numberSevenConfirmed = numberSeven.nextInt();
            
            System.out.println("Enter another integer: ");
            
            int numberEightConfirmed = numberEight.nextInt();
            
            int product4 = numberSevenConfirmed - numberEightConfirmed;
            
            System.out.println("The difference is " + product4);
        }
    }
}