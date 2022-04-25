package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int amountOfNumbers = 12;
    public static final int ERROR = -1;
    private int[] numbers = new int[amountOfNumbers];

    public int total = ERROR;

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
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
