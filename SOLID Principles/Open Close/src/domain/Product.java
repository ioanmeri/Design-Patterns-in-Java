package domain;
import filterTypes.Color;
import filterTypes.Size;

public class Product {

	public String name;
	public Color color;
	public Size size;
	
	public Product(String name, Color color, Size size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
}
