class PowerTen {
    public boolean isPowerOfTen(int n) {
        if (n == 1 || n == 0) { // This base case checks to see if n reached 1 or 0, this signifies its a power of 10.
            return true;
        }
        if (n % 10 != 0) { // This checks for if the last number in n doesn't have a remainder of 0, 
            return false; // which signifies it not being a power of 1
        } 

        return isPowerOfTen(n/10); // This recursive steps decreases n / 10, to check each integer in n
    }
}
