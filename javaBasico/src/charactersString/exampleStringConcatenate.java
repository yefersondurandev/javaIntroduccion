package charactersString;

public class exampleStringConcatenate {
    public static void main(String[] args) {
        String curso = "curso introductorio de java ";
        String profesor = "miguel angel ";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numberA = 10;
        int numberB = 5;
        boolean logical = true;

        System.out.println(detalle + (numberA + numberB));
        String detalle2 = curso.concat(profesor);
        System.out.println(detalle2);
    }
}