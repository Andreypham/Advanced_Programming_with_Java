package TTDL;

public class Table_Resistance_Temperature_subrange_W4 {
    public static double ln_Wr_T90(double T_90) {
        double[] A = new double[13];
        A[0] = -2.13534729;
        A[1] = 3.18324720;
        A[2] = -1.80143597;
        A[3] = 0.71727204;
        A[4] = 0.50344027;
        A[5] = -0.61899395;
        A[6] = -0.05332322;
        A[7] = 0.28021362;
        A[8] = 0.10715224;
        A[9] = -0.29302865;
        A[10] = 0.04459872;
        A[11] = 0.11868632;
        A[12] = -0.05248134;

        double ln_Wr_T90 = A[0];

        for (int i = 1; i < A.length; i++) {
            ln_Wr_T90 += A[i] * Math.pow((Math.log(T_90 / 273.16) + 1.5) / 1.5, i);
        }
        return ln_Wr_T90;
    }

    public static void main(String[] args) {
        double R_TPW = 100.0138, a = -0.00063650335, b = -0.000038911873;//5615
//        double R_TPW = 99.24807, a = -0.0003711520, b = -0.00001985546;//5626
//        double R_TPW = 25.60193, a = -0.00006863061, b = -0.000004475576;//5628
//        double R_TPW = 25.60193, a = -0.00004102187237441995, b = 0.000011678226547817938;//5628
        double Wr_90, dW_T90, W_T90, R_T90, K = 273.15;
        double T_90;

        System.out.println("================================== Table Resistance and Temperature ==================================");

//        for (int i = -200; i <= 0; i++) {
//            T_90 = i+ K;
//            Wr_90 = Math.pow(Math.E, ln_Wr_T90(T_90));
//            dW_T90 = (a * (Wr_90 - 1) + b * (Wr_90 - 1) * Math.log(Wr_90)) * (1 + a + b * (1 - 1 / Wr_90 + Math.log(Wr_90)));
//            W_T90 = dW_T90 + Wr_90;
//            R_T90 = W_T90 * R_TPW;
//            System.out.format("%4d %10.6f%n",i, R_T90);
//        }

        T_90 = 0 - 0.012 + K;
        Wr_90 = Math.pow(Math.E, ln_Wr_T90(T_90));
        dW_T90 = (a * (Wr_90 - 1) + b * (Wr_90 - 1) * Math.log(Wr_90)) * (1 + a + b * (1 - 1 / Wr_90 + Math.log(Wr_90)));
        W_T90 = dW_T90 + Wr_90;
        R_T90 = W_T90 * R_TPW;
        System.out.format("%10.6f%n", R_T90);
    }
}
