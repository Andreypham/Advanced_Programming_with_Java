package TTDL;

public class Calculate_Temperature_Subrange_W4 {
    public static void main(String[] args) {
        double R_T90 = 20.45594; // input R-->T
        double R_TPW = 25.60193, a4 = -0.00006863061, b4 = -0.000004475576, T_90;
        double W_T90 = R_T90 / R_TPW;
        double dW_T90 = a4 * (W_T90 - 1) + b4 * (W_T90 - 1) * Math.log(W_T90);
        double Wr_T90 = W_T90 - dW_T90;

        double[] B = new double[16];
        B[0] = 0.183324722;
        B[1] = 0.240975303;
        B[2] = 0.209108771;
        B[3] = 0.190439972;
        B[4] = 0.142648498;
        B[5] = 0.077993465;
        B[6] = 0.012475611;
        B[7] = -0.032267127;
        B[8] = -0.075291522;
        B[9] = -0.05647067;
        B[10] = 0.076201285;
        B[11] = 0.123893204;
        B[12] = -0.029201193;
        B[13] = -0.091173542;
        B[14] = 0.001317696;
        B[15] = 0.026025526;

        double sum_B = B[0];

        for (int i = 1; i < B.length; i++) {
            sum_B += B[i] * Math.pow(((Math.sqrt(Math.cbrt(Wr_T90)) - 0.65) / 0.35), i);
        }

        T_90 = sum_B * 273.16 - 273.15;
        System.out.println("Temperature T_90 = " + T_90);
    }
}
