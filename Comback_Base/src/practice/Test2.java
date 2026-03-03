package practice;
import java.util.HashMap;
import java.util.Map;

class Test2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Mango", 3);

        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByKey())
           .forEach(System.out::println);
    }
}