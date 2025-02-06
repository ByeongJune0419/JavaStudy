package ch09_class.util;

/**
 * class Name   : UtilClass
 * Author       : Byeong
 * Created Date : 2025. 2. 5.
 * Verstion     : 1.0
 * Purpose      :java 기초
 * Description  :static 매서드
 */
public class UtilClass {
	
	/*
	 * public static 정적 매서드는 어디서든 사용할 수 있는 매서드 (해당 클래스를 인스턴스화 하지 않아도)
	 * 공통기능과 같은 부분을 정의해서 사용할때 만드는 클래스 
	 * */
	// num :반올림 하고자 하는 소수, n: 소수 n번째 자리까지
	public static double weRound(double num, int n) {
		int ten = 1;
		for(int i=0; i < n; i ++) {
			ten *=10;
		}
		num *=ten;
		long temp = Math.round(num);
		double result = (double) temp/ten;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.59786945615, 3));
	}
}
