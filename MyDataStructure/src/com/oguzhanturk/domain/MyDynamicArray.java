package com.oguzhanturk.domain;

import java.util.Arrays;

public class MyDynamicArray<T> {

	private Object[] arr;
	private int cursor;
	private int length;
	private int size;

	public MyDynamicArray() {
		this(10);
	}

	public MyDynamicArray(int initialLength) {
		arr = new Object[initialLength];
		length = initialLength;
	}

	public void add(T t) {
		if (cursor + 1 > length) {
			grow();
		}
		arr[cursor++] = t;
		size++;
	}

	public T get(int index) {

		if (index + 1 > size) {
			throw new IndexOutOfBoundsException(index);
		}
		return (T) arr[index];

	}

	public T remove(int index) {
		if (index + 1 > size) {
			throw new IndexOutOfBoundsException(index);
		}
		Object willBeRemoved = arr[index];
		arr[index] = null;
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[cursor--] = null;
		size--;
		return (T) willBeRemoved;
	}

	public int size() {
		return size;
	}

	private void grow() {
		length += length << 1;
		arr = Arrays.copyOf(arr, length);
	}

}
