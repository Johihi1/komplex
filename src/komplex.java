public class komplex {
    public static void main(String[] args){
        komplex a = new komplex (3.0,2.0);
        komplex b = new komplex (4.0,1.0);

        komplex c = a.add(b);
        komplex d = (7,3);
        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar");
        }
        c = a.multiply(b);
        d = new Komplex(10,11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0/3)) {
            System.out.println("arg() funkar!!");
        }
    }
}