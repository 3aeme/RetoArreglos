
public class RetoPrimos {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int divisores = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

        if (divisores == 2) {
            System.out.println(i);
                }
            

        }

    }

}
