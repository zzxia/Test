class User{
    private int age;
 //   public void setAge(int age){
    public void setAge(int age) throws Exception{
       if(age <0){
/*          RuntimeException e=new RuntimeException("age not <0");
          throw e; */
           Exception e=new Exception("not <0");
           throw e;
       }
       this.age=age;
    }
 
}
