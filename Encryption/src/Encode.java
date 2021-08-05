import java.util.Scanner;
import java.util.Random;

public class Encode {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        Random rand = new Random();
        int upperbound = 10;


        int key = rand.nextInt(upperbound);
        System.out.println("The key is : " + key);

        System.out.println("Enter a message to encode");
        String text = input.nextLine();

        //System.out.println("Enter a key to encode the message(between 1-10) ");
       // key = input.nextInt();



        char [] chars = text.toCharArray();

        for (char c : chars){

            c += key;
            System.out.print(c);

        }








    }
}
