package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lab1 {
    public static void main(String[] args) {
		/*
		 * Stream.of(12,23,34,53,54).toArray(Integer[]::new);
		 * List.of(5,6,2,5,5).toArray();
		 */
    	    int[] array = Stream.of(5,6,3,5).mapToInt(Integer::intValue).toArray();
    	    int[] array2 = List.of(5,6,2,5,5).stream().mapToInt(Integer::intValue).toArray();
    	    
    	    ArrayList<Integer> arrayList = new ArrayList<>(List.of(5,7,6,2,1));
    	    arrayList.stream().filter(x->x%2==0).peek(x->arrayList.remove(x)).forEach(System.out::println);
    	    
	}
}
