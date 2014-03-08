import java.io.*;
class Test{
    public static void main(String args[]){
          FileInputStream fis=null;
          FileOutputStream fos=null;
        try{
          fis=new FileInputStream("file.txt");
          fos=new FileOutputStream("to.txt");
          byte[] buffer=new byte[1024];
          while (true){
             int temp=fis.read(buffer,0,buffer.length);
          //   for(int i=0;i<buffer.length;i++){
          //   System.out.println(buffer[i]);
             if (temp==-1){
                 break;
             }
             String s=new String(buffer);
             s=s.trim();
//             System.out.println(s);
             fos.write(buffer,0,temp); 
          }
        }
        catch(Exception e){
           System.out.println(e);
        }
        finally{
           try{
              fis.close();
              fos.close();
           }
           catch(Exception e){
              System.out.println(e);
           }
        }
    }
}
