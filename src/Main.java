//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 6;
        int intOperandB = 3;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 3.50;
        double doubleOperandB = 12.67;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 2;
        boolean isRaining = false;
        double gallonGasPrice = 12.90;
        int favoriteNumber = 32;
        double shoeSize = 9.5;
        String birthMonth = "July";
        String fullName = "Tre Jackson";

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;


        System.out.println("The sum of ints of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");
        System.out.println("The product of ints of " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");
        System.out.println("The difference of ints of " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");
        System.out.println("The quotient of ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");
        System.out.println("The modulo/remainder of ints of " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");
        System.out.println();
        System.out.println("The sum of doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");
        System.out.println("The product of doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");
        System.out.println("The difference of doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");
        System.out.println("The quotient of doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");
    }
}