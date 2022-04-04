package fundamentals.casting;

public class CastingAllPrimitives {
    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;
        float f = 1.0f;
        double d = 1.0;
        char c = 'a';

        b = (byte) s;       s = b;
        b = (byte) i;       i = b;
        b = (byte) l;       l = b;
        b = (byte) f;       f = b;
        b = (byte) d;       d = b;
        b = (byte) c;       c = (char) b;

        s = (short) i;      i = s;
        s = (short) l;      l = s;
        s = (short) f;      f = s;
        s = (short) d;      d = s;
        s = (short) c;      c = (char) s;

        i = (int) l;        l = i;
        i = (int) f;        f = i;
        i = (int) d;        d = i;
        i = c;              c = (char) i;

        l = (long) f;       f = l;
        l = (long) d;       d = l;
        l = c;              c = (char) l;

        f = (float) d;      d = f;
        f = c;              c = (char) f;

        d = c;              c = (char) d;
    }
}