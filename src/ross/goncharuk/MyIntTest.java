package ross.goncharuk;

public class MyIntTest {
    public MyIntTest(){
        System.out.println("constructor 1");
    }
    public MyIntTest(int a){
        this();
        System.out.println("constructor 2");
    }
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }

    public static void main(String[] args) {
        MyIntTest Test = new MyIntTest(1);
    }
}
