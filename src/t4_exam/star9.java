package t4_exam;
/*
      *     공백부분 
     ***
    *****
   *******
  *********
   *******
    *****
     ***
      *
   
   //홀수별을 그리게끔  반씩 생각해보기  2n(짝수) (2n+1,2n-1)(홀수)
 */
public class star9 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
