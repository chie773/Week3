class Power {
    public double pow(double x, int n) {
        if (n == 1) {
            return x;
        }

        return x * pow(x, n-1);
    }
}
