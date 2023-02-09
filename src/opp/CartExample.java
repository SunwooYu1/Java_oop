package opp;

import java.util.Date;

import com.ezen.shop.Cart;

//static import
import static java.lang.System.out;
//메소드 임포트
import static java.lang.Math.*; 

//해당 구역에 임포트 생성
//import com.ezen.shop.Cart;


public class CartExample {

	public static void main(String[] args) {
		Cart cart;
		cart = new Cart(); //디폴트 생성자 생성
		cart.addItem("초코파이");
		
		Date today = new Date();
		String ymd = today.toLocaleString();
		System.out.println(ymd);
		out.println("스테틱 임포트 사용하기");
		
		int x = 40, y = 30;
		int max = max(x, y);
		out.println(max);
		
		
	}

}
