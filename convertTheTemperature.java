class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
        
        /*
        - Given: floating point # rounded to 2 decimal places celcius
        - Goal: Convert celcius into kelvin and fahrenheit
        - Return: ans = [kelvin, fahrenheit]
        */
    }
}
