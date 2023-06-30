package hw.ch13;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<Board> list = dao.getBoardList();
		
		list.forEach(x -> System.out.println(x));
	}

}
