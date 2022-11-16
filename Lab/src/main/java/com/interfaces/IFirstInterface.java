package com.interfaces;

public interface IFirstInterface extends IOtherInterface {
    int VARIABLE = 0; // const
    void method(); // public abstract

    @Override
    void otherMethod();
}

interface IOtherInterface {
    void otherMethod();
}

class Example implements IFirstInterface {
    public void exampleMethod() {
        //VARIABLE = 1; // ERROR
    }

    @Override
    public void method() {

    }

    @Override
    public void otherMethod() {

    }
}