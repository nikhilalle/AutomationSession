package java.coreJava;

public class Parent {
    int a=20;
    int b=20;
    String name="Pooja";
    int roll=101;

    public void multiplication(){
        int mutl;
        mutl=a*b;
        System.out.println(mutl);
    }

    public static void college(){
        Grandparent gr=new Grandparent();
        System.out.println(gr.name );
        System.out.println(gr.roll );


    }

}
