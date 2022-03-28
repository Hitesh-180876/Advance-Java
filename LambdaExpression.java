@FunctionalInterface
interface MyLambda{
    void display();
}
public class MyClass {
    public static void main(String args[]) {
        MyLambda m = ()->{
            System.out.println("Hello Java");
        };
        m.display();
    }
}

/*

@FunctionalInterface
interface MyLambda{
    void display(String s);
}
public class MyClass {
    public static void main(String args[]) {
        MyLambda m = (s)->{
            System.out.println(s);
        };
        m.display("Hello java");
    }
}

*/
