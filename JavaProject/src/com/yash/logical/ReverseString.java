package com.yash.logical;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Niesh", rev = "";

		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i); // extracts each character
			rev = ch + rev;   //adds each character in front of the existing string

		}
		System.out.println(rev);
	}
}
