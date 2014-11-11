package lab10;

public class StackOfIntegers {
    private Integer[] integerArray;
    private int topOfStack;

    public StackOfIntegers(int N) {
        topOfStack = 0;
        integerArray = new Integer[N];
    }

    public void push(Integer i) {
        integerArray[topOfStack++] = i;
    }

    public Integer peek(int index) {
        return integerArray[index];
    }

    public Integer pop() {
        return integerArray[ --topOfStack ];
    }

    public void print() {	
        for (int i = topOfStack - 1; i >= 0; i--) {
            System.out.printf("(%d: %d)\n", i, integerArray[i]);
        }
    }
}
