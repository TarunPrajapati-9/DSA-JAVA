public class Operation {
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0)
            return 0;
        else
            return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else
            return setIthBit(n, i);

        // OR
        // n = clearIthBit(n, i);
        // int bitmask = newBit << i;
        // return n | bitmask;
    }

    public static int clearIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearBitInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean powerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int power, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= power;
            }
            power *= power;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(fastExpo(5, 3));
    }
}
