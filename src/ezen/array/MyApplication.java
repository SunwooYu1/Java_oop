package ezen.array;

/**
 * @author 유선우
 * 2023. 1. 3.
 * 명령행 인자 처리하기
 * java MyApplication some.txt
 */
public class MyApplication {

	public static void main(String[] args) {
		String fileName1 = null;
		String fileName2 = null;
		if(args.length != 2) {
			System.out.println("Usage : java MyApplication <전달인자1> <전달인자2>");
			return;
			}
		
		fileName1 = args[0];
		fileName2 = args[1];
		//fileName을 some.txt으로 전송
		System.out.println("전달된 파일 이름 : "+ fileName1);
		System.out.println("전달된 파일 이름 : "+ fileName2);

	}

}
