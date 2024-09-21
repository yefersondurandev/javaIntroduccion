package controlFlows;

import javax.swing.*;

public class sentenciaForArrays {
    public static void main(String[] args) {
         String[] nombres = new String[5]; // colecion de datos de un mismo tipo Varibables
         nombres[0] = "maria";
         nombres[1] = "yeferson";
         nombres[2] = "camilo";
         nombres[3] = "lina";
         nombres[4] = "luz";
         int cantidad = nombres.length;

         for(int i = 0;i <= cantidad-1;i++){
             if(nombres[i].equalsIgnoreCase("camilo")|| nombres[i].equalsIgnoreCase("luz")){
                 continue;
             }
             System.out.println( i +" = " + nombres[i]);
         }

         String buscar = JOptionPane.showInputDialog("ingrese un nombre");
         System.out.println("buscar = " + buscar);

         boolean encontrado = false;
         for(int i = 0;i < cantidad;i++){
             if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
             }
         }

         if(encontrado){
             JOptionPane.showMessageDialog(null,"el nombre de "+ buscar + " se encuentra en el array de nombres");
         }else{
             JOptionPane.showMessageDialog(null,"no encontrado dentro del array de nombre");
         }
    }
}
