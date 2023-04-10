package nikhilAllPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str="April is Month of Holidays";

        String [] st1=str.split(" ");
        System.out.println("Length of String  "+st1.length);
        for (int i= st1.length-1;i>=0;i--) {
            System.out.print("  " + st1[i]);
        }

        }
    }

