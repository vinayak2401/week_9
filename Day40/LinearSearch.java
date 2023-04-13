import java.util.Scanner;
class Order{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
     System.out.println("Enter size of the array");
    int n=s.nextInt();
    int arr[]=new int[n];
     System.out.println("Enter elements");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Enter element to search");
    int key=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(key==arr[i]){
        System.out.println("Found");
      }
    }
  }
}