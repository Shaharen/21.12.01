import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList >> p. 405
		// 보편적으로 많이 사용하는 컬렉션 클래스
		// 크기가 고정이 아닌 가변의 길이
		// 원하는 위치에 추가나 삭제가 쉬움

		int[] array = new int[5];
		// 선언 방법
		// ArrayList<타입> 이름 = new ArrayList<타입>();
		ArrayList<String> arrayList = new ArrayList<String>();

		// 값 추가
		// 이름.add("들어갈 값");
		arrayList.add("승환");
		arrayList.add("병관");
		arrayList.add("수민");
		
		// 원하는 위치에 값 추가
		arrayList.add(1, "태경");
		
		// 값 삭제 -> remove(인덱스);
		arrayList.remove(arrayList.size()-1); // 제일 마지막행 삭제
		arrayList.remove(1); // 1행 삭제
		

		// arrayList 출력
		// arrayList 의 크기 -> 이름.size()
		for (int i = 0; i < arrayList.size(); i++) {
			// 값 가져오기 -> 이름.get(index)
			System.out.println(arrayList.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine(); // 띄어쓰기도 같이 출력
		 
		System.out.println(a);
		
		
		
	}

}
