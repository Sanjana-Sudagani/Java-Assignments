package Sanjana.assignment5;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.print();
        d.anotherPrint();
        Singelton s = new Singelton();
        s.staticMethod("Sanjana");
        s.display();
    }
}