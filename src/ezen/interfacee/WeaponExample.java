package ezen.interfacee;

public class WeaponExample {

	public static void main(String[] args) {
		
		//기존 상속과 달리, Weapon 타입의 Sword를 생성하지만
		//weapon에서 Sword의 메소드 사용 가능
		Weapon weapon = new Sword();
		weapon.attack();
		
		weapon = new Gun();
		weapon.attack();
		
		weapon = new Club();
		weapon.attack();
	}

}
