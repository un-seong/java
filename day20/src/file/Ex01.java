package file;

import java.io.IOException;
import java.io.File;	// 자바에서 파일을 처리하기 위한 클래스

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 사용자에게 입력을 허용하면 다양한 입출력 관련 예외가 발생할 수 있다 !!
		// IOException : Input / Output Exception 
		
//		System.out.println("글자 하나 입력 : ");
//		char ch = (char)System.in.read();
//		System.out.println("입력한 글자는 " + ch);
		
		File f1 = new File("a.txt");				// 파일 이름만 문자열로 전달 (상대경로)
		File f2 = new File("C:\\20221110");			// 폴더 및 파일의 절대경로를 문자열로 전달
		File f3 = new File(f2, "b.txt");			// 부모 경로를 파일로, 파일이름은 문자열로 전달
		File f4 = new File("C:\\20221110", "c.txt");// 부모 경로를 문자열로, 파일이름은 문자열로 전달
		
//		자바에서 위치와 이름을 지정하여 파일 객체를 생성해도, 실제 파일이 만들어지는 것은 아니다
//		자바에서 파일 객체 생성하는 작업은 실제 파일의 존재와 상관이 없다
		
		f1.createNewFile();	// 비어 있는 새로운 파일을 생성한다 (생성 여부를 boolean으로 반환)
		f2.mkdir();			// 폴더(디렉토리)를 생성한다 (생성 여부를 boolean으로 반환)
		f3.createNewFile();
		f4.createNewFile();
		
		System.out.println("f3의 절대 경로 : " + f3.getAbsolutePath());
		System.out.println("f3의 (상대)경로 : "+ f3.getName());
		System.out.println("f3의 파일 크기 (byte) : " + f3.length());
		
		System.out.println("f3가 존재하는가? : "+ f3.exists());
		System.out.println("f3는 폴더인가? : " + f3.isDirectory());
		System.out.println("f3는 파일인가? : " + f3.isFile());
		
		System.out.println("f3는 읽기 가능한가? : " + f3.canRead());
		System.out.println("f3는 쓰기 가능한가? : "+ f3.canWrite());
		System.out.println("f3는 실행 가능한가? : " + f3.canExecute());
		System.out.println();
			
		System.out.println("f2의 내부 파일 목록 : ");
		String[] list = f2.list();
		for(int i = 0 ; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
		
		
		System.out.println("완료 !!");		
		
		
	}
}
