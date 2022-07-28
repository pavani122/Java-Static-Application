package com.techouts.staticApp;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Demo123 {

	public static void main(String[] args) {

		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
	        // Prime number 
	        System.out.println(numbers.stream()
	                             .filter(Demo123::isPrime)
	                             .collect(toList()));
	    }

	    public static boolean isPrime(int number) {
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
	


