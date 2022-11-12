package TTDL;

public class Table_Resistance_Temperature_subrange_W7 {
    public static double Wr_T90(double T_90){
        double[] C = new double[10];
        C[0] = 2.78157254;
        C[1] = 1.64650916;
        C[2] = -0.13714390;
        C[3] = -0.00649767;
        C[4] = -0.00234444;
        C[5] = 0.00511868;
        C[6] = 0.00187982;
        C[7] = -0.00204472;
        C[8] = -0.00046122;
        C[9] = 0.00045724;

        double Wr_T90 = C[0];

        for (int i = 1; i < C.length; i++) {
            Wr_T90 += C[i] * Math.pow(((T_90-754.15) / 481), i);
        }
        return Wr_T90;
    }

    public static void main(String[] args) {
//        double R_TPW = 99.24807, a = -0.0003198321, b = -0.00002837878, c = -0.000003625563;//5626
        double R_TPW = 25.60193, a = -0.00008156119, b = -0.00001596174, c = -0.000001924502;//5628
        double Wr_90, dW_T90, W_T90, R_T90, K = 273.15;
        double T_90;

        System.out.println("================================== Table Resistance and Temperature ==================================");

        for (int i = 0; i <= 661; i++) {
            T_90 = i+ K;
            Wr_90 = Wr_T90(T_90);
            dW_T90 = (a * (Wr_90 - 1) + b * Math.pow((Wr_90 - 1),2)+c*Math.pow((Wr_90-1),3)) * (1 + a + 2*b * (Wr_90-1)+3*c*Math.pow((Wr_90-1),2));
            W_T90 = dW_T90 + Wr_90;
            R_T90 = W_T90 * R_TPW;
            System.out.format("%4d:  %10.5f%n",i, R_T90);
        }
    }
}
