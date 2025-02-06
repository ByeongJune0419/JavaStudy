package homework;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		// 사용자로부터 국어, 영어, 수학 점수를 각각 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오.");
		System.out.print(">>>");
		String score = scan.nextLine();
		int korean = Integer.parseInt(score);
		System.out.println("영어 점수를 입력하시오.");
		System.out.print(">>>");
		String score2 = scan.nextLine();
		int English = Integer.parseInt(score2);
		System.out.println("수학 점수를 입력하시오.");
		System.out.print(">>>");
		String score3 = scan.nextLine();
		int Math = Integer.parseInt(score3);
		// 입력받은 점수를 모두 합치기
		int grade = korean + English + Math;
		double avg = (korean + English + Math) / 3.0;
		// 합친 점수에 따라 A ~ C 설정해서 등급 매기기
		String grade01 = "";
		if(avg >= 90) {
			grade01="A";
		} else if(avg >= 80) {
			grade01="B";
		} else if(avg >=70) {
			grade01="C";
		} else {
			grade01="D";
		}
		System.out.println("평균 :" + avg);
		System.out.println("등급 :" + grade01);
		
		long result =1;
		for(int i=1;i<=15;i++) {
			result *=i;
		}
		System.out.println("15팩토리얼:" + result);
	}
}
