class Solution {
    public double[] convertTemperature(double celsius) {
        double[] op=new double[2];
        
            op[0]=celsius + 273.15;
            op[1]=celsius * 1.80 + 32.00;
           
        
        return op;
}}