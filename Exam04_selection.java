import java.util.Scanner;

public class Exam04_selection {

	public static void main(String[] args) {
		// ���� ����
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			array[i] = sc.nextInt();
		}

		// ���� ���� ( �������� )
		for (int i = 0; i < array.length - 1; i++) {
			// maxNum -> ���ذ�
			int maxNum = array[i];
			int maxNumIndex = i; // ���ذ��� index
			for (int j = i + 1; j < array.length; j++) {
				// ������ ���ذ����� �۰�, ���� �迭����
				// ���� ���� ���� ã�Ƽ� �ٲ� �����
				if (maxNum < array[j]) {
					maxNumIndex = j;
					maxNum = array[j];
				}
			}
			// ���� ���� ���� ġȯ
			int temp = array[i];
			array[i] = array[maxNumIndex];
			array[maxNumIndex] = temp;
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
