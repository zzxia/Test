class RunnableImpl implements Runnable{
    public void run(){
       for (int i=0;i<100;i++){
          System.out.println("runnable-->"+i);
          if (i==50){
             try{
                Thread.sleep(1000);
             }
             catch(Exception e){
                System.out.println(e);
             }
       }
      }
    }
}
