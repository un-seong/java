package sort;

public class Quiz {
	public static void main(String[] args) {
		String[] nameArray = {"이지은", "홍진호", "강호동", "주호민", "이병건"};
		int[] ageArray = {30, 41, 53, 42, 40};


		// 1) 나이 순으로 내림차순 정렬 후 출력하세요
		for(int y=0; y<ageArray.length-1; y++) {
			for(int z=y+1; z<ageArray.length; z++) {
				if(ageArray[y] < ageArray[z]) {		// 나이를 비교하여 바꾼다
					int tmp = ageArray[y];
					ageArray[y] = ageArray[z];
					ageArray[z] = tmp;				// 나이를 교환할 때
					
					String tmp1 = nameArray[y];		// 같은 위치의 이름도 교환한다
					nameArray[y] = nameArray[z];
					nameArray[z] = tmp1;
				}
			}
		}		
		show(nameArray, ageArray);
		
		// 2) 이름 순으로 오름 차순 정렬 후 출력하세요
		for(int i = 0; i <nameArray.length -1; i++) {
			for(int j = i+1; j < nameArray.length; j ++) {
				if (nameArray[i].compareTo(nameArray[j]) > 0) {
					String tmp1 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp1;
					
					int tmp2 = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp2;
				}
			}
		}
		show(nameArray, ageArray);
		
		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다.
		
		
		
		
		
	}

	private static void show(String[] nameArray, int[] ageArray) {
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s : %d살\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
