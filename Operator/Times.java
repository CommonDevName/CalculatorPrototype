package Operator;

import static Operation.Equation.number;
import static Operation.Equation.cache;
import static Operation.Equation.result;

/**
 *
 * @author CommonName(¿)
 */
public class Times {
    
    public static void Times(){
        result = (result == 0)?
            cache * number : result * number;
    }
}
