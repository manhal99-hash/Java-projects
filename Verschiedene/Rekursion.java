public class Rekursion {
    public static void main(String[]args){
        System.out.println(binomialKoeffizient(5,2));
    }
    public static int fakRek(int a){
        if(a == 0){
            return 1;
        } else {
            return a * fakRek(a-1);
        }
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
   public static int binSuche(int[]arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int midd = start +(end - start)/2;
        if(arr[midd] == target){
            return midd;
        }
        if(target < arr[midd]){
            return binSuche(arr,target,start,midd-1);
        }
        return binSuche(arr,target,midd+1,end);
   }
  public static int potenz(int a,int b){
        if(b == 0){
            return 1;
        } else if(b == 1){
            return a;
        } else {
            return a * potenz(a,b-1);
        }
  }
  public static int querSumme(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            int letzteziffer = n % 10;
            return letzteziffer + querSumme(n/10);
        }
  }
  private static int fakutlaet(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
           return n * fakutlaet(n-1);
        }
  }
  public static int binomialKoeffizient(int n, int k){
        if(n == 0|| k == n){
            return 1;
        } else {
            return fakutlaet(n)/fakutlaet(k)*fakutlaet(n-k);
        }
  }

}
