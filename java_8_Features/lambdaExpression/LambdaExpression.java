package java_8_Features.lambdaExpression;

@FunctionalInterface
interface Funcinterface{
//    abstract method
    void abstractFun(int x);
}

public class LambdaExpression {
    public static void main(String[] args) {
//        LambdaExpression to implement the above functional interface
        Funcinterface fobj = (int x) -> System.out.println(2*x);

//        This call the above lambda expression and print
        fobj.abstractFun(5); // 10
    }

}
