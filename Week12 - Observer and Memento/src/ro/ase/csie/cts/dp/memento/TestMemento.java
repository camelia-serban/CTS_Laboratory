package ro.ase.csie.cts.dp.memento;

public class TestMemento {

	public static void main(String[] args) {

		Superhero superman = new Superhero("Superman", 500, "Fly");
		
		SuperheroMemento autosave1 = superman.save();
		
		superman.name = "Batman";
		System.out.println("Hero name is " + superman.name);
		
		superman.load(autosave1);
		System.out.println("Hero name is " + superman.name);
		
	}

}
