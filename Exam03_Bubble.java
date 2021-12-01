import java.util.Scanner;

public class Exam03_Bubble {

	public static void main(String[] args) {
		// 버블정렬
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}

		// 버블 정렬
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				// 만약 현재 원소가 인접한 원소보다 크다면
				// 값을 바꿔 주세요! ---> 치환
				if (array[j] > array[j + 1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
