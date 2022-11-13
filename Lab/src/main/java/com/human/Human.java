package com.human;

public class Human {
    private int age = 0;

    public Human(int _age) {
        if (_age >= 0){
            age = _age;
        }
        else age = 0;
    }

    public void birthday() {
        age++;
    }

    public int getAge() {
        return age;
    }
}
