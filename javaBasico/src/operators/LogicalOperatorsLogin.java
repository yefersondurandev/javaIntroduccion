package operators;

import java.util.Scanner;

public class LogicalOperatorsLogin {
    public static void main(String[] args) {

       /* String[] userNames = new String[2];
        String[] passWords = new String[2];
        userNames[0] = "yeferson";
        passWords[0] = "12345";

        userNames[1] = "admi";
        passWords[1] = "12345";


        */
        String[] userNames = {"yeferson","admin","escobar"};
        String[] passWords = {"12345","1234","123"};
        Scanner sc = new Scanner(System.in);


        System.out.println("enter username");
        String usuario = sc.next();

        System.out.println("enter password");
        String pass = sc.next();

        boolean isAutenticado = false;
        for (int i = 0;i < userNames.length;i++){
            isAutenticado = (userNames[i].equalsIgnoreCase(usuario) && passWords[i].equals(pass)) ? true:isAutenticado;


            /*if(userNames[i].equalsIgnoreCase(usuario) && passWords[i].equals(pass)){
                isAutenticado = true;
                break;

             */
            }
        String mensaje = isAutenticado ? "Bienvenido ".concat(usuario).concat("!") : "username incorrecto carechimba";
        System.out.println("mensaje = " + mensaje);

        /*
        if(isAutenticado){
            System.out.println("bienvenido xdd");
        }else{
            System.out.println("contraseña no encontraba");
        }

         */


    }
}
