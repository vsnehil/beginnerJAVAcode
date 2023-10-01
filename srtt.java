import java.util.*;

class srtt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int sum[]=new int[(n-2)*(n-2)];
        int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        for (int p = 0; p < n - 2; p++) {
            for (int t = 0; t < n - 2; t++) {
                for (int i = 0; i < n - 2; i++) {
                    for (int j = 0; j < n - 2; j++) {
                        if (k == 1 && j == 0) {
                            sum[t] += a[i][k + t];
                            k = -1;
                        } else if (k == 0) {
                            sum[t] += a[i][j + t];
                        }
                    }
                    k++;
                }
                k = 0;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
               System.out.print(a[i][j]+" ");
               System.out.println();
        }
        System.out.println(sum[0]);
    }
}
