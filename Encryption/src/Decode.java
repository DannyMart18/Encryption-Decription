import java.util.Scanner;

public class Decode {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){


        int key;

        System.out.println("Enter the encoded message to decode");
        String text = input.nextLine();

        System.out.println("Enter the matching key ");
        key = input.nextInt();



        char [] chars = text.toCharArray();

        for (char c : chars){

            c -= key;
            System.out.print(c);
        }




    }
}
