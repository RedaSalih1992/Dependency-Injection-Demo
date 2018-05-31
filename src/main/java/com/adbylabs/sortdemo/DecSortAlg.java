package com.adbylabs.sortdemo;

import java.util.Arrays;
import java.util.Collections;

public class DecSortAlg  implements BinarySort{
	
	public DecSortAlg() {
	
	}

	public int[] sortB(int[] numbers) {
		Integer[] array = Arrays.stream( numbers ).boxed().toArray( Integer[]::new );
		Arrays.sort(array, Collections.reverseOrder());
		int[] nNumbers = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
		return nNumbers;
	}
}
