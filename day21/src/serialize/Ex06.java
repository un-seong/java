package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class Ex06 {
	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// 웹 상 이미지 주소를 작성
//		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMTdfOTQg%2FMDAxNjY1OTg5MDA5ODQ4.OhDXHb_6mBN1tD-7nM8ZjP4fmFQNjWtyfqBIBGb0qG8g.Jj_wrHNFn1mXqmuz3E-gVy9mfNS32pxG_SuK42BaLSUg.JPEG.hyjaes2%2FIMG_0759.JPG&type=sc960_832";
//		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMTNfMTg2%2FMDAxNjY1NjIwNTY2OTE4.rRo0ExXcDmSTzxGy-ViYOIOKtGa3r3HYj2a-rskFtPIg.pkY8XvnzqV98OfLcNw12H8jnfIwBh0mGCDNYOo1Ibykg.JPEG.baby0817%2F8207q_301.jpg&type=sc960_832";
		String path = "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zyra_0.jpg";
				
		URL url = new URL(path);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 연결된 자원의 컨테트 유형을 문자열 형태로 확인할 수 있다
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다");
		System.out.println("원하는 파일 이름을 입력하세요 : ");
		fileName = sc.nextLine();
			
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		byte[] buffer = new byte[1024];
		int readBytes;
				
		while((readBytes = fis.read(buffer)) != -1 ) {
			fos.write(buffer, 0, readBytes);
			System.out.printf("=== %d byte ===\n", readBytes);
		}
		
		fis.close();
		fos.close();
		
	}
}
