class Test {
   public static void main(String args[]){
     A a=new A();
     //A.B b=new A().new B();
     A.B  b=a.new B();
     a.i=3;
     b.j=5;
     int result=b.funB();
     System.out.println(result);
   }

}
