package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1,2,3,4,5,6,12,15,13};

        int suma = 0;
        for(Integer i: enteros) {
            if (i.intValue() % 2 == 0) {
                suma = suma + i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        for(Integer i: enteros) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
