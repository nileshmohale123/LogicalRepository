package com.yash.logical;

// jis number ka reverse number same ata hai ex 121 ka reverse number same hai use palindrome number kahte hai
public class PalindromeNumber {

	public static void main(String[] args) {

		int no = 191;

		int temp = no;

		int rev = 0, rem;

		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(no + " is palindrom number");

		} else {

			System.out.println(no + " is not PN");
		}
	}

}
