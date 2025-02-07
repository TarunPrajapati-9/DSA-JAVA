public class dataTypes {

    public static void main(String[] args) {
        byte b = -128; // -128 to 127{1 Byte}
        System.out.println(b);
        short s = 32767; // -32768 to 32767{2 Bytes}
        System.out.println(s);
        int i = 2147483647; // -2147483648 to 2147483647{4 Bytes} 2Billion
        System.out.println(i);
        long l = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807{8 Bytes}
        System.out.println(l);
        float f = 3.4028235E38F; // 1.4E-45 to 3.4028235E38{4 Bytes}
        System.out.println(f);
        double d = 1.7976931348623157E308; // 4.9E-324 to 1.7976931348623157E308{8 Bytes}
        System.out.println(d);
        char c = 'A'; // 0 to 65535{2 Bytes}
        System.out.println(c);
        boolean bool = true; // true or false{1 byte}
        System.out.println(bool);
    }
}