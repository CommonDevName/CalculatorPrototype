package Operator;

import static Operation.Equation.number;
import static Operation.Equation.cache;
import static Operation.Equation.result;

/**
 *
 * @author CommonName(¿)
 */
public class SquareRoot {
    
    public static void SquareRoot(){
        result = (result == 0)?
            cache * Math.sqrt(number) : result * Math.sqrt(number);
    }
}
