import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList >> p. 405
		// ���������� ���� ����ϴ� �÷��� Ŭ����
		// ũ�Ⱑ ������ �ƴ� ������ ����
		// ���ϴ� ��ġ�� �߰��� ������ ����

		int[] array = new int[5];
		// ���� ���
		// ArrayList<Ÿ��> �̸� = new ArrayList<Ÿ��>();
		ArrayList<String> arrayList = new ArrayList<String>();

		// �� �߰�
		// �̸�.add("�� ��");
		arrayList.add("��ȯ");
		arrayList.add("����");
		arrayList.add("����");
		
		// ���ϴ� ��ġ�� �� �߰�
		arrayList.add(1, "�°�");
		
		// �� ���� -> remove(�ε���);
		arrayList.remove(arrayList.size()-1); // ���� �������� ����
		arrayList.remove(1); // 1�� ����
		

		// arrayList ���
		// arrayList �� ũ�� -> �̸�.size()
		for (int i = 0; i < arrayList.size(); i++) {
			// �� �������� -> �̸�.get(index)
			System.out.println(arrayList.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine(); // ���⵵ ���� ���
		 
		System.out.println(a);
		
		
		
	}

}
