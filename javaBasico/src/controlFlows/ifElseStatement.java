package controlFlows;

public class ifElseStatement {
    public static void main(String[] args) {

        float promedio = 5.1F;

        if(promedio >= 6.5){
            System.out.println("felicidades es verdad tu valor de "+promedio+" es meyor que 6.5");
        } else if (promedio >= 6.0) {
            System.out.println("metale un poco mas de esfuerzo yeferson");
        } else{
            System.out.println("tu promedio " + promedio + " esta por debajo del promedio");
        }

    }
}
