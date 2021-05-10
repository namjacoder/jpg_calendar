package calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		//3-3 내가 개발
//		System.out.println("일  월  화  수 목  금 토");
//		System.out.println("--------------------");
//
//		for(int i=1; i<29; i++) {			//7일때 앞공백 하나 + 줄바꿈
//			if (i == 7) {
//				System.out.println(" "+i);	
//			}else if (i%7 == 0) {			//일주일마다 줄바꿈
//				System.out.println(i);
//			}else if (i<10){
//				System.out.print(" "+i+" ");//9까지 앞공백 하나 + 뒤공백 하나
//			}else {
//				System.out.print(i+" ");	//그 외 뒤공백하나
//			}
//		}

		//3-3 풀이 소스
//		System.out.println("일  월  화  수 목  금 토");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//---------------------------------------------------------------------------------------------		
		
		//3-7 특정 달의 최대 일수 출력하기 해답
		System.out.println("달을 입력하면 일수가 계산되어 나옵니다.");
		Scanner scanner = new Scanner(System.in);
		
		//int만 입력받는다
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("숫자를 입력하세요.");
		}

		//1~12 아니면 중단
		int nMonth = scanner.nextInt();
		if (nMonth < 1 || nMonth > 12) {
			System.out.println("1~12 사이의 숫자를 입력해주세요.");
			return;
		}
		
		scanner.close();

		int nEnd = 0;
		
		//한달이 30일
		if (nMonth == 4 || nMonth == 6 || nMonth == 9 || nMonth == 11) {
			nEnd = 30;
			
		//한달이 28일
		}else if (nMonth == 2) {
			nEnd = 28;

		//한달이 31일
		}else {
			nEnd = 31;
		}

		for(int i=1; i<=nEnd; i++) {		//7일때 앞공백 하나 + 줄바꿈
			if (i == 7) {
				System.out.println(" "+i);	
			}else if (i%7 == 0) {			//일주일마다 줄바꿈
				System.out.println(i);
			}else if (i<10){
				System.out.print(" "+i+" ");//9까지 앞공백 하나 + 뒤공백 하나
			}else {
				System.out.print(i+" ");	//그 외 뒤공백하나
			}
		}		
		
		
		//3-7 풀이 소스
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		System.out.println("달을 입력하세요.");
//		int month = scanner.nextInt();
//		
//		System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
//		scanner.close();
	}
//	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	
//	public int getMaxDaysOfMonth (int month) {
//		return MAX_DAYS[month - 1];
//	}
}
