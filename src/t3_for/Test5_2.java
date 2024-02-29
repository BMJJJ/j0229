package t3_for;

//중첩 포문 (중첩 포문은 안쪽과 바깥쪽의 수행횟수를 곱해서 한다)
public class Test5_2 {
	public static void main(String[] args) {
		int cnt =0;
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=4; j++) {
				cnt++;;
				System.out.println(cnt + " :  i = "+i+" , j = " +j);
			}
			System.out.println();
		}
	}
}
