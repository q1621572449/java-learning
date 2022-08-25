package com.brianway.learning.java.base.innerclass;

/**
 * Created by brian on 16/11/10.
 */
public class EnclosingOne {

    public class InsideOne {

    }

    static public class InsideTwo {//static在初始化时就已经创建了。

    }

    public static void main(String[] args) {
        EnclosingOne eo = new EnclosingOne();
        InsideOne io = eo.new InsideOne();
        InsideTwo it = new InsideTwo();
    }
}
