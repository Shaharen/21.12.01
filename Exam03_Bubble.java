import java.util.Scanner;

public class Exam03_Bubble {

	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			array[i] = sc.nextInt();
		}

		// ���� ����
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				// ���� ���� ���Ұ� ������ ���Һ��� ũ�ٸ�
				// ���� �ٲ� �ּ���! ---> ġȯ
				if (array[j] > array[j + 1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
