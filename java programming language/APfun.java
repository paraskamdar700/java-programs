public class APfun {
    public static void main(String[] args) {
        hollorec(4, 5);
        invhalfprimad(4);
        invnumpiramid(5);
        floyds_triangle(5);
        zerotoonetri(5);
        butterfly2(4);
        solidrombhous(5);
        diamond(4);

    }

    public static void hollorec(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("    hollo rec");
        }

    }

    public static void invhalfprimad(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println("    inverted half piramid");
        }
    }

    public static void invnumpiramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println("    inverted number half piramid");
        }

    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter + " ");
                counter++;

            }
            System.out.println("    floyds triangle");
        }
    }

    public static void zerotoonetri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int b = i + j;
                if (b % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("    0-1 triangle");
        }
    }

    public static void butterfly2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int spac = 1; spac <= 2 * (n - i); spac++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("    ");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int spac = 1; spac <= 2 * (n - i); spac++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("    ");
        }
    }

    public static void solidrombhous(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= n; star++) {
                if (i == 1 || i == n || star == 1 || star == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("    solid rombhous");
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
             for (int star = 1; star <=2*i-1; star++) {
                    
                System.out.print("* ");
           }   
           System.out.println("    diamond");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
             for (int star = 1; star <=2*i-1; star++) {
                    
                System.out.print("* ");
           }   
           System.out.println("    diamond");
        }
    }
}
