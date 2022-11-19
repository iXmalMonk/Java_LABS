package com.classes;

public class SecondClass {
    /*
     * ACCESS MODIFIER
     *
     * public
     * protected
     * private
     * default
     *
     * VARIABLE MODIFIER
     * final
     * static
     * transient
     * volatile
     */

    // private final int var; - ERROR
    private final int first_var = 5;
    private final int second_var;

    private static int VAR = 1; // Always one for all objects of the class

    int v_1; // 0
    boolean v_2; // false
    SecondClass second_class; // NULL

    public SecondClass (int var) {
        second_var = var;
    }

    public void setVAR(int _var) {
        VAR = _var;
    }

    public int getVAR() {
        return VAR;
    }

    void method(final int _v) {
        int v; // not 0
        //System.out.println(v); - ERROR
        System.out.println(_v);
    }
}
