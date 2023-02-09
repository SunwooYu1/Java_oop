package opp;

//중복정의 규칙
//메소드 이름을 똑같이 하면서 정의하고자 할땐
// 매개변수 갯수나 데이터 타입이 반드시 달라야한다
class Calculator{
	
	
	
	//메소드 오버로딩(중복정의)
	public static int sum(int x, int y) {
		return x+y;
	}
	public static double sum(double x, double y) {
		return x+y;
	}
	public static int sum(int x, int y, int z) {
		return x+y+z;
	}
	
}





public class Overloading {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	
		System.out.println(calculator.sum(1, 2));
		//인트
		calculator.sum(0, 0);
		//더블
		calculator.sum(0, 0);
		//3개 전달
		calculator.sum(0, 0, 0);

	}

}
