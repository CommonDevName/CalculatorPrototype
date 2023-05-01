package Operation;

import Operator.Commands;
import static samplecalculator.Execution.dataInput;
import static samplecalculator.Execution.textInput;

/**
 *
 * @author CommonName(¿)
 */
public class Equation {
    
    public static double number;
    public static double equationResult;
    public static boolean condition = true;

    public static double Resolution(){
        char symbol;
        do{
            number = dataInput.nextDouble();
            symbol = textInput.next().charAt(0);
            switch(symbol){
                case '+'->{Commands.Plus();}
                case '-'->{Commands.Minus();}
                case '*'->{Commands.Times();}
                case '/'->{Commands.Obleous();}
                case '^'->{Commands.Power();}
                case '='->{Commands.Equal();}
                case 'R'->{Commands.PreviousAnswer();}
                default->{System.err.println("\nInvalid Symbol"
                +", please check the documentation.\n");}
            }
        }while(condition);
        return equationResult;
    }
}
