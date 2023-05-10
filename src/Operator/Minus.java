package Operator;

import static Operation.Equation.number;
import static Operation.Equation.cache;
import static Operation.Equation.result;

/**
 *
 * @author CommonName(¿)
 */
public class Minus {
    
    public static void Minus(){
        result = (result == 0)?
            cache - number : result - number;
    }
}
