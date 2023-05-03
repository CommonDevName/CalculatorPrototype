package Operation;

import Operator.Commands;
import Operator.Equal;
import static samplecalculator.Execution.dataInput;
import static samplecalculator.Execution.textInput;

/**
 *
 * @author CommonName(¿)
 */
public class Equation {
    
    public static double number, cache;
    public static double result, resultParenthesis, equationResult;
    public static boolean condition = true, conditionParenthesis = true;
    public static String symbol;

    public static void AnswerOutput(){
        equationResult = EquationInput();
    }

    public static double EquationInput(){
        do{
            cache = number;
            number = dataInput.nextDouble();
            if(symbol != "=" || symbol != ")="){
                Commands.ChooseCommand();}
            else{if(symbol == "="){
                Equal.Equal();
            }else{if(symbol != ")="){}}}
            symbol = textInput.nextLine();
        }while(condition);
        return result;
    }

    public static double EquationInputParenthesis(){
        do{
            cache = number;
            number = dataInput.nextDouble();
            if(symbol != "=" || symbol != ")="){
                Commands.ChooseCommand();}
            else{if(symbol == "="){
                Equal.Equal();
            }else{if(symbol != ")="){}}}
            symbol = textInput.nextLine();
        }while(conditionParenthesis);
        return result;
    }

}
