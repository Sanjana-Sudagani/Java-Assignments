import java.util.ArrayList;
import java.util.Scanner;

class AlphabetString {
    ArrayList<Character> arr = new ArrayList<Character>();

    public AlphabetString(String inputString) {
        inputString = inputString.toUpperCase();
        for (int i = 0; i < inputString.length(); i++) {
            if (!arr.contains(inputString.charAt(i))) {
                arr.add(inputString.charAt(i));
            }
        }
        if (arr.size() == 26) {
            System.out.println("contains all letters in String");
        } else {
            System.out.println("Do not contain all letters");
        }
    }
}

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        new AlphabetString(inputString);
        sc.close();
    }
}