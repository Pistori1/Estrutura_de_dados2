 
public class Ex2 {
    public static void main(String[] args) {

        double A = 0;
        double n = 0;

        long start_time = System.currentTimeMillis();
        ;

        for (long end_time = System.currentTimeMillis() - start_time; end_time < 4600; end_time = System.currentTimeMillis() - start_time) {

            A = 2*Math.pow(n,2);
            n++;
            System.out.println("N: " +n);
            System.out.println(A);
        }

        // for (n=0.1; n < 26 ; n= n + 0.1) {

        //     A = 8*Math.pow(n,2);

        //     System.out.println(n);
        // }

        System.out.println(System.currentTimeMillis() - start_time);


    }
}