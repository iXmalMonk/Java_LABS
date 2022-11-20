package com.human;


public class Human {
    private int age = 0;

    enum Gender { man, woman };

    Gender gender = Gender.man;

    public enum Example { small(100), medium(200),
        big(300) {
        String getLetter() {
            return "B";
        }
    };
        String letter = "A";
        int i;
        Example(int i) {
            this.i = i;
        }

        int getI() {
            return this.i;
        }

        String getLetter() {
            return letter;
        }
    }

    Example e;

    public Human(int _age, Example e) {
        if (_age >= 0){
            age = _age;
        }
        else age = 0;

        this.e = e;
    }

    public void birthday() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public int getExampleI() {
        if (this.e == Example.small) return Example.small.getI();
        else if (this.e == Example.medium) return Example.medium.getI();
        return Example.big.getI();
    }

    public String getLetter() {
        if (this.e == Example.small) return Example.small.getLetter();
        else if (this.e == Example.medium) return Example.medium.getLetter();
        return Example.big.getLetter();
    }
}
