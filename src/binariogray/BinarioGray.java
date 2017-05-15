/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binariogray;

/**
 *
 * @author Mjs
 */
public class BinarioGray {
   private int arg[];
   private int result[];
   
   public BinarioGray(){
   }
   
   // convierte de string  a arreglo de enteros
    public void stringToArreglo(String cadena) {
        arg = new int[cadena.length()];       
        for (int i = 0; i < arg.length; i++) {
            try {
                arg[i] = Integer.parseInt(cadena.charAt(i) + "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        result = arg;
    }

    // metodo de Binario a gray
    public void binarioToGray() {
        result = new int[arg.length];        
        for (int i = arg.length-1 ; i >= 0; i--) {
            if ((i - 1)>=0) {
                if (arg[i] == arg[i - 1]) {
                    result[i] = 0;
                } else {
                    result[i] = 1;
                }
                
            } else {
                result[i] = arg[i]; 
            }           
        }
      }
    // metodo de gray a binario
    public void grayToBinario() {
       result = new int[arg.length];
        result[0] = arg[0];
        for (int i = 1; i < arg.length; i++) {
            if (result[i - 1] == arg[i]) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
    }
    // convierte areglo a string
    public String numeroToString() {
        String cadena = "";
        for (int i = 0; i < result.length; i++) {
            cadena += result[i];
        }
        return cadena;
    }
   
}
