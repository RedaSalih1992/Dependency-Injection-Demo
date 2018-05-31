package com.adbylabs.sortdemo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class SortApplication {

	public static void main(String[] args) {
		int[] values = {1,9,8,2,6,10,5,20,15};
		BinarySortImpl bs = new BinarySortImpl();
		
		
		BubbleSortAlg bb = new BubbleSortAlg();
		bs = new BinarySortImpl(bb);
		System.out.println("Bubble: " + Arrays.toString(bs.arraySort(values)));
		
		QuickSortAlg qb = new QuickSortAlg();
		bs = new BinarySortImpl(qb);
		System.out.println("Quick: " + Arrays.toString(bs.arraySort(values)));
		
		DecSortAlg ds = new DecSortAlg();
		bs = new BinarySortImpl(ds);
		System.out.println("Dec: " + Arrays.toString(bs.arraySort(values)));

		

	
	}
}
