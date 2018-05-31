package com.adbylabs.sortdemo;

public class BinarySortImpl {
	BinarySort s;
	
	public BinarySortImpl() {
	
	}
	public  BinarySortImpl(BinarySort s) {
		this.s = s;
	}
	public int[] arraySort(int[] list) {
		return s.sortB(list);
	}
}
