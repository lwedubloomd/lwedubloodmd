package com.yedam.java.homework1114;

import jdk.internal.loader.AbstractClassLoaderValue;

public class homework1 {

	public static void main(String[] args) {
//		문자열을 활용한 문제
//
//		1) 문자열 뒤집기
//		- 입력되는 문자열을 뒤집어서 출력
//		ex) input : abc, output : cba
//
//		2) 문자열 개수 세기
//		- 아스키 코드 이용
//		- 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
//		ex) input : 1a2v4b , output : 숫자 3개, 영어 3개
//
//		3) 입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
//		- 조건 -
//		금년 기준으로 100년이 넘어간 경우는 제외 한다. 또한 생일은 신경쓰지 않는다.
//		(221114 -> 1922년 11월 14일 X , 2022년 11월 14일 O)
//		ex) input : 000510, output : 21살

		String abc = "abc";

		for (int i = abc.length() - 1; i >= 0; i--) {
			// abc.charAt(i);

			System.out.print(abc.charAt(i));

		}
		System.out.println();
//		2) 문자열 개수 세기
//		- 아스키 코드 이용
//		- 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
//		ex) input : 1a2v4b , output : 숫자 3개, 영어 3개
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
