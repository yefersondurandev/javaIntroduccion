package charactersString;

public class exampleStringImmutability {
    public static void main(String[] args) {
        String curso = "curso introductorio de java ";
        String profesor = "yeferson duran saurez ";

        String result = curso.concat(profesor);
        System.out.println(result);

        String result2 = curso.transform(c ->{
            return c + "con " + profesor;
        });
        System.out.println(curso);//se mantiene original ya que es inmutable
        System.out.println(result2);//se pudo modificar almaceno sobre otro string
        String result3 = result.replace("a","A");

        System.out.println(result);//original
        System.out.println(result3);//modificado gracias a otro string
    }
}