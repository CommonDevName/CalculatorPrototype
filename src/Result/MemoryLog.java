package Result;

import java.util.ArrayList;
import static Operation.Equation.equationResult;

/**
 *
 * @author CommonName(¿)
 */
public class MemoryLog {
    
    public static ArrayList <OpResult> Memory = new ArrayList<>();

    public static void memory(){
        Memory.add(new OpResult(equationResult));
    }
}
