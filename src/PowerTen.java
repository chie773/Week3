class PowerTen {
    public boolean isPowerOfTen(int n) {
        while (n > 1) {
            if (n % 10 != 0) {
                return false;
            } else {
                n /= 10;
            }
        }

        return true;
    }
}
