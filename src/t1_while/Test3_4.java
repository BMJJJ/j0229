package t1_while;

//무한루프 탈출구 만들기
public class Test3_4 {
	public static void main(String[] args) {
		int i = 0;
		boolean run = true;//(boolean 논리형)
		
		while(run) {
			i++;
			System.out.println(i + "안녕");
			
			//if(i ==10)break;
			if(i ==10)run = false;
		}
	}
}
