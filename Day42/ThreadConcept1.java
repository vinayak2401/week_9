class RunThread1 implements Runnable{
  public void run(){
    System.out.println("Running!!!");
  }
}
class ThreadConcept1{
  public static void main(String args[]){
    RunThread1 rt=new RunThread1();
    Thread thread=new Thread(rt);
    thread.start();
  }
}