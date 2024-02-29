package t2_do_while;

/*
  do{
   수행할 내용
} while(조건식);  
 */


public class Test2 {
	public static void main(String[] args) {
		int i = 10;
		
		//do while은 무조건 한번은 실행,while 단독은 실행x(조건이 맞지 않으면)
		do {
			i++;
			System.out.println(i);
		}while(i<10);
	}
}
