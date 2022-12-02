package serialize;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Handler {
	
	private ArrayList<Todo> list;
	
	public Handler() throws ClassNotFoundException, IOException {
		this.load();
	}
				
	@SuppressWarnings({ "unchecked" })
	private void load() throws IOException, ClassNotFoundException {	// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();

		System.out.println("\t불러오기 완료");
	}
	
	public void show() {
		for(int i = 0; i< list.size(); i++) {
				System.out.print(i+1+"] ");
				System.out.println(list.get(i).toString());
				
			}
		}
		
	public void save() throws IOException {	// main에서 호출함. 리스트객체를 파일로 저장
		FileWriter fw = new FileWriter("todo.txt");
		fw.append(list.toString());
		fw.flush();
		fw.close();
		System.out.println("저장 완료 !!");
	}
	
	public int insert(Todo todo) {	// 객체를 전달받아서 추가하기
			list.add(todo);
			return 1;
	}
	
	public int delete(int select) {	// 선택한 객체의 index를 확인하여 제거하기
		list.remove(select-1);
		return 1;
	}

	

	
		
}
