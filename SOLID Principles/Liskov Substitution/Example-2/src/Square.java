
public class Square extends Rectangle{

	public Square() {}
	
	public Square(int size) {
		width = height = size;
	}
	
	//Violation of Liskov Substitution Principle
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(height);
	}
	
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(width);
	}
	
}