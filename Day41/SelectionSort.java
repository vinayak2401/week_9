class SelectionSort{
  public static void main(String args[]){
    int arr[]={50,20,30,5,10};
    int n=arr.length;
    int temp;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    
  }
}