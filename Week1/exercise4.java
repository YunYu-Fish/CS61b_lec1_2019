public class exercise4{

  public static void main(String[] args) {
    int[] a = {1,2,-3,4,5,4};
    int n = 3;
    windowPosSum(a,n);
    System.out.println(java.util.Arrays.toString(a));
  }

  public static void windowPosSum(int[] a, int n){
    for(int i=0; i<a.length; i++){
      int sum=0;
      if(a[i]<0)
        continue;
      for(int j=i; j<a.length; j++){
        if(j>i+n){
          break;
        }
        sum = sum + a[j];
        a[i] = sum;
      }
    }
  }

}
