import java.io.*;
class TestBufferReader{
   public static void main(String args[]){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try{
           fileReader=new FileReader("file.txt");
           bufferedReader=new BufferedReader(fileReader);
           String line=null;
           while(true){
               line=bufferedReader.readLine();
               if (line==null){
                  break;
               }
               System.out.println(line);
           }

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
             try{

             }
             catch(Exception e){
                System.out.println(e);
             }


        }



   }


}

