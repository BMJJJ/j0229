package t3_for;

//중첩 포문 (중첩 포문은 안쪽과 바깥쪽의 수행횟수를 곱해서 한다)
public class Test8 {
	public static void main(String[] args) {
		int cnt =0;
		
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=4; j++) {
				cnt++;;
				System.out.println(cnt + " :  i = "+i+" , j = " +j);
				
				//앞의 문장을 6번 수행후 탈출시키고자 한다.
				if(cnt == 6) return;//현재 메소드를 탈출 나머지 내용이 남아 있더라도 건들지 않음
			}
			System.out.println();
		}
		System.out.println("작업끝....");
	}
}
