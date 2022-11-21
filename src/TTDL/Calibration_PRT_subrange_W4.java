package TTDL;

public class Calibration_PRT_subrange_W4 {
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
//       double R_TPW = 100.0243, T1 = -195.941, T2 = -37.824, R1 = 18.8090, R2 = 84.8596, K = 273.15;
//        double R_TPW = 100, T1 = -200, T2 = -10, R1 = 18.52, R2 = 96.09, K = 273.15;
//        double R_TPW = 99.24807, T1 = -197, T2 = -80, R1 = 18.15842, R2 = 67.18161, K = 273.15;
        double R_TPW = 25.60193, T1 = -197, T2 = -38.834, R1 = 4.67834, R2 = 21.61188, K = 273.15;
        double[] T_90 = {T1 + K, T2 + K};
        double[] R_T90 = {R1, R2};
        double[] W_T90 = {R_T90[0] / R_TPW, R_T90[1] / R_TPW};
        double[] m = {W_T90[0] - 1, W_T90[1] - 1};
        double[] n = {m[0] * Math.log(W_T90[0]), m[1] * Math.log(W_T90[1])};
        double[] p = {W_T90[0] - Math.pow(Math.E, ln_Wr_T90(T_90[0])), W_T90[1] - Math.pow(Math.E, ln_Wr_T90(T_90[1]))};

        double dp = m[0] * n[1] - m[1] * n[0], da = p[0] * n[1] - p[1] * n[0], db = m[0] * p[1] - m[1] * p[0];

        System.out.println("a = " + (da * 1000 / dp) + "E-03");
        System.out.println("b = " + (db * 100000 / dp) + "E-05");
    }
}
