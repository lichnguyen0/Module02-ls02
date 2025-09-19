package refactoringtachbien;

public class FizzBuzz {
    public static String fizzBuzz(int number) {

        boolean isFizz = number % 4 == 0;
        boolean isBuzz = number % 9 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}
