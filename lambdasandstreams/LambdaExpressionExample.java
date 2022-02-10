package lambdasandstreams;

@FunctionalInterface  //optional
interface Drawable{
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        String shape="Circle";

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+shape);
        };
        d2.draw();
    }
}
