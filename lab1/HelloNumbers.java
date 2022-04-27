package com.cs61b;

/*        Exercise 1.1.2.
        Modify HelloNumbers so that it prints out the cumulative sum of the integers from 0 to 9.
        For example, your output should start with 0 1 3 6 10... and should end with 45.
*/


public class HelloNumbers { //为啥这行报错？main class和其他class如何并存？ //上面的file文件名要和这里一致啦，不能一个Hello一个main
    public static void main(String[] args) {
        int x = 0;
        int y = 0;  //y改名叫sum更好
        while (x < 10) {
            y = x + y;
            System.out.print(y + " ");
            x = x + 1;
        }
        x = 9;
        System.out.println(x);
        //The above line still prints...as the last change to X's value...and isn't kicked back to the loop.
        ExtraThought.blah();
    }
}


//    Static Typing Extra Thought Exercise
//        What does System.out.println(5 + "10"); print? 510, or 15? How about System.out.println(5 + 10);?
//        My guess: 510; 15
//        Correct!

/*
小糖宝notes：
1. Compiler will only find the class whose name matches file name and run main()。
   inside it. Other classes doesn't matter unless they are referenced in the "main invoking path"
   就是只有main class里面的会被run；别的class不call就不run。
2. One file can only contain 1 public class. Other classes can only have default visibility (no modifier).
   下面被call的class前面写public或者private都会报错，只能不写，意思是"default"。
3. For classes, 2 visibilities: either public (denoted with "public") or default (no denote)
4. For members (e.g. methods, or class variable), 4 visibilities: public, private, protected and default (no denote)
 */

class ExtraThought { //为啥这行报错？main class和其他class如何并存？ //上面的file文件名要和这里一致啦，不能一个Hello一个main
    // aaa bbb ccc ddd are all class variables. blah() is method. They are all class members.
    private int aaa = 0;
    public int bbb = 1;
    protected String ccc = "YAY";
    double ddd = 0.0;
    private static int eee = 15;
    public static void blah() {
        int xxx = 5;    // this is a local variable, not a class variable
        System.out.println(5 + "10");
        System.out.println(5 + 10);
        // the following will report error because aaa is not static
        // System.out.println(aaa);
        System.out.println(eee);    // Only eee can be accessed. Because method is static, it can only read static members
    }
}


