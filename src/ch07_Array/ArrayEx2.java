package ch07_Array;

public class ArrayEx2 {
	public static void main(String[] args) {
		//Q.월리를 찾아라!
		//findWally 문자열에 '월리'가 총 몇개 있는지 출력하시오
		String findWally = "월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리월리";
		int cnt = 0;
		int cnt2 = 0;
		// 2자리씩 비교 or 제거
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length()	;
		System.out.println(all + "-" + after);
		cnt = (all - after) / 2 ;
		
		for(int i = 0; i < findWally.length()-1;i++) {
			String subText = findWally.substring(i,i+2);
			if(subText.equals("월리")) {
				cnt2++;
			}
		}
		System.out.println("월리는 총:" + cnt);
		System.out.println("월리는 총:" + cnt2);
		}
}
