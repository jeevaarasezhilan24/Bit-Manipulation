import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();int n=0,ans=0;
        for(int i=a;i<=b;i++){
            n=i;
           int count=0;
            while(n>0){
                count+=(n&1);
                n>>=1;
            }
            if(isprime(count)){
                ans++;
            }
        }System.out.print(ans);

    }
    public static boolean isprime(int val){
        if(val<2){return false;}
        for(int i=2;i*i<=val;i++){
            if(val%i==0){
                return false;
            }
        }return true;
    }
}
