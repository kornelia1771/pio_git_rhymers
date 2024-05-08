package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB_SIZE = 12;
    public static final int MAX_AMOUNT = 11;
    public static final int STARTING_POINT = -1;
    private final int[] NUMBERS = new int[TAB_SIZE];

    public int total = STARTING_POINT;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_POINT;
    }

    public boolean isFull() {
        return total == MAX_AMOUNT;
    }

    protected int peekaboo() {
        if (callCheck())
            return STARTING_POINT;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STARTING_POINT;
        return NUMBERS[total--];
    }

}
