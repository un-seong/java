package 정운성2A;

public class Handler {
	
	Todo[] arr = new Todo[5];
		
	String todoAll() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].toString();
				result += "\n";
			}
		}
		return result;
	}
		
	int insert(Todo td) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == null) { 
				arr[i] = td;
				return 1;
			}
		}
		return 0;
	}

	int delete(String todoDelete) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(todoDelete)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

	int completion(String todoCompletion) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(todoCompletion)) {
				arr[i].success = true;
				return 1;
			}
		}
		return 0;
	}
}
