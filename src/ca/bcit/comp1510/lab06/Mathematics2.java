package ca.bcit.comp1510.lab06;

/**
* Mathematics2 class provides some basic mathematical operations.
* 
* @author soheehwang
* @version 2023
*/
public class Mathematics2 {
    
    /** Constant for foot to kilometre ratio. */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /** Constant for kilo. */
    public static final double KILO = 3280.84;
    
    /** Constant for ten. */
    public static final int TEN = 10;
    
    /** Constant for eleven. */
    public static final int ELEVEN = 11;
    
    /** Constant for fifteen. */
    public static final int FIFTEEN = 15;

    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param edgeLength
    *       of the square.
    * @return area as a double
    */
    public double getSquareArea(double edgeLength) {
        return edgeLength * edgeLength;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return sum of the operands
    */
    public double add(double first, double second) {
        return first + second;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return product of the operands
    */
    public double multiply(double first, double second) {
        return first * second;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return difference of the operands
    */
    public double subtract(double first, double second) {
        return first - second; 
    }
    
    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return quotient of the operands
    */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0.0;
        } else {
            return first / second;
        }
    }
    
    /**
    * Returns the absolute value of the specified integer.
    *
    * @param number
    *       to test
    * @return absolute value of number
    */
    public int absoluteValue(int number) {
        return Math.abs(number);
    }
    
    /**
    * Converts the specified number of feet to kilometres.
    * @param feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double feet) {
        return feet / KILO;
    }
    
    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        if (bound > 0) {
            for (int i = 0; i <= bound; i++) {
                if (i % divisor == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = 0; i >= bound; i--) {
                if (i % divisor == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
    
    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * ELEVEN) + TEN;
        } while (randomNumber == FIFTEEN);
        return randomNumber;
    }
}
