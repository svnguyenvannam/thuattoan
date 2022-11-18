package pk1;

public class Boxing {
    public static void main(String[] args) {
        int i =10;
        Integer a = i;
        System.out.println(a);


        Integer b =10;
        int c = b;
        System.out.println(c);

        int d= 20;
        Integer e = Integer.valueOf(d);

        System.out.println(e instanceof Integer);


        Integer g =50;
        int f = g.intValue();

    }
}
