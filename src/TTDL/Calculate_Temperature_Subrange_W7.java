package TTDL;

public class Calculate_Temperature_Subrange_W7 {
    public static void main(String[] args) {
        double R_T90 = 54.85785; // input R -->T
        double R_TPW = 25.60193, a7 = -0.00008156119, b7 = -0.00001596174, c7 = -0.000001924502, T_90;//5628
        double W_T90 = R_T90 / R_TPW;
        double dW_T90 = a7 * (W_T90 - 1) + b7 * Math.pow(W_T90 - 1, 2) + c7 * Math.pow(W_T90 - 1, 3);
        double Wr_T90 = W_T90 - dW_T90;

        double[] D = new double[10];
        D[0] = 439.932854;
        D[1] = 472.41802;
        D[2] = 37.684494;
        D[3] = 7.472018;
        D[4] = 2.920828;
        D[5] = 0.005184;
        D[6] = -0.963864;
        D[7] = -0.188732;
        D[8] = 0.191203;
        D[9] = 0.049025;

        double sum_D = D[0];

        for (int i = 1; i < D.length; i++) {
            sum_D += D[i] * Math.pow(((Wr_T90 - 2.64) / 1.64), i);
        }

        T_90 = sum_D;
        System.out.println("Temperature T_90 = " + T_90);
    }
}
