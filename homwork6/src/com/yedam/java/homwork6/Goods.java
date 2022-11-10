package com.yedam.java.homwork6;

public class Goods {

	
	
	//필드
	//상품이름 상품가격
	 String gName;
	 int gPrice;
	
	//생성자
	 public String getgName() {
		 return gName;
	 }
	 public void setgName(String gName) {
		 this.gName = gName;
	 }
	 public int getgPrice() {
		 return gPrice;
	 }
	 public void setgPrice(int gPrice) {
		 this.gPrice = gPrice;
	 }
	 
	 public void getInfo() {
		 System.out.println("=========상품정보=========");
		 System.out.println("상품명"+gName);
		 System.out.println("가격"+gPrice);
	 }
	//
}
