import java.util.Scanner;

public class Exam04_selection {

	public static void main(String[] args) {
		// 선택 정렬
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}

		// 선택 정렬 ( 내림차순 )
		for (int i = 0; i < array.length - 1; i++) {
			// maxNum -> 기준값
			int maxNum = array[i];
			int maxNumIndex = i; // 기준값의 index
			for (int j = i + 1; j < array.length; j++) {
				// 현재의 기준값보다 작고, 남은 배열에서
				// 제일 작은 값을 찾아서 바꿔 줘야함
				if (maxNum < array[j]) {
					maxNumIndex = j;
					maxNum = array[j];
				}
			}
			// 가장 작은 값과 치환
			int temp = array[i];
			array[i] = array[maxNumIndex];
			array[maxNumIndex] = temp;
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
