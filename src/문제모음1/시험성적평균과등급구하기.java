package 문제모음1;
import java.util.Scanner;
public class 시험성적평균과등급구하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어:");
		int kor= scan.nextInt();		
		System.out.print("영어:");
		int eng=scan.nextInt();
		System.out.print("수학:");
		int math=scan.nextInt();
		
		int total = kor+eng+math;
		double ever= total/3;

		if(ever>=90) {			
			System.out.println("평균:"+ever+"A입니다.");
		}if(ever<90&&ever>=80) {
			System.out.println("평균:"+ever+"B입니다.");
		}if(ever<80&&ever>=70) {
			System.out.println("평균:"+ever+"C입니다");
		}if(ever<70&&ever>=60) {
			System.out.println("평균:"+ever+"D입니다.");
		}if(ever<60){
			System.out.println("평균:"+ever+"F입니다");
		}
	}

}
