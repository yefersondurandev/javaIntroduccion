package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        
        i += 2;
        System.out.println("i = " + i);

        j -= 4; // j = j=9 - 4 == 4
        System.out.println("j = " + j);

        String sqlString = "select * from clientes AS c ";
        sqlString += "where c.nombre = 'Andres'";
        sqlString += "and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
