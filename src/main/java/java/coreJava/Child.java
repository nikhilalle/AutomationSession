package java.coreJava;

public class Child {
    int a=20;
    int b=20;
    public static  void addition(){
        int sum;
        Child ch=new Child();
        sum=ch.a+ ch.b;
        System.out.println(sum);
    }
    public  void division(){
        int div;
        div=a/b;
        System.out.println(div);
    }

    public static void main(String[] args) {
        addition();
        Child ch1=new Child();

        ch1.division();
        Grandparent.student();
        Parent pt=new Parent();

        pt.multiplication();
        Parent.college();




    }
}
