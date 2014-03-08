//Reader<---FileReader
//int read(char[],int off,int len);
//Writer<--FileWriter
//void write(char[],int off,int len)
import java.io.*;
class TestChar {
     public static void main(String args[]){
         FileReader fr=null;
         FileWriter  fw=null;
         try{
            fr=new FileReader("file.txt");
            fw=new FileWriter("to.txt");
            char[] buffer=new char[100];
            while(true){
                 int temp=fr.read(buffer,0,buffer.length);
                 if (temp==-1){
                    break;
                 }
//                 for(int i=0;i<buffer.length;i++){
//                   System.out.println(buffer[i]);
//                 }
                 fw.write(buffer,0,temp);
             }

         }
         catch(Exception e){
            System.out.println(e);
         }
         finally{
             try{
                fw.close();
                fr.close();
             }
             catch(Exception e){
                System.out.println(e);
             }

         }


     }
}
