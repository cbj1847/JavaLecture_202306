package ch13_collection.sec01_list;

// import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Ex02_BoardList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new Board(1, "james", "subject", "content"));
		list.add(new Board(2, "Maria", "Title", "content"));
		
		// 객체 순회 출력
		for (Board board : list) {
			System.out.println(board);
		}
		
		list = generateBoard(3);
		System.out.println("============================================================");
		list.forEach(x -> System.out.println(x));
		
		Board res = searchBoard(list, 102);
		System.out.println("검색결과 : " + res);
		
	}
	private static List<Board> generateBoard(int count) {
		List<Board> list = new ArrayList<>();
		for (int i=1; i<=count; i++) {
			list.add(new Board(100+i, "저자"+i, "제목"+i, "내용"+i));
		}
		return list;
	}

	private static Board searchBoard(List<Board> list, int id) {
		for (Board board : list) {
			if (board.getBid() == id)
				return board;
		}
		return null;
		
		
	}
}
