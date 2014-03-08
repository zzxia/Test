class Test{
    public static void main(String args[]){
        RunnableImpl ri=new RunnableImpl();
        Thread t=new Thread(ri);
       // t.setPriority(Thread.MAX_PRIORITY);//设置该线程的最大优化级
        t.setPriority(8);//设置该线程的最大优化级
        System.out.println(t.getPriority());
        t.setPriority(Thread.MIN_PRIORITY);//设置该线程的最大优化级
        System.out.println(t.getPriority());
        t.start();
//线程的优先级最大是10，最小是1，可以通过Thread所提供的静态常来设置线程的优先级
    //   for (int i=0;i<100;i++){
    //        System.out.println("mainthread-->"+i);
    //    }

    }
}
