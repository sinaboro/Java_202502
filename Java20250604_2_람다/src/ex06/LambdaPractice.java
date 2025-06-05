package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 20, 3, 40, 5, 60);
        
        // 1. 짝수만 필터링
        List<String> evenNumbers = filterEvenNumbers(numbers,  num -> num >= 18 );
        
        for(String i : evenNumbers)
        	System.out.print(i  + " ");
        System.out.println("\n-------------------------------");
       
        // 2. 짝수의 제곱 구하기
        List<Integer> squaredNumbers = map(numbers,	n ->  n*n );
        
        for(int i : squaredNumbers)
        	System.out.print(i  + " ");
        System.out.println("\n-------------------------------");
        
        // 3. 결과 출력
        forEach(numbers,  n-> System.out.print((n+1) + " "));
    }
    
	
	// 짝수만 필터링하는 메소드
    public static List<String> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
    	
    	List<String> list = new ArrayList<String>();
    	
    	for(int n : numbers) {
    		if(predicate.test(n)) {
    			list.add("성년");
    		}else {
    			list.add("미성년");
    		}
    	}
    	return list;
    }
    
     
	// 숫자를 출력하는 메소드
    public static void forEach(List<Integer> numbers, Consumer<Integer> consumer) {
    	for(int i : numbers)
    		consumer.accept(i);
    }
    
    
	// 숫자를 제곱하는 메소드
    public static List<Integer> map(List<Integer> numbers, Function<Integer, Integer> function) {
    	List<Integer> list= new ArrayList<Integer>();
    	
    	for(int i : numbers) {
    		list.add(  function.apply(i) );
    	}
    	return list;
    }

}