package com.classes;

public class ThirdClass {
    /*
     * static
     * final
     * abstract
     * strictfp
     * native
     * synchronized
     */
    int i = 5;
    static int j = 5;
    // int... l - 1 max in method and his placed on last
    public static void m(int k, int... l) {
        //System.out.println(i); // ERROR
        System.out.println(j);
        System.out.println(k);
        for (int m : l) {
            System.out.println(m);
        }
    }

    public static int n(int k) {
        return k;
    }

    final void method() {

    }
}

class OtherClass extends  ThirdClass {
    /*void method () {

    }*/ // ERROR, because final method
}