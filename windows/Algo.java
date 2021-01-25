package windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Locale;

/**
 * Classe qui contient la méthode algorithmique de la calculatrice.
 *
 * */


public class Algo {


    static String operand1 = "", operator = "", operand2 = "";
    static double result = 0;
    static String diviError = "";
    static String input;


    /**
     * Methode technique qui gère les calcules demandés à la calculatrice
     * ' @param e '
     * */
    public static void calculatorAlgo(ActionEvent e, StringBuilder screenLine, JTextField screen) {


        diviError = "";
        input = e.getActionCommand();
        // If previous operation was /0, resets screenLine :
        if (screenLine.toString().equals("/0 not allowed")) {
            screenLine.setLength(0);
            operand1 = "";
        }


        // If input is number or "." :
        if (input.length() == 1 && input.charAt(0) >= '0' && input.charAt(0) <= '9' || input.charAt(0) == '.') {
            if (!operator.equals("") && !operand1.equals("")) { // If operand1 is defined and operator is defined then define operand2
                operand2 += input;
            } else if (!operator.equals("")) { // If only operator is defined, define operand1 as result and define operand2 with input :
                operand1 = String.valueOf(result);
                operand2 = input;
                screenLine.setLength(0);
                screenLine.append(operand1).append(operator);
            } else { // if nothing is defined, define oprand1 :
                screenLine.setLength((operand1.equals("") ? 0 : screenLine.length()));
                operand1 += input;
            }
            screenLine.append(input);
            // If input is an operator we must check if a value is given to
        } else if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("%") || input.equals("=")) {
            // If an operator is input after another operator, the last operator is selected :
            if (!operator.equals("") && operand2.equals("") && !input.equals("=")) {
                operator = input;
                screenLine.replace(screenLine.length() - 1, screenLine.length(), operator);
                // If second operant is not yet defined and input is different than '=', the operator is set to input value :
            } else if (operand2.equals("") && input.charAt(0) != '=') {
                operator = input;
                screenLine.append(operator);
                // If any operator is input after the second operand has been entered,
                // the result of the previous operation et calculated and shown on the screen along with the new operator :
            } else {
                switch (operator) {
                    case "+":
                        result = Double.parseDouble(operand1) + Double.parseDouble(operand2);
                        break;
                    case "-":
                        result = Double.parseDouble(operand1) - Double.parseDouble(operand2);
                        break;
                    case "*":
                        result = Double.parseDouble(operand1) * Double.parseDouble(operand2);
                        break;
                    case "/":
                        if (Double.parseDouble(operand2) == 0) { // Prevent division by 0 !
                            diviError = "/0 not allowed"; // Create message for user.
                            result = 0;
                        } else {
                            result = Double.parseDouble(operand1) / Double.parseDouble(operand2);
                        }
                        break;
                    case "%":
                        result = Double.parseDouble(operand1) % Double.parseDouble(operand2);
                        break;
                    case "=":

                        break;


                }
                // If previous operator was '=' then new operator "" and if not, new operator is set to input :
                operator = (input.equals("=") ? "" : input);
                // If previous operator was '=' then operand1 is "" and if not, operand1 is set to input :
                operand1 = (input.equals("=") ? "" : Double.toString(result));
                // Operand2 is cleared after operation is finished :
                operand2 = "";
                // Reset screen and display result :
                screenLine.setLength(0);
                screenLine.append((diviError.equals("") ? String.format(Locale.US, "%.2f", result) + (operator.equals("=") ? "" : operator) : diviError));
            }
            // If operator is square :
        } else if (input.equals("sq(x)")) {
            operand1 = (!operand1.equals("") ? operand1 : String.format(Locale.US, "%f", result));
            result = Math.pow(Double.parseDouble(operand1), 2);
            operand1 = Double.toString(result);;
            screenLine.setLength(0);
            screenLine.append(String.format(Locale.US, "%.2f", result));
            // If operator is square root :
        } else if (input.equals("SqRt(x)")) {
            /*operand1 = (!operand1.equals("") ? operand1 : String.format(Locale.US, "%f", result));*/
            operand1 = (result == 0 ? operand1 : String.format(Locale.US, "%f", result));
            result = Math.sqrt(Double.parseDouble(operand1));
            operand1 = Double.toString(result);
            screenLine.setLength(0);
            screenLine.append(String.format(Locale.US, "%.2f", result));
            // Deleting last character with "Del" button :
        } else if (input.equals("Del")) {
            if (operator.equals("")) {
                screenLine.setLength(screenLine.length() - 1);
                operand1 = screenLine.toString();
            } else if (!operand2.equals("")) {
                screenLine.setLength(screenLine.length() - 1);
                operand2 = screenLine.toString().replace(operand1 + operator, "");
            } else {
                screenLine.setLength(screenLine.length() - 1);
                operator = "";
            }
            // Deleting all with "C" button :
        } else if (input.equals("C")) {
            operand1 = operator = operand2 = "";
            result = 0;
            screenLine.setLength(0);
            // Deleting last operand value with "CE" button :
        } else if (input.equals("CE")) {
            if (!operand1.equals("") && !operand2.equals("")) {
                screenLine.setLength(screenLine.length() - operand2.length());
                operand2 = "";
            } else {
                operand1 = "";
                operator = "";
                screenLine.setLength(0);
            }
            // Changing sign of last operand :
        } else if (input.equals("+/-")) {
            operand1 = (!operand1.equals("") ? operand1 : String.format(Locale.US, "%f", result));
            if (!operand1.equals("") && operand2.equals("")) {
                operand1 = String.valueOf(0 - Double.parseDouble(operand1));
                screenLine.setLength(0);
                screenLine.append(operand1);
            } else if (Double.parseDouble(operand2) > 0) {
                screenLine.setLength(screenLine.length() - operand2.length());
                operand2 = String.valueOf(0 - Double.parseDouble(operand2));
                screenLine.append("(").append(operand2).append(")");
            } else if (Double.parseDouble(operand2) < 0) {
                screenLine.setLength(screenLine.length() - operand2.length() - 2);
                operand2 = String.valueOf(0 - Double.parseDouble(operand2));
                screenLine.append(operand2);
            }
            // Get quotient :
        } else if (input.equals("1/x")) {
            if (Double.parseDouble(operand1) != 0 && result != 0.0) {
                result = (operand1.equals("") ? 1 / result : 1 / Double.parseDouble(operand1));
            } else {
                diviError = "/0 not allowed";
                result = 0;
            }
            screenLine.setLength(0);
            operand1 = String.format(Locale.US, "%.2f", result);
            screenLine.append((diviError.equals("") ? String.format(Locale.US, "%.2f", result) : diviError));
        }
        // For debugging purposes only :
        System.out.println("operand1 : " + operand1);
        System.out.println("operator : " + operator);
        System.out.println("operand2 : " + operand2);
        System.out.println("result : " + result);
        System.out.println("screenline : " + screenLine.toString());
        System.out.println("diviError : " + diviError);

        // Set screen to display the screenLine :
        screen.setText(screenLine.toString());
    }
}
