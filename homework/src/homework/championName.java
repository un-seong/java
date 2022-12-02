package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Champname {
	String name;
	
	Champname(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format(name);
	}
}

public class championName {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\lol\\leagueoflegends.txt");
		Scanner sc = new Scanner(f);
		List<Champname> list = new ArrayList<Champname>();
				
		String line = "";
		
		while(sc.hasNextLine()) {
			line += sc.nextLine();
		}
		
		line = line.replace("\"", "");
		line = line.replace("'", "");
		line = line.replace(" ", "");
		line = line.replace(".", "");
		line = line.replace("&Willump", "");
		line = line.replace("BelVeth", "Belveth");
		line = line.replace("ChoGath", "Chogath");
		line = line.replace("KaiSa", "Kaisa");
		line = line.replace("KhaZix", "Khazix");
		line = line.replace("LeBlanc", "Leblanc");
		line = line.replace("Wukong", "MonkeyKing");
		line = line.replace("RenataGlasc", "Renata");
		line = line.replace("VelKoz", "Velkoz");
			
		
//		String[] arr = line.split("name");
//		System.out.println(arr[1]);
//		System.out.println(arr[167]);
//		System.out.println(arr[168]); // 챔피언 총 사진 168
				
		String[] arr = line.split(",");
//		System.out.println(arr[6]);	// 아트   콤마로 나눴을때
//		System.out.println(arr[49]); // 아리
		
		
		// 콤마로 나눈 뒤 name을 포함하면 그 뒤로 4글자를 잘라서 저장
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains("name:")) {
				String name = arr[i].substring(5);
//				System.out.println(name);
				Champname c = new Champname(name);
				list.add(c);	// 이름을 list에 추가
			}
		}
			
		System.out.println("list : " + list.toString());
		System.out.println("끗");
		
		// 이름만 텍스트로 저장한것
		File f1 = new File("D:\\lol\\lolchamp.txt");
		FileWriter fw = new FileWriter(f1);
		
		for(Champname a : list) {
			fw.append(a.toString());
			fw.append("\n");
//			System.out.println(a);
		}
		fw.flush();
		fw.close();
		
		sc.close();
				
		File f2 = new File("D:\\lol\\imgAddress.txt");
		FileWriter fw1 = new FileWriter(f2);
		byte[] buffer = new byte[1024];
	
		// 주소 값 완성(resultUrl) 및 주소 텍스트 저장 (fw1) 및 주소 이미지 파일로 변환(fos)
		String path = "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/";
		
		for(int i = 0; i < list.size(); i++) {
			String resultUrl = path + list.get(i)+ "_0.jpg";
			System.out.println(resultUrl);	// 완성된 url출력
			
			URL url = new URL(resultUrl);
			URLConnection ucon = url.openConnection();
			InputStream is = ucon.getInputStream();
			
			FileOutputStream fos = new FileOutputStream("D:\\lol\\completion\\"+ list.get(i).toString()+".jpg");
			
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bis.read(buf, 0, 1024)) != -1) {
				bos.write(buf, 0, len);
			}
			
			bos.close();
			bis.close();
			fos.close();
			is.close();
			
		}
		
		
//		InputStream fis = url.openStream();
//		FileOutputStream fos = new FileOutputStream("D:\\lol\\completion\\"+ list.get(i).toString()+".jpg");
//					
//		fos.write(buffer);
//		fw1.append(resultUrl+"\n");
//		fis.close();
//		fos.close();
//		fw1.flush();
//		fw1.close();
		
		
		
	}
}
