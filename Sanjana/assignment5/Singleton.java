package Sanjana.assignment5;

class Singelton {
    String str;

    public static Singelton staticMethod(String parameter) {
        // str=parameter;
        Singelton s = new Singelton();
        return s;
    }

    public void display() {
        System.out.print(str);
    }
}
