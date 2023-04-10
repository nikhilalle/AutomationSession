package java.coreJava;

public class AllVariables1 {
   static int w=10;
   static int t=30;
   int e=12;
   int r=90;

    public void add(){
        System.out.println(e);
        System.out.println(r);
        System.out.println(w);
        System.out.println(t);

    }
    public static void sub(){
        AllVariables1 b=new AllVariables1();
        System.out.println(b.e);
        System.out.println(b.r);
        System.out.println(w);
        System.out.println(t);

    }

    public static void main(String[] args) {
        sub();
        AllVariables1 a1=new AllVariables1();
        a1.add();

    }
    }


