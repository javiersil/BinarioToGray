# BinarioToGray
Convertidor de  Binario a Gray  


Decimal Gray Binario
   0     000    000
   1     001    001
   2     011    010
   3     010    011
   4     110    100
   5     111    101
   6     101    110
   7     100    111
   
   tienes que tener en cuenta que para convertir de binarios a Gray los valores que deben ser sumados en base 2 
   sin tomar encuenta el acarreo. 
   
   1+1=0
   0+0=0
   1+0=1
   0+1=1
   
ejemplo. de un numero 1010  se suma asi mismo pero  desplazado un bit a la derecha (simplemente se le aplica una operación XOR)

1010
 1010
----
11110

 y anulando el ultimo bit del resultado, ejemplo para 11110 se anula el 0 danfo el numero Gray  1111
