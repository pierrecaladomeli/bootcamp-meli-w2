package exercicio2;

public class Counter {
    private int value;

    public Counter() {
    }

    public Counter(int value) {
        this.value = value;
    }

    public Counter(Counter counter) {
        value = counter.getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void plusOne(){
        value++;
    }

    public void  minusOne(){
        if(value > 0) {
            value--;
        }
    }

}
