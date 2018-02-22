import java.util.ArrayList;
import java.util.List;

public class Journal {

	//Journal allows access to the entries (add, remove)
	private final List<String> entries = new ArrayList<String>();
	private static int count = 0;

	//all these responsibilities are directly linked to the journal
	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);
	}
	
	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	//lineSeparator is a line break
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}

}