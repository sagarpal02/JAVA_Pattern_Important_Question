//       #####             nested loops   and  doing some qustion realted to  bassic pattern          ####          // 
public class patterns {
    public static void main(String[] args) {
                                                  // Q1 Print a rectangele using * //
        int n = 4;
        int m = 5;
        // outer loop //
        for(int i = 1; i <=n; i++){
        // inner loop //
        for(int j = 1; j<=m;j++){
        System.out.print("*");
        }
        System.out.println();
        }
                                             /// Q2 print a hollow rectangle using of * ///

        int k = 4;
        int l = 5;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || j == 1 || i == k || j == l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
                                               /// Q3 print a half pyramid using of *  /// 
        int p = 4;
        for(int i =1; i<=p; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
                                                /// Q4 print inverted half pyramid using of 8  /// 
        int q = 4;
        for(int i = q; i >= 1; i--){
            for(int j= 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
                                                /// Q5 print inverted half pyramid (rotated by 180 deg)    /// 
        int r = 4;
        for(int i =1 ;i<=r; i++){
            // inner loop -> space print // 
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop -> star print //
            for(int j=1; j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
                                                // Q6 print number 1 to 5 half pyramid // 
        int t = 4;
        for(int i=1; i<=t; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            } 
            System.out.println();
        }
                                                // Q7 inverted half pyramid with Number // 
        System.out.println();
        int v = 5;
        for(int i=1; i<=v;i++){
            for(int j =1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

                                               //  Q8   Floyd's teiangle             //  
        int e = 5;
        int num = 1;
        for(int i =1; i<=e;i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++; 
            }
            System.out.println();
        }
                                                // Q9 0-1 triangle                 // 
System.out.println();
        int w = 5;
        for(int i=1; i<=w;i++){
            for(int j=1; j<=i; j++){
                int sum =i+j;
                if(sum % 2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
///////         /////////            ///////    All Are Important Qustions   //////       ///////        //////       ////       /////     ////