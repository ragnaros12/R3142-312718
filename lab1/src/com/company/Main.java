import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // Задание №1

        final int Len_c = (24 - 2)/2 + 1;
        long[] c = new long[Len_c];
        int arg_c = 2;

        for (int i = 0; i < Len_c; i++) {
            c[i] = arg_c;
            arg_c += 2;
        }

        // Задание №2

        final int Len_x = 12;
        final double mini = -6.0;
        final double maxi = 15.0+ Double.MIN_VALUE;
        double[] x = new double[Len_x];

        for (int i = 0; i < Len_x; i++) {
            x[i] = random()*(maxi-mini) + mini;
        }

        // Задание №3

        final int Len_b1 = 12;
        final int Len_b2 = 12;
        double[][] b = new double[Len_b1][Len_b2];

        for (int i = 0; i < Len_b1; i++) {

            for ( int j = 0; j < Len_b2; j++) {

                if (c[i] == 12) {
                    b[i][j] = atan(exp((-abs(x[j]))));

                } else if ((c[i] == 2) || (c[i] == 4) || (c[i] == 6) || (c[i] == 10) || (c[i] == 16) || (c[i] == 18)) {
                    b[i][j] = atan(1/exp((sqrt(acos((x[j]+4.5)/21)))));

                } else {
                    b[i][j] = pow(atan(exp(cbrt(-exp(x[j])))),pow(log(exp(x[j])),2*exp(pow(PI/(x[j]+1/2),x[j]))));
                }

            }

        }

        // Задание №4

        for (int i = 0; i < Len_b1; i++) {

            for ( int j = 0; j < Len_b2; j++) {
                System.out.printf("%6.2f\t", b[i][j]);
            }
            System.out.println();
        }

    }

}
