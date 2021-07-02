package exercicio2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(1);

        System.out.println(counter.getValue());
        counter.plusOne();
        System.out.println(counter.getValue());
        counter.minusOne();
        System.out.println(counter.getValue());
    }
}
