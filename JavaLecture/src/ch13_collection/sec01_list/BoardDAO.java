package ch13_collection.sec01_list;

import java.util.List;

public interface BoardDAO {
	List<Board> getBoardList(int count);		// count만큼 boardList 반환
	
	Board getBoard(int bid);					// bid 검색 결과 반환
	
	Board getBoardBySubject(String subject);	// subject 검색 결과 반환
	
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(int bid);
	
	
}
