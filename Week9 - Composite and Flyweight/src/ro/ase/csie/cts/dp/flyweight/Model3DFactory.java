package ro.ase.csie.cts.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

//eager instantiation
public class Model3DFactory {
	
	static Map<String, ModelFlyweightActions> models = new HashMap<>();
	
	static {
		models.put(ModelTypes.SOLDIER.toString(), new Model3DFlyweight("Soldier"));
		models.put(ModelTypes.TREE.toString(), new Model3DFlyweight("Tree"));
	}
	
	static ModelFlyweightActions getModel(ModelTypes type) {
		return models.get(type.toString());
	}
	
}
