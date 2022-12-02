package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		FileWriter fw = new FileWriter(f, true);	// append : true/false -> 이어쓰기/덮어쓰기	
		// autoFlush : 자동으로 flush가 설정 되어 있음
		
		fw.append("Hello");
		fw.append(",");
		fw.append("world\n");
		
		fw.close();
		
		System.out.println("끝");
	}
}
