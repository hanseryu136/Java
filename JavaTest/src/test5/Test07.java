package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	????????????? makeLotto() {
		
		??????? lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(????????????);
			lottoSet.add(num);
			
			if(?????????) {
				break;
			}
		}
	
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
	
		return treeSet;
	}
}
