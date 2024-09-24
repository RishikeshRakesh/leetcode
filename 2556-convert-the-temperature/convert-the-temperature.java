class Solution {
    public double[] convertTemperature(double celsius) {
        double[] op=new double[2];
        for(int i=0;i<2;i++){
            op[i]=celsius + 273.15;
            op[i+1]=celsius * 1.80 + 32.00;
            break;
        }
        return op;
}}