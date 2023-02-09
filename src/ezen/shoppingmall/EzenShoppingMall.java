package ezen.shoppingmall;

import java.util.Scanner;

public class EzenShoppingMall {

	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		Album album = new Album(10, "Dynamite", 20000, "BTS");

		// 카트에 상품 담기
		// 엘범타입의 객체 담음
		myCart.addItem(album);

		// 같은 기능으로 다른클래스의 데이터 담는다
		Movie movie = new Movie(21, "아바타", 150000, "제임스카메론", "배우");

		// 영화 타입의 객체 담음
		myCart.addItem(movie);
		myCart.addItem(new Movie(22, "아바타2", 150000, "제임스카메론1", "배우1"));
		myCart.addItem(new Movie(23, "아바타3", 160000, "제임스카메론2", "배우2"));
		myCart.addItem(new Movie(24, "아바타4", 170000, "제임스카메론3", "배우3"));
		// 기능 구현 예상 : 년 월 일을 따로 받아 월만 검색해도 결과가 나오도록
		myCart.addItem(new Cookies(25, "꼬깔콘", 2000, "2023년 5월 3일"));
		myCart.addItem(new Cookies(26, "가나초코바", 2200, "2023년 5월 3일"));
		myCart.addItem(new Cookies(25, "ABC초콜릿", 50, "2023년 5월 3일"));
		myCart.addItem(new Cookies(25, "빼빼로", 1200, "2023년 5월 3일"));
		myCart.addItem(new Cookies(25, "홈런볼", 2500, "2023년 5월 3일"));

		// 카트 상품 목록 조회
		Item[] myItem = myCart.getItems();
		System.out.println("================전 상품 목록================");
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItem[i]);
		}


		// 상품 검색

		Scanner scanner = new Scanner(System.in);
		// 검색 결과값 전달받을것
		Item item = new Item();
		// 스캐너값을 담아줄 박스역활 //boolean도 담을수 있나? 담을수 있으나 string으로 변환되어 들어감
		String name = null;
		// 삭제 결과값 전달받을것
		boolean deletItem = true;
		// 강제 형변환 테스트

		System.out.println();
		System.out.println("================상품 프로그램 실행=============");
		System.out.println();

		System.out.print("찾을 이름을 검색해주세요 : ");
		// 입력한값 검색하고 아이템으로 전달

		name = scanner.nextLine();
		item = myCart.findByName(name);

		if (item != null) {
			// tostring 오버라이딩 진행하여 따로 기능 추가 안해도 바로 출력 가능
			System.out.println(item.toString());
		} else {
			System.err.println("\"" + name + "\" 상품을 찾을수없습니다");
		}

		System.out.println();
		System.out.print("삭제할 상품 명을 입력하세요 : ");

		name = scanner.nextLine();
		deletItem = myCart.removeItem(name);

		// string 타입으로 name에 전달됨. boolean과 비교할수 없다
		if (deletItem != false) {
			System.out.println("==============삭제가 완료되었습니다==============");
		} else {
			System.err.println("\"" + name + "\" 상품을 찾을수없습니다");
		}

		System.out.println("================삭제 후 상품 목록================");
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItem[i]);
		}
		
		

		
		
		System.out.print("상품을 모두 삭제하시겠습니까? : ");
		name = scanner.nextLine();
		myCart.removeAll(name);
		
		System.out.println(myItem[0]);
		
		
		System.out.println();
		System.out.println("================상품 프로그램 종료=============");
		System.out.println();

	}

}
