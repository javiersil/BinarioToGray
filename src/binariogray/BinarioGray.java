/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binariogray;

/**
 *
 * @author cosma_000
 */
public class BinarioGray {
   private int arg[];
   
   public BinarioGray(){
   }
   
   // convierte de string  a arreglo de enteros
    public void stringToBinario(String cadena) {
        arg = new int[cadena.length()];
        for (int i = 0; i < arg.length; i++) {
            try {
                arg[i] = Integer.parseInt(cadena.charAt(i) + "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // metodo de Binario a gray
    public String binarioToGray() {
        int gray[] = new int[arg.length];
        
        for (int i = arg.length-1 ; i >= 0; i--) {
            if ((i - 1)>=0) {
                System.out.println(arg[i] +" | " +arg[i-1]);
                if (arg[i] == arg[i - 1]) {
                    gray[i] = 0;
                     System.out.print(0);
                } else if ((arg[i] == 1 && arg[i - 1] == 0) || (arg[i] == 0 && arg[i - 1] == 1)) {
                    gray[i] = 1;
                     System.out.print(1);
                }
                
            } else {
                gray[i] = arg[i]; 
                 System.out.println("s"+arg[i]);
            }
           
        }
       return numeroToString(gray);
    }
    //falta metodo de gray a binario
    
    // convierte areglo a string
    public String numeroToString(int arreglo[]) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            cadena += arreglo[i];
        }
        return cadena;

    }
   
}
