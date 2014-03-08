class MyThread implements Runnable{
    int i=100;
    public void run(){
      while(true){
         synchronized(this){ //同步代码块，防止数据出错
//Thread.currentThread  方法来获取当前线程正在哪个线程中执行
            if (i<0){
               break;
            }

            System.out.println(Thread.currentThread().getName()+i);
            i--;
//让出CPU
            Thread.yield();
         }
     }
  }

}
