package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int amountOfNumbers = 12;
    private static final int ERROR = -1;
    private final int[] numbers = new int[amountOfNumbers];

    private int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == amountOfNumbers-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
