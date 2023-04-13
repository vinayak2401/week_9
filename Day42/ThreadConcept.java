class RunThread extends Thread{
  public void run(){
    System.out.println("Running...");
  }
}
class ThreadConcept{
  public static void main(String args[]){
    RunThread rt=new RunThread();
    rt.start();
  }
}