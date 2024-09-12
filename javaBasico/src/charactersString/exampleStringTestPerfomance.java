package charactersString;

public class exampleStringTestPerfomance {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // este es mutable


        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n");// 500 => 2ms
            //c += a + b + "\n"; // 500 => 12 ms
            //sb.append("a").append("b").append("\n");// 500 => 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + sb.toString());

    }
}