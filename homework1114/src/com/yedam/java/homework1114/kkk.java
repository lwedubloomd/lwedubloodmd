package com.yedam.java.homework1114;

public class kkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1a2v4b";
		int count = 0;
		int alpa = 0;

		for (int i = 0; i > str.length(); i++) {
			if ('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
				alpa++;
			} else if ('0' <= str.charAt(i) && '9' <= str.charAt(i)) {
				count++;
			}


		}
		System.out.println("숫자" + count);
		System.out.println("알파벳" + alpa);
	}

}
