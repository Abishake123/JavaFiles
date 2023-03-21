package ExceptionHandling;

public class ExceptionHandling {

    private Integer marks;
    protected Integer average;
    public Integer total;

    public ExceptionHandling() {

    }

    public ExceptionHandling(Integer marks) {

        this.marks = marks;

    }

    public int divideNum(int m, int n) throws Exception {
        int div = m / n;
        return div;
    }

    public void display() {

        System.out.println("Hello world");
        if (true) {
            System.out.println();
        }

    }

}