package controlFlows;

public class sentenceWhile {
    public static void main(String[] args) {
        int i = 0;

        while(i < 5){
            System.out.println("i = " + (i+1));
            i++;
        }

        System.out.println();
        i = 0;
        boolean prueba = true;

        do{
            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);

        prueba = false;

        do{
            System.out.println("primero arranca despues preguntas xddd");
        }while (prueba);


    }
}
