package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	// unlike arrays ArrayLists are MUTABLE!

	public static void main(String[] args) {
		// public static ArrayList<> arrayList() {

		List<String> MatrixFilms = new ArrayList<>();

		MatrixFilms.add("The Matrix");
		MatrixFilms.add("The Matrix Reloaded");
		MatrixFilms.add("The Matrix Revolutions");
		MatrixFilms.add("The Matrix Resurections");

//		for (int i = 0; i < MatrixFilms.size(); i++) {
//
//			System.out.println(MatrixFilms.get(i));
//		}
//		
		for (String i: MatrixFilms ) {
			System.out.println(i);
		}

		
//		System.out.println(MatrixFilms.get(1));
		
//		System.out.println(MatrixFilms.set(1, "Too FAST Too Matrix"));
//		
//		for (String i: MatrixFilms ) {
//			System.out.println(i);
//		}
		
		System.out.println(MatrixFilms.remove(1));
		
		for (String i: MatrixFilms ) {
			System.out.println(i);
	}
		
	}

//	public static String

}
