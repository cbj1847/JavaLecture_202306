package ch14_io;

import java.io.Serializable;

/**
 * Serializable을 구현해야 직렬화가 가능하고, 파일 R/W 가능
 */
public class Product implements Serializable {
	private static final long serialVersionUID = 8970341541458884720L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
