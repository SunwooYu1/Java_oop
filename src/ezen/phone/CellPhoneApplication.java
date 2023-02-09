package ezen.phone;

public class CellPhoneApplication {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone("삼성", "검정");
		System.out.println(cellphone.getColor());
		System.out.println(cellphone.getModel());
		cellphone.bell();
		cellphone.sendVoice("안녕");
		cellphone.resiveVoice("잘가");
		//~~
	
		
		DmpCellPhone cellPhone2 = new DmpCellPhone("엘지", "빨강", 10);
		cellPhone2.getChannel();
		cellPhone2.bell();
		cellPhone2.sendVoice("hi");
		System.out.println(cellPhone2.getColor());
		System.out.println(cellPhone2.getModel());
		System.out.println(cellPhone2.getChannel());
		}

}
