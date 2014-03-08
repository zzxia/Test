class Aworker implements Worker{
    private Worker worker;
    public Aworker(Worker worker){
        this.worker=worker;
    }
    public void doSomeWork(){
        System.out.println("hello");
        worker.doSomeWork();

    }

}
