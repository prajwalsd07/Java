package Day9;

import java.util.Arrays;
import java.util.List;

public class lambda {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4);
    for(int i: numbers)
    {
    System.out.println(i);
    }
   
    numbers.forEach(num -> System.out.println(num));
    
    
    
  }
}
