package ro.ase.csie.cts.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class SavesHistory {

	List<SuperheroMemento> autosaves = new ArrayList<>();
	
	public void addAutoSave(SuperheroMemento savedImage) {
		this.autosaves.add(savedImage);
	}
	
	public SuperheroMemento getAutosave(int index) {
		if(index < 0 || index >= autosaves.size())
			throw new UnsupportedOperationException();
		else {
			SuperheroMemento memento = this.autosaves.get(index);
			this.autosaves.remove(index);
			return memento;
		}
	}
	
}
