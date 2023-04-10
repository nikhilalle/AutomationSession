package java.coreJava;

public class Parent1 {
    String name="Pooja";
    int roll=101;
    int a=20;
    int b=20;

    public static void student(){
        Grandparent gr=new Grandparent();
        System.out.println(gr.name );
        System.out.println(gr.roll );
    }
      public void multiplication(){
        int mutl;
        mutl=a*b;
        System.out.println(mutl);
    }

}

