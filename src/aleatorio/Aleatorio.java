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
    String [] codes ={"p1","p2","p3"};
    String [] descricion = {"parafusos","cravos","tachas"};
    double [] prices = {3.0,4.0,5.0};
    
    RandomAccessFile ra = new RandomAccessFile("textoAleatorio.txt","rw");
        
    for(int i=0;i<codes.length;i++){
        /*   ra.seek(0);
           ra.writeChars(String.format("%1$-10s",codes[i]));
           //ra.write('\t');
           ra.close();*/
           ra.seek(34);
           ra.writeChars(String.format("%1$-25s", descricion[i]));
           //ra.write('\t');
           ra.close();
//           ra.writeDouble(prices[i]);
        
   
            
           
          System.out.println(codes[i]+descricion[i]);
        }
       
        ra.close();
    }
        
}