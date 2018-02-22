package oldFilter;
import java.util.List;
import java.util.stream.Stream;

import domain.Product;
import filterTypes.Color;
import filterTypes.Size;

public class ProductFilter {

	public Stream<Product> filterByColor(List<Product> products,
										 Color color){
		
		return products.stream().filter(p -> p.color == color);
	}
	
	
	public Stream<Product> filterBySize(List<Product> products,
			 							Size size){

		return products.stream().filter(p -> p.size == size);
	}
	
	
	public Stream<Product> filterBySizeAndColor(
			List<Product> products,
			Size size,
			Color color
			){
		
		return products.stream().filter(p -> p.size == size 
				&& p.color == color);
	}
}
