import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// ���� MP3 �����
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();

		while (true) {
			System.out.println("[1] �뷡�߰� [2] �뷡���� [3]�뷡�˻� [4] ����");
			System.out.print("�޴� ��ȣ �Է� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("�߰��� �뷡 ���� �Է� >> ");
				String musicName = sc.next();
				// musicLIst�� �뷡 �߰� ! ( �뷡 ���� )
				musicList.add(musicName);
				// �� �߰� �� ���!
				print(musicList);
//				System.out.println("==== List ====");
//				for (int i = 0; i < musicList.size(); i++) {
//					System.out.println((i + 1) + ". " + musicList.get(i));
//				}
//				System.out.println("==============");

			} else if (menu == 2) {
				// ���� �� ����Ʈ ���
				print(musicList);
				System.out.print("������ �뷡 ��ȣ �Է� >> ");
				int delete = sc.nextInt() - 1;
				// �Է¹��� n��° �뷡 ����
				musicList.remove(delete);
				// ���� �� ����Ʈ ���
				print(musicList);
//				System.out.println("==== List ====");
//				for (int i = 0; i < musicList.size(); i++) {
//					System.out.println((i + 1) + ". " + musicList.get(i));
//				}
//				System.out.println("==============");

			} else if (menu == 3) {
				System.out.print("�뷡 ���� �Է� >> ");
				String search = sc.next();
//				boolean choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (musicList.get(i).equals(search)) {
						System.out.println("�˻��� �뷡�� " + (i + 1) + "��°�� �ֽ��ϴ�");
//						choice = true;
						break;
					} else if (i == musicList.size() - 1) {
						System.out.println("����Ʈ�� ���� �뷡�Դϴ�.");
					}
				}
//				if ( choice == false) {
//					System.out.println("����Ʈ�� ���� �뷡�Դϴ�.");
//				}

			} else if (menu == 4) {
				System.out.print("���α׷��� �����Ͻðڽ��ϱ�?   Y / N ");
				String end = sc.next();
				if (end.equals("Y")) {
					System.out.println("���α׷� ���� ^-^/");
					break;
				} else if (end.equals("N")) {
					System.out.println("*^-^*");
				}
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		
	}

	// ��� �޼ҵ�
	public static void print(ArrayList<String> list) {
		System.out.println("==== List ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println("==============");

	}
}
