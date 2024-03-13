class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[]=new double[2];
        double kel=celsius+273.1500;
        double fah=((1.8)*celsius)+32.0000;
        arr[0]=kel;
        arr[1]=fah;
        return arr;
    }
}
