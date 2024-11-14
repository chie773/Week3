class PowerTen {
    public boolean isPowerOfTen(int n) {
        while (n > 1) { // This is the base condition, it terminates if n reaches 1 or 0, it will be a power of 10
            if (n % 10 != 0) { // This checks if the last number in n is any number from 2-9 and returns false
                return false;
            } else {
                n /= 10; // This divides n by 10 to decrease it to its ones place
            }
        }

        return true; // Returns true because if the loop terminates then the number is a power of ten
    }
}
