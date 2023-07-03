package hw.ch14;

import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		String wordString = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";
		wordString = wordString.replaceAll("[^a-zA-Z ]", "");
		String[] wordStringSplited = wordString.split(" ");
		
		System.out.println("단어의 갯수 : " + wordStringSplited.length);
		
		// 고유단어의 갯수
		Set<String> set = new HashSet<>();
		for (String word: wordStringSplited)
			set.add(word.toLowerCase());
		System.out.println("고유단어의 갯수 : " + set.size());
		
		// 고유단어가 몇번 사용되었는지
		Map<String, Integer> map = new HashMap<>();
		for (String word : wordStringSplited) {
			String newWord = word.toLowerCase();
			if (map.containsKey(newWord))
				map.put(newWord, map.get(newWord) + 1);
			else 
				map.put(newWord, 1);
		}
		
		// value로 sort
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		// entryList.sort(Map.Entry.comparingByValue()); 		// value 오름차순 정렬
		entryList.sort(new MyComparator());						// 내림차순
		for (Map.Entry<String, Integer> entry : entryList) {
			if (entry.getValue() >= 4)
				System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
	}
}
