package t1_while;

//무한루프 탈출구 만들기
public class Test3_3 {
	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i + "안녕");
			
			if(i ==10)break;
		}
	}
}
