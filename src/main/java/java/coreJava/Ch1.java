package java.coreJava;

public class Ch1 extends Parent1 {
        String name="Pooja";
        int roll=101;
        public static void pooja(){
        Grandparent gr=new Grandparent();
        System.out.println(gr.name );
        System.out.println(gr.roll );
    }
    public static void main(String[] args) {
       Ch1 ch=new Ch1();
        student();
        ch.multiplication();
        pooja();
    }
}
