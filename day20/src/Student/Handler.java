package Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {
	
	private List<Student> list = new ArrayList<Student>();
	private File f = new File("student.txt");
	private Scanner loader;
	private FileWriter writer;
	
	
	public Handler() throws IOException {
		if(f.exists()) {
			loader = new Scanner(f);
			int cnt = 0;
			while(loader.hasNextLine()) {
				cnt++;
				String line = loader.nextLine();
				String[] arr = line.split(",");
				String name = arr[0];
				int kor = Integer.parseInt(arr[1]);
				int eng = Integer.parseInt(arr[2]);
				int mat = Integer.parseInt(arr[3]);
				Student st = new Student(name, kor, eng, mat);
				list.add(st);
			}
			loader.close();
			System.out.printf("\n\t%d데이터 불러오기 완료 !!\n\n", cnt);
		}
		else {
			System.out.println("불러올 데이터가 없습니다");
		}
	}
	
	public void save() throws IOException {
		writer = new FileWriter(f);
		for(int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			writer.append(st.getFileData());
		}
		writer.flush();
		writer.close();
		System.out.println("저장 완료 !!");
	}
	
	public void showList() {
		for(Student st : list) {
			st.show();
		}
		System.out.println();
	}

	public void insert(Student st) {
		list.add(st);
		
	}

	public int delete(String name) {
		for(int i = 0; i < list.size();  i++) {
			if(list.get(i).name.equals(name)) {
				list.remove(i);
				return 1;
			}
		}
		return 0;		
	}
	
		// list에서 삭제할 때는 반복문안에서 삭제하지 말자
		// list.remove(int index) // index번째의 객체를 제거한다
		// list.remove(Object o)  // o와 일치하는 객체를 제거한다(equals)
	
	//		public void delete(String name) {
	//			int index = -1;
	//			for(int i = 0; i<list.size(); i++) {
	//				if(list.get(i).name.equals(name)) {
	//					index = i;
	//				}
	//			}
	//			if(index != -1) {
	//				list.remove(index);
	//			}
	//		}
		
		// list의 remove를 호추랗여 객체를 삭제하면 그 즉시 size가 변화한다
		// for문으로 접근하면, 지정된 횟수만큼 반복하기로 약속하고 시작하는데
		// 도중에 size가 변경되면, 지정된 횟수만큼 반복을 수행할 수 없어지기 때문에
		// 예외가 발생할 수 있다.
	
	//	list.removeIf(st->st.name.equals(name));
		// 조건에 맞는 객체를 찾아서 제거한다
		

	public int find(String name) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).name.equals(name)) {
				list.get(i).show();
				return 1;
			}
		}
		return 0;
	}

	public int nameSort() {
		list.sort((a,b) ->  a.name.compareTo(b.name));
		return 1;
	}

	public int sumSort() {
		list.sort((a,b) -> a.sum - b.sum);
		return 1;
	}

}
