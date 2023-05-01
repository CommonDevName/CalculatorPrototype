package Operation;

import Operator.Commands;
import static samplecalculator.Execution.dataInput;

/**
 *
 * @author CommonName(¿)
 */
public class Equation {
    
    public static double equationResult;

    public static double Resolution(){
        boolean condition = true;
        double A, B;
        char symbol;
        do{
            A = dataInput.nextDouble();
            symbol = dataInput.next().charAt(0);
            B = dataInput.nextDouble();
            switch(symbol){
                case '+'->{Commands.Plus();}
                case '-'->{Commands.Minus();}
                case '*'->{Commands.Times();}
                case '/'->{Commands.Obleous();}
                case '^'->{Commands.Power();}
                case '='->{Commands.Equal();}
                case 'R'->{Commands.PreviousAnswer();}
                default->{}
            }
        }while(condition);
        return equationResult;
    }
}
