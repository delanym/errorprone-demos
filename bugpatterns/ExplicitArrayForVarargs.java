import java.lang.reflect.Method;

public class ExplicitArrayForVarargs {

    public static void main(String[] args) throws Exception {
        testExplicitArrayForVarargs();
    }

    private static void testExplicitArrayForVarargs() throws Exception {
        Method method = ExplicitArrayForVarargs.class.getMethod("varargsMethod", String[].class);

        // Explicit array passed to varargs → triggers ExplicitArrayForVarargs
        method.invoke(null, new Object[]{ new String[]{"a", "b"} });
    }

    public static void varargsMethod(String... values) {
        System.out.println(String.join(",", values));
    }
}

