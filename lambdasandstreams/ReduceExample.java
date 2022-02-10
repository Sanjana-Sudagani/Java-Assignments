package lambdasandstreams;

// Implementation of reduce method
// to get the longest String
import java.util.*;

public class ReduceExample {

    // Driver code
    public static void main(String[] args)
    {
        // creating a list of Strings
        List<String> words = Arrays.asList("abc", "defg", "hij",
                "xyz", "uvwxyz");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.

        Optional<String> longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);
    }
}

