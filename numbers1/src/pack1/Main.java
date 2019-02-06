package pack1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        int x=45;
        int y=2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println("Частное от деления" + (double) x/y);//конкатенация
        a = x++;//постфиксная
        b = ++x;//префиксная
        System.out.println(a);
        System.out.println(b);
        //декримент
        x--;
        --x;
    }
}
