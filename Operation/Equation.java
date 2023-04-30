package Operation;

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
                case ' '->{}
            
                default->{}
            }
        }while(condition);
        return equationResult;
    }
}
