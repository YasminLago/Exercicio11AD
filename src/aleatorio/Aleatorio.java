package aleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author oracle
 */
public class Aleatorio {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        RandomAccessFile ra = new RandomAccessFile("textoAleatorio.txt","rw");
        
        String [] codes ={"p1","p2","p3"};
        String [] descricion = {"parafusos","cravos","tachas"};
        double [] prices = {3.0,4.0,5.0};
        String cod = "";
        String des = "";
    
        //Se recorren las posiciones de los arrays
        for(int i=0;i<codes.length;i++){
           ra.writeChars(String.format("%-3s",codes[i]));
           ra.writeChars(String.format("%-10s", descricion[i]));
           ra.writeDouble(prices[i]); 
        }
        
        ra.seek(34); //Posicion 2
        for(int i = 0; i<13; i++){ // 13 = Numero de caracteres hasta donde se quiere leer
            if(i<3){
            cod +=  ra.readChar();
            }else{
            des +=  ra.readChar();
            }
        }
        
        Product p = new Product(cod,des,ra.readDouble());
        System.out.println(p);
          
        ra.close();
    }
        
}
