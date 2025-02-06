package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Result03 {
	public static void main(String[] args) {
		ArrayList<Set<Integer>> lottonumber = makeLotto();
		Collections.sort((List<T>) lottonumber);
		System.out.println(lottonumber);
	}
	public static Set<Integer> makeLotto() {
	    Set<Integer> lotto = new HashSet<>();  // 자동 정렬됨!
	    
	    while(lotto.size() < 6) {
	        int num = (int) ((Math.random() * 45) + 1);
	        lotto.add(num);
	    }
	    
	    return lotto;
	}
	
	
	}
