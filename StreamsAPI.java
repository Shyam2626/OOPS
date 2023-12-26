import java.util.*;
public class StreamsAPI {

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(4,6,3,2,6,34,7);

        list.stream()
        .filter(n -> n%2==0)
        .sorted()
        .map(n -> n*3)
        .distinct()
        .forEach(System.out::println);


    }
    
}
