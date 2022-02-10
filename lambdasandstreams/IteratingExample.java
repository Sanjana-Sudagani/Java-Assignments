package lambdasandstreams;

import java.util.stream.*;
public class IteratingExample {
    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(element -> System.out.println(element));
    }
}
