public class DrawTriangle{
  public static void main(String[] args) {
    drawTriangle(10);

    int[] numbers = new int[]{5,2,0};
    System.out.println(numbers.length);
  }

  public static void drawTriangle(int N){
    for(int row=1; row<=N; row++){
      for(int col = 1;col<=row;col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
