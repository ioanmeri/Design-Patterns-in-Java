package specifications;

public interface Specification<T> {

	//generic interface <T>
	//if a product satisfies a criteria
	boolean isSatisfied(T item);
	
}
