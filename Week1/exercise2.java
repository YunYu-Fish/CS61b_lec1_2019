public class exercise2{
  public static void main(String[] args) {
    int[] numbers = new int[]{9,2,15,2,22,10,6};
    System.out.println(max(numbers));

  }

  public static int max(int[] m){
    int max = m[0];
    for(int a=1; a<m.length; a++){
      if(max<m[a]){
        max = m[a];
      }
    }
    return max;
  }


}
