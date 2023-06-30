package hw.ch14;

import java.time.LocalDate;
import java.util.Objects;

public class Company implements Comparable {
	private int id;
	private String name;
	private String position;
	private LocalDate joinDate;
	
	public Company(int id, String name, String position, LocalDate joinDate) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}

	public Company(int id, String name, Position position, LocalDate joinDate) {
		this.id = id;
		this.name = name;
		this.position = Position position;
		this.joinDate = joinDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

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

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Company)) {
			return false;
		}
		Company cp = (Company) obj;
		return this.id == cp.getId() && this.name.equals(cp.getName());
	}

	@Override
	public int compareTo(Object o) {
		Company cp = (Company) o;
		if (position.equals(cp.getPosition()))
			return joinDate.compareTo(getJoinDate());
		return position.compareTo(cp.getPosition());
	}
	
}
