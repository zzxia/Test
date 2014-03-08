class Test{
    public static void main(String args[]){
         Plumber plumber=new Plumber();
         Aworker aWorker1=new Aworker(plumber);
         aWorker1.doSomeWork();
  
         Carpenter carpenter=new Carpenter();
         Aworker aWorker2=new Aworker(carpenter);
         aWorker2.doSomeWork();

    }

}

