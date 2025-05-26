import java.lang.reflect.*;

public class testing {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("testing");
        String name = clazz.getName();
        Method[] methods = clazz.getDeclaredMethods();
        Method method = methods[0];
        System.err.println(method.getName());
        System.err.println(name);
    }
}