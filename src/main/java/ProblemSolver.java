public class ProblemSolver {

    public int fibonacci(int number) {
        int a = 0; int b = 1; int c = 0;
        if (number == 0) {
            return a;
        }
        if (number == 1) {
            return b;
        }
        for (int i = 2; i <= number; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return c;
    }

    public int fibonacciRecursive(int number) {
        int a = 0; int b = 1; int c;
        if (number == 0) {
            return a;
        }
        if (number == 1 || number == 2) {
            return b;
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    public boolean isPrime(int number) {
        int length = (number < 10) ? number : 10;
        for (int i = 2; i < length; i ++) {
            System.out.println(number % i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean palindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt((word.length()-1) - i)) {
                return false;
            }
        }
        return true;
    }

    public String readFromBoth(String firstWord, String secondWord) {
        StringBuilder builder = new StringBuilder();
        int length = (firstWord.length() > secondWord.length()) ? firstWord.length() : secondWord.length();
        for (int i = 0; i < length; i++) {
            if (i >= firstWord.length()) {
                builder.append(secondWord.charAt(i));
            } else if (i >= secondWord.length()) {
                builder.append(firstWord.charAt(i));
            } else {
                builder.append(firstWord.charAt(i));
                builder.append(secondWord.charAt(i));
            }
            System.out.println(builder.toString());
        }
        return builder.toString();
    }

    public int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
