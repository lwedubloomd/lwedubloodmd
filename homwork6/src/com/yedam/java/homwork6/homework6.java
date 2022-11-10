package com.yedam.java.homwork6;

import java.util.Scanner;

public class homework6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 상품 수
		// 2) 상품 및 가격입력
		// 3) 분석

		// 상품 수 - 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.

		System.out.println("상품 수 >");
		int account = Integer.parseInt(sc.nextLine());
		Goods[] good = new Goods[account];

		for (int i = 0; i < good.length; i++) {
			Goods goods = new Goods();
			System.out.print("상품>");
			String gName = (sc.nextLine());
			goods.setgName(gName);
			// 학교이름 학번 국어 수학 영어

			System.out.print("상품 가격>");
			int gPrice = Integer.parseInt(sc.nextLine());
			goods.setgPrice(gPrice);

			good[i] = goods;
		}
	
	
		for (int i = 0; i < good.length; i++) {
			good[i].getInfo();// 분석기능
			// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합
			// mostExp tailSum=Sum - mostExp
			}
		 System.out.println("=======================");
		}
		
	}

