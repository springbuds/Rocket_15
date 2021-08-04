package Entity;

public class MyMath <N extends Number> {

    public N sum(N... numbers) {
        Double sum = 0d;
        for (N t : numbers) sum += t.doubleValue();
        return (N) sum;
    }
}
