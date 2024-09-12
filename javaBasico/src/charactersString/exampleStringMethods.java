package charactersString;

public class exampleStringMethods {
    public static void main(String[] args) {
        String name = "Yeferson";
        String apellido = "yeferson";
        System.out.println("name.length = " + name.length()); // para saber la cantidad de caracteres
        System.out.println("name.toUpperCase = " + name.toUpperCase());//convertir cadena en mayuscula
        System.out.println("name.toLowerCase = " + name.toLowerCase());//convertir cadena en miniscula
        System.out.println("name.equals() = " + name.equals(apellido));// conparar por valor de cadena
        System.out.println("name.equalsIgnoreCase(apellido) = " + name.equalsIgnoreCase(apellido));// ignora si tiene mayuscula o minuscula
        System.out.println("name.charAt(0) = " + name.charAt(7)); //retornar o devolver por posicion indicada un colo caracter de una cadena
        System.out.println("name.substring(0) = " + name.substring(0,5));//devuelve la cadena entera o entre rangos tambien desde la posicion que le indica la cual es inclusive osea tambien se agrega


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas.indexOf("a"));//retorna la primera ocurrencia de un caracter dentro de una cadena en entero
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf("a"));//retorna la ultima ocurrencia de un caracter dentro de una cadena en entero
        System.out.println("trabalenguas = " + trabalenguas.contains("t"));//busca dentro de la cadena si contiene el valor propocinado y devolvera un true o false
        System.out.println("trabalenguas = " + trabalenguas.startsWith("traba"));//devuelve true si la cadena empieza con los mismo caracteres que proporciono
        System.out.println("trabalenguas = " + trabalenguas.endsWith("as"));//devuelve true si termina con el ultimo caracter de una cadena
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());//si tienes espacios en blanco los elimina
    }
}
