package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Todo> list = null;
		
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리하세요
//		FileInputStream fis = new FileInputStream("ex03.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		ArrayList<Todo> list = (ArrayList<Todo>) ois.readObject();
		
		// 선생님 풀이
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();

		// 아래의 반복문 들은 똑같은 작업을 함		
		for(int i = 0; i < list.size(); i++) {				// array, list 가능
			Todo t = list.get(i);
			System.out.println(t);
		}
		System.out.println("\n====================\n");
		//
		for(Todo t : list) {								// array, list 가능
			System.out.println(t);
		}
		System.out.println("\n====================\n");
		//
		list.forEach(t -> System.out.println(t));			// list만 가능
		System.out.println("\n====================\n");
		//
		list.forEach(System.out::println);					// list만 가능
		System.out.println("\n====================\n");
	}
}
