package controlFlows;

public class sentenceForeach {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11,13,15};
        for(int num:numbers){
            System.out.println("num = " + num);
        }

        String[] nombres = new String[5];
        nombres[0] = "maria";
        nombres[1] = "yeferson";
        nombres[2] = "camilo";
        nombres[3] = "lina";
        nombres[4] = "luz";


        for(String nombre:nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
