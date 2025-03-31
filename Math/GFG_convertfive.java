class Solution {
    int convertfive(int num) {
        int result = 0, place = 1;
        if (num == 0) {
            return 5;
        }
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            result += digit * place;
            num /= 10;
            place *= 10;
        }
        return result;
    }
}
