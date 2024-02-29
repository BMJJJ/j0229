package t1_while;

// 반복문 제어(조건문의 처음으로 돌려보낸다.)
public class Test4_2 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			i++;
			
			//i값이 짝수인 경우만 출력하시오.(단, 홀수인경우는 출력하지 않고 다시 조건을 비교)
			if(i % 2 != 0) continue;// 만족하지 않을경우 반복문의 처음으로 올라가라
				
			System.out.println(i);
		}
	}
}
