class Test{
    public static void main(String args[]){
         //Aimpl al=new Aimpl();
         //A a =al;
         B b =new B();
         //b.fun(a);

//匿名内部类的实现，先new A，再把内部的方法实现，没有名称，所以是匿名类 
         b.fun(new A(){
             public void doSomething(){
                System.out.println("匿名内部类");
             }
          });
    }
 
}
