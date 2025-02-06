package ch09_class.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMain {
	public static void main(String[] args) {
		Student stu1 = new Student("팽수"); // new 클래스를 사용하기 위해 인스턴스화
		Student stu2 = new Student("팽순");
		Student stu = new Student("길동");
		System.out.println(stu1);
		System.out.println(stu1.getName());
		stu1.setName("김팽수");
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
		
		stu1.setKor(90);
		System.out.println(stu1);
		stu1.setEng(75);
		System.out.println(stu1);
		stu1.nm();
		Student.check(); // 정적메소드 호출
		// Stduent.nm(); // class의 기본 메소드는 인스턴스 메소드임(인스턴스와 이후 사용가능)
		
		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu1);
		classMate.add(stu2);
		classMate.add(new Student("닉", 100, 90, 80));
		classMate.add(new Student("주디", 90, 80, 80));
		for(Student st : classMate) {
			System.out.println( st.getName());
		}
		// 버블정렬
		for(int k = 0; k < classMate.size(); k++) {
			for(int i = 0; i <classMate.size(); i ++) {
				// i  <i+1 내림
				// i > i+1 오름
				if(classMate.get(i).getAvg() > classMate.get(i+1).getAvg()) {
					Student temp = classMate.get(i);       //임시 공간에
					classMate.set(i,  classMate.get(i+1)); //1번째와 선수 바꾸기
					classMate.set(i+1, temp);
					
				}
			}
		}
		System.out.println(classMate);
		// Collection.sort (객체 사용";
		// - = 두 객체의 순서를 바꾸지 않음
		// 1 = 두 객체의 순서를 바꿈
		// 0 = 유지
		Collections.sort(classMate, new Comparator<Student>() {
		    @Override
		    public int compare(Student o1, Student o2) {
		        double diff = o2.getAvg() - o1.getAvg();
		        if (diff < 0) {
		            return -1; // o1이 더 크므로 앞으로 정렬
		        } else if (diff > 0) {
		            return 1;  // o2가 더 크므로 순서를 바꿈
		        }
		        return 0; // 같으면 순서 유지
		    }
		});	
		}
}

	