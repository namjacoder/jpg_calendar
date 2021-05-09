package calendar;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("일  월  화  수 목  금 토");
		System.out.println("--------------------");

		for(int i=1; i<29; i++) {			//7일때 앞공백 하나 + 줄바꿈
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
	}
}
