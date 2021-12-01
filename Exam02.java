import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 간이 MP3 만들기
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();

		while (true) {
			System.out.println("[1] 노래추가 [2] 노래삭제 [3]노래검색 [4] 종료");
			System.out.print("메뉴 번호 입력 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("추가할 노래 제목 입력 >> ");
				String musicName = sc.next();
				// musicLIst에 노래 추가 ! ( 노래 제목 )
				musicList.add(musicName);
				// 값 추가 후 출력!
				print(musicList);
//				System.out.println("==== List ====");
//				for (int i = 0; i < musicList.size(); i++) {
//					System.out.println((i + 1) + ". " + musicList.get(i));
//				}
//				System.out.println("==============");

			} else if (menu == 2) {
				// 삭제 전 리스트 출력
				print(musicList);
				System.out.print("삭제할 노래 번호 입력 >> ");
				int delete = sc.nextInt() - 1;
				// 입력받은 n번째 노래 삭제
				musicList.remove(delete);
				// 삭제 후 리스트 출력
				print(musicList);
//				System.out.println("==== List ====");
//				for (int i = 0; i < musicList.size(); i++) {
//					System.out.println((i + 1) + ". " + musicList.get(i));
//				}
//				System.out.println("==============");

			} else if (menu == 3) {
				System.out.print("노래 제목 입력 >> ");
				String search = sc.next();
//				boolean choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (musicList.get(i).equals(search)) {
						System.out.println("검색한 노래는 " + (i + 1) + "번째에 있습니다");
//						choice = true;
						break;
					} else if (i == musicList.size() - 1) {
						System.out.println("리스트에 없는 노래입니다.");
					}
				}
//				if ( choice == false) {
//					System.out.println("리스트에 없는 노래입니다.");
//				}

			} else if (menu == 4) {
				System.out.print("프로그램을 종료하시겠습니까?   Y / N ");
				String end = sc.next();
				if (end.equals("Y")) {
					System.out.println("프로그램 종료 ^-^/");
					break;
				} else if (end.equals("N")) {
					System.out.println("*^-^*");
				}
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		
	}

	// 출력 메소드
	public static void print(ArrayList<String> list) {
		System.out.println("==== List ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println("==============");

	}
}
