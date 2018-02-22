package betterFilter;
import java.util.List;
import java.util.stream.Stream;

import specifications.Specification;

public interface Filter <T> {

	Stream<T> filter(List<T> items, Specification <T> spec);
	
}
