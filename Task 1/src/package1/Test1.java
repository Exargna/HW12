package package1;

public class Test1 {
    protected  int a;
    protected  int b;
    protected  int c;

    protected void print (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Вывод чисел: " + this.a + " " + this.b + " " + this.c);
    }
}
