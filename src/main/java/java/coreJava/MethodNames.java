package java.coreJava;

public class MethodNames {
    int a=20;
    int b=20;
    public void addition(){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public static void subtraction(){
        int sub;
        MethodNames mn=new MethodNames();
        sub=mn.a-mn.b;
        System.out.println(sub);
    }
    public static void multiplication(){
        MethodNames nm=new MethodNames();
        int mult;
        mult=nm.a*nm.b;
        System.out.println(mult);
    }
    public static void main(String[] args) {
        MethodNames methodName=new MethodNames();
        methodName.addition();
        subtraction();
        multiplication();

}}

