class GFG_countdigits {
    static int evenlyDivides(int n) {
        int original = n; 
        int res = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > 0 && original % digit == 0) { 
                res++;
            }
            n = n / 10;
        }

        return res;
    }
}
