package ezen.interfacee;


/**
 * 유닛이 사용하는 모든 무기들에 대한 표준 규약(명세)
 * 인터페이스 - 역할
 * @author 유선우
 * @Date 2023. 1. 6.
 */
public interface Weapon {
	int WEIGHT = 1;//이렇게 처리하면 기본적으로 상수처리가됨
	//== public static final int weight = 1;
	// 상수처리되는 값은 대문자로 입력
	
	public void attack();

}
