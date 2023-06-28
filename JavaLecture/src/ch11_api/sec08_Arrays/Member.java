package ch11_api.sec08_Arrays;

public class Member implements Comparable {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		// id 기준
		Member m = (Member) o;
		return this.id - m.getId();
	}

}
