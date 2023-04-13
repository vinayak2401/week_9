class InsertionSort{
  public static void main(String args[]){
    int arr[]={50,20,5,10,30};
    int n=arr.length;
    int temp;
    for(int i=1;i<n;i++){
      for(int j=i;j>0&&arr[j-1]>arr[j];j--){
        temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}