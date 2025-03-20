public class Ex1 {
    public static void main(String[] args) {

        double A = 0;
        double B = -1;

        for (double n=0.1; B < A; n= n + 0.1) {

            A = 8*Math.pow(n,2);
            B = Math.pow(n,3);

            System.out.println(n);
        }


    }
}