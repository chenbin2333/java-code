package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(1);
		array.add(1);
		array.add(1);
		array.add(1);
		
		int frequency = Collections.frequency(array, 1);
		System.out.println(frequency);
		
		max();
	}
	
	public static void max() {
		int max = 0;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 4};
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
