package opp;

public class Test {

	private String name;
	private int[] jumsu;//배열 사용해서 값을 받는다



	public  Test() {
		this(null, null);
	}
	
	
	public Test(String name, int[] jumsu) {//정수형 배열 입력받는법
		this.name = name;
		this.jumsu = jumsu;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getJumsu() {
		return jumsu;
	}

	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}

	//총점메서드(getSum),평균메서드(getAvg)
	public int getSum() {
		int sum = 0; //반드시 초기화할것
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	
	public double getAvg() {
		return (double)getSum()/jumsu.length;
	}
	
}

