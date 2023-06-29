package ch13_collection.sec01_list;

public class Board {
	private int bid;
	private String writer;
	private String Title;
	private String content;
	
	public Board() {}
	
	public Board(String writer, String Title, String content) {
		this.writer = writer;
		this.Title = Title;
		this.content = content;
	}
	
	public Board(String Title, String content) {
		this.Title = Title;
		this.content = content;
	}
	
	public Board(int bid, String writer, String title, String content) {
		this.bid = bid;
		this.writer = writer;
		this.Title = title;
		this.content = content;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		this.Title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bid=" + bid + ", writer=" + writer + ", Title=" + Title + ", content=" + content + "]";
	}
	 
	
}
