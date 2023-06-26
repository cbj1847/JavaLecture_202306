package ch06_class;

public class Melon {
	// 속성, attribute, 주로 접근제한을 private로 설정
	private int rank;
	private String imgUrl;
	private String title;
	private String artist;
	private String album;
	
	// 생성자, constructor
	public Melon() {};
	public Melon(int rank, String imgUrl, String title, String artist, String album) {
		super();
		this.rank = rank;
		this.imgUrl = imgUrl;
		this.title = title;
		this.artist = artist;
		this.album = album;
	}
	
	// 메서드
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public String toString() {
		return "Melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album="
				+ album +  ", imgUrl=" + imgUrl + "]";
	}
	
	
}
