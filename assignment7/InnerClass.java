package assignment7;

class FirstOuter {

    class FirstInner {
        public FirstInner(String name) {
            System.out.println(name);
        }
    }
}

class SecondOuter {
    class SecondInner extends FirstOuter.FirstInner {
        public SecondInner(FirstOuter firstouter, String name) {
            firstouter.super(name);
        }
    }
}

class InnerClass {
    public static void main(String args[]) {
        FirstOuter firstouter = new FirstOuter();
        SecondOuter so = new SecondOuter();
        SecondOuter.SecondInner obj = so.new SecondInner(firstouter, "Sanjana");
    }
}