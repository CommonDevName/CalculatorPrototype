package Operator;

import static Operation.Equation.number;
import static Operation.Equation.cache;
import static Operation.Equation.result;

/**
 *
 * @author CommonName(¿)
 */
public class Power {
    
    public static void Power(){
        result = (result == 0)?
            Math.pow(cache, number) : Math.pow(result, number);
    }
}
