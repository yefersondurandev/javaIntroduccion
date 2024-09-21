package ClasesWrapper;

import java.lang.reflect.Method;

public class ExampleGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());

        for(Method method: strClass.getMethods()){
            System.out.println("method = " + method.getName());
        }
    }
}
