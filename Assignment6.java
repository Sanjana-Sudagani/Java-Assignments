import java.util.Arrays;
import java.util.ArrayList;

// part 1
class Vampire {
    public static boolean isVampirePair(int a,int b,int num){
        String val1=String.valueOf(a);
        String val2=String.valueOf(b);
        String vampire=String.valueOf(num);
        if((val1.length()!=val2.length()) || (val1.endsWith("0") && val2.endsWith("0")))
            return false;
        String vals=val1+val2;
        char tempArray[] = vals.toCharArray();
        Arrays.sort(tempArray);
        char vamArray[]=vampire.toCharArray();
        Arrays.sort(vamArray);
        vals=new String(tempArray);
        vampire=new String(vamArray);
        if(vals.equals(vampire))
            return true;
        return false;
    }
    public static boolean isDigitCountOdd(int num){
        String s=String.valueOf(num);
        if((s.length()&1)==1)
            return true;
        return false;
    }
    public static boolean isVampire(int num){
        int a,b;
        if(isDigitCountOdd(num))
            return false;
        for(int k=1;k*k<=num;k++){
            if(num%k==0) {
                a = k;
                b = num / a;
                if(isVampirePair(a, b,num))
                    return true;
            }
        }
        return false;
    }

}

// part 2
class Overloaded {
    Overloaded() {
        this("First Constructor");

    }

    Overloaded(String input) {
        System.out.println("Second Constructor called from : " + input);
    }

}

// part 3
class Task3 {

    Task3(String s) {
        System.out.println(s);
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        // Part 1
        Vampire v=new Vampire();
        ArrayList<Integer> vampireNumbers=new ArrayList<>();
        for(int i=10;vampireNumbers.size()<100;i++)
            if(v.isVampire(i))
                vampireNumbers.add(i);
        for(int i=0;i<vampireNumbers.size();i++)
            System.out.println("Vampire number "+(i+1)+" is "+vampireNumbers.get(i));

        // Part 2
        // Overloaded overloaded = new Overloaded();
        //


        //// part 3
        //// Nothing was printed when objects were not created.

        //// part 4
        //arr[0] = new Task3("hello");
        //arr[1] = new Task3("Hi");
        //arr[2] = new Task3("hey");

    }
}