package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TAB_SIZE = 12;
    private static final int MAX_INDEX = TAB_SIZE - 1;
    private static final int DEFAULT_VALUE = -1;
    private static final int EMPTY_RHYMER_INDEX = -1;
    private final int[] NUMBERS = new int[TAB_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDEX;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    protected boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total--];
    }
}
