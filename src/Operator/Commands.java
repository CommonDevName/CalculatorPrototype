package Operator;

import static Operation.Equation.symbol;

/**
 *
 * @author CommonName(¿)
 */
public class Commands {

    public static void ChooseCommand(){
        switch(symbol){
            case "+"->{}
            case "+("->{}
            case ")+"->{}
            case ")+("->{}
            case "-"->{}
            case "-("->{}
            case ")-"->{}
            case ")-("->{}
            case "*"->{}
            case "*("->{}
            case ")*"->{}
            case ")*("->{}
            case "/"->{}
            case "/("->{}
            case ")/"->{}
            case ")/("->{}
            case "^"->{}
            case "^("->{}
            case ")^"->{}
            case ")^("->{}
            case "~"->{}
            case "~("->{}
            case ")~"->{}
            case ")~("->{}
            case "="->{}
            case ")="->{}
            case "+Ans"->{}
            case ")+Ans"->{}
            case "Ans+"->{}
            case "Ans+("->{}
            case "-Ans"->{}
            case ")-Ans"->{}
            case "Ans-"->{}
            case "Ans-("->{}
            case "*Ans"->{}
            case ")*Ans"->{}
            case "Ans*"->{}
            case "Ans*("->{}
            case "/Ans"->{}
            case ")/Ans"->{}
            case "Ans/"->{}
            case "Ans/("->{}
            case "^Ans"->{}
            case ")^Ans"->{}
            case "Ans^"->{}
            case "Ans^("->{}
            case "~Ans"->{}
            case ")~Ans"->{}
            case "Ans~"->{}
            case "Ans~("->{}
            default->{System.err.println("\nInvalid command"
            +", please check the documentation.\n");}
        }
    }
}