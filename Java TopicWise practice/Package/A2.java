package mypack3;

import mypack.A;

class A2 extends A {
    public static void main(String[] args) {
        A2 r=new A2();
        //mypack.A.r =new mypack.A();-->fully qualified name call
        r.show();
    }
}

