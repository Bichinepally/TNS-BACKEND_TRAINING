package com.tnsif.generics;
		// TODO Auto-generated method stub
		class Box<T> {
		    private T value;

		    public void setValue(T value) {
		        this.value = value;
		    }

		    public T getValue() {
		        return value;
		    }
		    public static void main(String[] args) {
		        Box<String> strBox = new Box<>();
		        strBox.setValue("Hello");
		        System.out.println("String: " + strBox.getValue());

		        Box<Integer> intBox = new Box<>();
		        intBox.setValue(123);
		        System.out.println("Integer: " + intBox.getValue());
		    }
		

	}


