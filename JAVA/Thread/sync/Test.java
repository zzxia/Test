class Test{
    public static void main(String args[]){
        MyThread myThread=new MyThread();
    //生成两个Thread对象，但是这两个Thread对象共用同一个线程体  
        Thread t1=new Thread(myThread);
        Thread t2=new Thread(myThread);
    //每一个线程都有名字，可以通过Thread对象的setName()方法设置线程名字，也可以用
//getName来获取线程的名字
        t1.setName("线程a");
        t2.setName("线程b");
       
        t1.start();
        t2.start();
    }

}
