package opp;

//call by Value vs Call by reference
public class callMethodExample {

	public static void doTask(int x) {
		x += 10;
		System.out.println(x);
	}
	
	public static void doTask2(Account account) {
		account.deposit(10000);
		System.out.println(account.getRestMoney());
	}
	
	
	public static void main(String[] args) {
		int i = 100;
		//Call by Value
		doTask(i);
		System.out.println(i);
	
		
		//레퍼런스타입을 받는경우.
		Account account = new Account("1111-2222","가나다씨",1234,100000);
		//기본적으로 초기화되어 들어오기때문에, 이전 값이 바뀌진 않는다
		System.out.println(account.getRestMoney()+": 실행 전 값");
		doTask2(account);//doTask에 account 정보를 전달해주고, 수정할수있게한다
		System.out.println(account.getRestMoney()+": 실행 후 값");
	}

}
