package InterfacesChallenge;
//abstract class? in java interface is abstract
import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
	List<String> write();
	void read(List<String> savedValues);
	
}
