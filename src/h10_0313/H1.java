package h10_0313;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 콘솔을 통해서 파일명을 입력받은 후, 입력받은 파일의 성격을 구해서 화면에 출력하시오
 * 예) 파일명을 입력하세요 :  abc.jpg
 * 		abc.jpg ==> 그림파일
 * 		계속할까요?(Y/N) y
 * =======================================
 * 예) 파일명을 입력하세요 :  atom.txt
 * 		atom.txt ==> 텍스트파일
 * 		계속할까요?(Y/N) y
 * =======================================
 * 예) 파일명을 입력하세요 :  sbs.xlsx
 * 		sbs.xlsx ==> 엑셀파일
 * 		계속할까요?(Y/N) y
 * =======================================
 * 예) 파일명을 입력하세요 :  seoul.hwp
 * 		seoul.hwp ==> 한글파일
 * 		계속할까요?(Y/N) y
 * =======================================
 * 예) 파일명을 입력하세요 :  busan.gif
 * 		busan.gif ==> 그림파일
 * 		계속할까요?(Y/N) n
 * =======================================
 * 		수고하셨습니다
 */
		

public class H1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("파일명을 입력하세요 : ");
			String file = sc.next();
			
			String extension = file.substring(file.indexOf(".")+1);
			HashMap<String, String> map = new HashMap<>();
			
			map.put("jpg", "그림파일");
			map.put("txt", "텍스트파일");
			map.put("xlsx", "엑셀파일");
			map.put("hwp", "한글파일");
			map.put("ppt", "파워포인트문서파일");
			map.put("gif", "그림파일");
			map.put("docx", "워드파일");
			map.put("pdf", "PDF파일");
			map.put("mp3", "음악파일");
			map.put("mp4", "비디오파일");
			map.put("zip", "압축파일");
			map.put("exe", "윈도우실행파일");
			//+ 더 생성하면 된다...
			
			
			if (map.get(extension) != null) System.out.println(file+" ==> "+ map.get(extension));
			else System.out.println("확장자를 못찾았습니다.");			
			System.out.print("계속할까요?(Y/N)");
			String ans = sc.next().toUpperCase();
			if(ans.equals("N")) break;
			System.out.println("================================\n");
			
		}
		
		System.out.println("수고하셨습니다");
		sc.close();
		
	}
}
