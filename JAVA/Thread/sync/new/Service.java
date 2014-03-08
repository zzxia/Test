class Service{
     public void fun1(){
        synchronized(this){
          try{
              Thread.sleep(3000);
          }
          catch(Exception e){
             System.out.println(e);
          }
          System.out.println("fun1");
       }
     }
   
     public void fun2(){
          synchronized(this){
             System.out.println("fun2");
          }
     }

/*   同步方法，跟同步方法块类似
    public synchronized void fun2(){
         System.out.println("fun2"); 
    }

*/
}
