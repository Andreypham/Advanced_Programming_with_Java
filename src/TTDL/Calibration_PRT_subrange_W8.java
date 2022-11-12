package TTDL;

public class Calibration_PRT_subrange_W8 {
    public static double Wr_T90(double T_90){
        double[] C = new double[10];
        C[0] = 2.78157254;
        C[1] = 1.64650916;
        C[2] = -0.13714390;
        C[3] = -0.006497;
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

    public static double solve(double a, double b, double c){
        double delta = b*b-4*a*c, x=0,y=0;
        if (delta<0) {
            System.out.println("the equation has no solution");
        } else{
            x= (-b+Math.sqrt(delta))/2/a+1;
            y = (-b-Math.sqrt(delta))/2/a+1;
        }
        if (x>0) {
            return x;
        } else{
            return y;
        }
    }

    public static void table_value(double R_TPW, double a, double b){
        int T_90, max_T = 10;
        double W_T90;

        for(T_90 = 0;T_90<max_T;T_90++){
            W_T90 = solve(b,a-1,Wr_T90(T_90)-1);
            System.out.println(W_T90*R_TPW);
        }
    }

    public static void main(String[] args) {
        double R_TPW = 100.0243, T1 = 199.931, T2 = 420.030, R1 = 177.2941, R2 = 256.9380, K = 273.15,a,b;
        double[] T_90 = {T1 + K, T2 + K};
        double[] R_T90 = {R1, R2};
        double[] W_T90 = {R_T90[0] / R_TPW, R_T90[1] / R_TPW};
        double[] m = {W_T90[0] - 1, W_T90[1] - 1};
        double[] n = {m[0]*m[0], m[1] * m[1]};
        double[] p = {W_T90[0] - Wr_T90(T_90[0]), W_T90[1] - Wr_T90(T_90[1])};

        double dp = m[0] * n[1] - m[1] * n[0], da = p[0] * n[1] - p[1] * n[0], db = m[0] * p[1] - m[1] * p[0];
        a=da/dp;
        b=db/dp;
//        a= -0.0010899078;
//        b= -0.000084532872;

        System.out.println("a = " + (a * 1000) + "E-03");
        System.out.println("b = " + (b * 100000) + "E-05");

        table_value(R_TPW,a,b);
    }
}
