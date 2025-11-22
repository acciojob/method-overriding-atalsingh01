package com.driver;

 class A {

    public  String meth()
    {
        return "Invoking method from class A" ;
    }
}
 class B extends  A{
    int n=10;
    public  String meth()
    {
        return "Method is overridden in Extended class B" ;
    }


}
public class Main {
    public static void main(String[] args) {
        B b1= new B();
        String str=b1.meth();
        System.out.print(str);
    }


}