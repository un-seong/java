package dddddddddd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Actor {
	String name;
	String birth;
	
	Actor(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 생일 : %s\n", name, birth);
	}
}


public class ddddddddddd {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\20221110\\actorBirth.txt");
		Scanner sc = new Scanner(f);
		List<Actor> list = new ArrayList<Actor>();
	
		String line = "";
				
		while(sc.hasNextLine()) {
			line += sc.nextLine();
		}
		
		
		line = line.replace(" ", "");
		line = line.replace("[", "");
		line = line.replace("]", "");
		line = line.replace("{", "");
		line = line.replace("}", "");
		line = line.replace("\"", "");
		String[] arr = line.split(",");
//		System.out.println(line);
		
		for(int i = 0; i < arr.length-1; i++) {
			String name = arr[i].substring(5, arr[i].length());
			i++;
//			System.out.println("이름 : " + name);
			String birth = arr[i].substring(6,arr[i].length());
//			System.out.println("생일 : " + birth);
			Actor a = new Actor(name, birth);
			list.add(a);
		}
		
				
		
	
		System.out.println("끗");
		
		File f1 = new File("C:\\20221110\\actor.txt");
		FileWriter fw = new FileWriter(f1);
		
		// 향상된 for문
		for(Actor a : list) {
//			String str = a.toString();
//			fw.append(str);
			fw.append(a.toString());
			System.out.println(a);
			
		}
		
		fw.flush();
		fw.close();
		
		
		
		
		sc.close();
		
	
		
		
	}
}
