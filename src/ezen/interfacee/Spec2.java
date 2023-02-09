package ezen.interfacee;

/**
 * 인터페이스 간에도 상속이 가능하며 extends를 이용한 상속과 
 * 다중상속이 모두 가능하다
 * @author 유선우
 * @Date 2023. 1. 6.
 */
public interface Spec2 extends Spec1, Weapon {
	public void doTask3();
}