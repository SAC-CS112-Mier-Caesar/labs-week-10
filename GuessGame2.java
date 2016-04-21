
import java.util.Scanner;

public class GuessGame2 {

public static void main(String[] args) {

int high;
int low;
int numberGuess;
int randomNumber;

Scanner input = new Scanner (System.in);

RandomNumber myNumber = new RandomNumber();



System.out.println("Please enter a low number: ");
low = input.nextInt();

System.out.println("Please enter a high number: ");
high = input.nextInt();

myNumber.setLowNumber(low);
myNumber.setHighNumber(high);

System.outPrintf("Please enter a number between %d and %d: ", low, high);
numberGuess = input.nextInt();

randomNumber = myNumber.getANumber();

System.out.println(randomNumber);


}

}
