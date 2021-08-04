package Entity;

public class MyNumber < N extends Number >{
    private N number;

    public MyNumber(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }
}
