public class factorialprog {
  public static void factorial(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      num *= i;
    }
    System.out.println(num);
  }

  public static void main(String[] args) {

    int n = 5;
    factorial(n);
  }
}
