package 정운성2A;

import java.text.SimpleDateFormat;
import java.util.Date;

	public class Todo {
	String name;
	Date day;
	boolean success;
		
	
	Todo (String name, Date day) {
		this.name = name;
		this.day = day;
		}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");		
		String str = String.format("[%s] %s", sdf.format(day), name);
		if(success == true) { 
			str += "\t[완료]";
		}		
		return str;
		}
	
	}

