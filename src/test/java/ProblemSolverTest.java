import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemSolverTest {

    private ProblemSolver problemSolver;

    @Before
    public void setUp() throws Exception {
        problemSolver = new ProblemSolver();
    }

    @Test
    public void fibonacciTest1() {
        int number = 7;
        int expected = 13;
        int actual = problemSolver.fibonacci(7);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTest2() {
        int number = 1;
        int expected = 1;
        int actual = problemSolver.fibonacci(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTest3() {
        int number = 2;
        int expected = 1;
        int actual = problemSolver.fibonacci(2);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTest4() {
        int number = 10;
        int expected = 55;
        int actual = problemSolver.fibonacci(10);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursiveTest1() {
        int number = 10;
        int expected = 55;
        int actual = problemSolver.fibonacciRecursive(10);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursiveTest2() {
        int number = 7;
        int expected = 13;
        int actual = problemSolver.fibonacciRecursive(7);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursiveTest3() {
        int number = 2;
        int expected = 1;
        int actual = problemSolver.fibonacciRecursive(1);
        assertEquals(expected, actual);
    }

    @Test
    public void isPrime1() {
        int number = 7;
//        boolean expected = true;
        boolean actual = problemSolver.isPrime(7);
        assertTrue(actual);
    }

    @Test
    public void isPrime2() {
        int number = 24;
//        boolean expected = false;
        boolean actual = problemSolver.isPrime(24);
        assertFalse(actual);
    }

    @Test
    public void isPrime3() {
        int number = 17;
        //boolean expected = true;
        boolean actual = problemSolver.isPrime(17);
        assertTrue(actual);
    }

    @Test
    public void palindromeTest1() {
        String word = "kook";
        boolean actual = problemSolver.palindrome(word);
        assertTrue(actual);
    }

    @Test
    public void palindromeTest2() {
        String word = "spookey";
        boolean actual = problemSolver.palindrome(word);
        assertFalse(actual);
    }

    @Test
    public void palindromeTest3() {
        String word = "recoocer";
        boolean actual = problemSolver.palindrome(word);
        assertTrue(actual);
    }

    @Test
    public void palindromeTest4() {
        String word = "a";
        boolean actual = problemSolver.palindrome(word);
        assertTrue(actual);
    }

    @Test
    public void palindromeTest5() {
        String word = "ab";
        boolean actual = problemSolver.palindrome(word);
        assertFalse(actual);
    }

    @Test
    public void readFromBothTest1() {
        String firstWord = "jumper";
        String secondWord = "fake";
        String expected = "jfuamkpeer";
        String actual = problemSolver.readFromBoth(firstWord, secondWord);
        assertEquals(expected, actual);
    }

    @Test
    public void readFromBothTest2() {
        String firstWord = "bob";
        String secondWord = "timmy";
        String expected = "btoibmmy";
        String actual = problemSolver.readFromBoth(firstWord, secondWord);
        assertEquals(expected, actual);
    }

    @Test
    public void readFromBothTest3() {
        String firstWord = "from";
        String secondWord = "jump";
        String expected = "fjruommp";
        String actual = problemSolver.readFromBoth(firstWord, secondWord);
        assertEquals(expected, actual);
    }

    @Test
    public void readFromBothTest4() {
        String firstWord = "pig";
        String secondWord = "";
        String expected = "pig";
        String actual = problemSolver.readFromBoth(firstWord, secondWord);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTest1() {
        int number = 4;
        int expected = 24;
        int actual = problemSolver.factorial(4);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTest2() {
        int number = 6;
        int expected = 720;
        int actual = problemSolver.factorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTest3() {
        int number = 2;
        int expected = 2;
        int actual = problemSolver.factorial(2);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTest4() {
        int number = 5;
        int expected = 120;
        int actual = problemSolver.factorial(5);
        assertEquals(expected, actual);
    }
}