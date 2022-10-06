public class testingfun{
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4();
        pattern5(5);
        pattern6(5);
        pattern7(4, 4);
        pattern8(4, 5);
        pattern9(5);
        pattern10(5);
        pattern11(4);

    }

    // pattern 1
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("    patn 1");
        }

    }

    // pattern 2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("     patn 2");
        }
    }

    // pattern 3
    static void pattern3(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("    patn 3");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("    patn3");
        }

    }

    // pattern 4
    static void pattern4() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int spac = i; spac >= n; spac--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    // pattern 5
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int colum = n; colum >= row; colum--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // pattern 6
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println(" pattern 6");
        }

    }

    // pattern 7
    static void pattern7(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i >= 2) && (j >= 2) && (i <= 3) && (j <= 3)) {

                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    // pattern 8
    public static void pattern8(int n, int m) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= m; star++) {
                if (line == 1 || star == n || line == 1 || star == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }

    // pattern 9
    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("     pattn9");
        }
    }

    // pattern 10
    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("      pttn 10");
        }
    }

    // pattern 11
    public static void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int spac = i; spac < n; spac++) {
                System.out.print("  ");
            }
            for (int spac = n; spac > i; spac--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("      pattern 1");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int spac = 1; spac < i; spac++) {
                System.out.print("  ");
            }
            for (int spac = 1; spac < i; spac++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("      pattern 1");
        }
    }
}
