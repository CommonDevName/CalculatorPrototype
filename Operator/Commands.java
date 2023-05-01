package Operator;

import Operation.Equation;

/**
 *
 * @author CommonName(¿)
 */
public class Commands {
    


    public static void Plus(){
        Equation.equationResult = Equation.equationResult +
        Equation.number;
    }

    public static void Minus(){
        Equation.equationResult = Equation.equationResult -
        Equation.number;
    }

    public static void Times(){
        Equation.equationResult = Equation.equationResult *
        Equation.number;
    }

    public static void Obleous(){
        Equation.equationResult = Equation.equationResult /
        Equation.number;
    }

    public static void Power(){
        Equation.equationResult = 
        Math.pow(Equation.equationResult,Equation.number);
    }

    public static void Equal(){
        Equation.condition = false;
    }

    public static void PreviousAnswer(){
        
    }
}