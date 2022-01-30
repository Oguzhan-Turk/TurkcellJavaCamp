package com.oguzhanturk.main;

import com.oguzhanturk.domain.MyDynamicArray;

public class Driver {

	public static void main(String[] args) {

		MyDynamicArray<Integer> arr = new MyDynamicArray<Integer>();

		for (int i = 0; i < 50; i++) {
			arr.add(i);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
