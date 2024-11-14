class Power {
    public double pow(double x, int n) {
        if (n == 1) { // This base case checks to see if n reaches 1, so it can return x because x to the power of 1 is x
            return x;
        }

        return x * pow(x, n-1); // This recursive step multiplies x by the function when x is to the n-1 power. This 
    }                            // makes it simpler in terms of dividing the problem into concurrent sub problems
}
