package controlFlows;

public class ifElseStatementleap {
    public static void main(String[] args) {

       int mes = 2;
       int ano = 2020;
       int numeroDias = 0;
       if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
           numeroDias = 31;
       }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
           numeroDias = 30;
       }else if (mes == 2){
            if(ano % 400 == 0 || (ano % 4 == 0 && !(ano % 100 == 0 ))){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
       }
        System.out.println("el mes " + mes + " tiene "+numeroDias+" dias" + " y año "+ ano);
    }
}
