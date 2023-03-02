//한 라인을 읽고, 공백으로 분리된 단어와 공백의 수가 몇 개 인지 출력을 반복하는 프로그램을 완성하세요. (exit가 입력되면 종료한다.)

import java.util.*;
public class Assignment10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String s;
		
		while(true) {
			System.out.println("한 줄로 문장을 입력하세요. (종료는 exit 입력) >>");
			s = input.nextLine();
			
			if(s.equals("exit")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}

			StringTokenizer st = new StringTokenizer(s, " ");
			
			int n = st.countTokens();
			System.out.println("어절 개수는 " + n);
			System.out.println("공백 개수는 " + (n + 1));
		}
	}
}