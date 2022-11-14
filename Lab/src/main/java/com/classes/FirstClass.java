package com.classes;

/*
 *  strictfp
 *
 *  abstract
 *  OR
 *  final
 */

public class FirstClass {
    void Method(){
        SS temporary = new SS();
        temporary.Start();
        temporary.Stop();
    }
}

abstract class AbstractExample {
    int flag;

    abstract void Start();

    void Stop() {
        flag = 0;
    }
}

class SS extends AbstractExample {
    @Override
    void Start() {
        flag = 1;
    }
}

final class FinalExample {
    int flag;

    void Start() {
        flag = 1;
    }

    void Stop() {
        flag = 0;
    }
}

//class Class extends FinalExample - ERROR