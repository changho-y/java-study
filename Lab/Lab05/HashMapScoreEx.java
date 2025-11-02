// J-51			HashMap
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김치남", 100);
		scoreMap.put("최민성", 40);
		scoreMap.put("윤창호", 100);
		scoreMap.put("왕샤브", 98);
		scoreMap.put("퀸러브", 50);
		scoreMap.put("박경리", 80);
		
		System.out.println("HashMap의 요소 개수 :" + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
		
	}

}
