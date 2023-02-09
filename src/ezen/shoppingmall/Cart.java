package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품을 저장하는 클래스 생성 구현 기능 : 상품담기, 제거, 검색
 * 
 * @author 유선우
 * @Date 2023. 1. 5.
 */
public class Cart {
	// 배열 타입,이름결정
	private Item[] items;
	private int count;
	private int capacity;

	public Cart() {
	}

	// 카트의 용량 설정
	public Cart(int capacity) {
		// 배열 생성후, 크기 결정
		items = new Item[capacity];
		this.capacity = capacity;
	}

	// 카트에 담긴 전체 목록 반환
	public Item[] getItems() {
		return items;
	}

	public int getCount() {
		return count;
	}
	
	
//  카트 내부를 임의로 변경할일은 없으므로 제거
//	public void setItems(Item[] items) {
//		this.items = items;
//	}

//	public void setCount(int count) {
//		this.count = count;
//	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// 메소드 구현
	// 카트에 상품 담기
	// 매개변수의 다형성
	public void addItem(Item item) {
		items[count++] = item;
	}

	// 상품 이름으로 상품 검색기능 추가
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
			if (items[i].getName().equals(name)) {
				return items[i];
			}
		}
		return null;
	}
//	public Item findByName(String name) {
//		for (int i = 0; i < count; i++) {
//			// 반환할 값으로 자동 형변환
//			// 기존 items[]는 Item[](배열)타입이다
//			Item item = items[i];
//			if (item.getName().equals(name)) {
//				return item;
//			}
//		}
//		return null;
//	}
	
	public boolean removeItem(String name) {
	
		for (int i = 0; i < count; i++) {
			if (items[i].getName().equals(name)) {
				for (int j = i; j < count-1; j++) {
					items[j] = items[j+1];
				}
				System.out.println("\""+items[i].getName()+"\""+"삭제");
				count--;
				return true;
			}
		}
		return false;
	}

	
	//equals 재정의해서 일반 String을 인식 못함
//	public void removeAll() {
//		for (int i = 0; i < count; i++) {
//			items[i] = null;
//		}
//		count = 0;
//		System.out.println("삭제완료");
//	}
	public void removeAll(String cheak) {
		if(cheak.equals("예")) {
		for (int i = 0; i < count; i++) {
			items[i] = null;
		}
		count = 0;
		}
		
		//원리 : capacity크기의 배열을 새로 만들어줌
//		if(cheak.equals("예")) {
//			items = new Item[capacity];
//			count = 0;
//		}
	}
}
