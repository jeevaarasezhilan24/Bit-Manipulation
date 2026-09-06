import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=0;i<32;i++){
            rev=rev+(n&1);
            n>>=1;
            if(i<=30){
                rev<<=1;
            }
        }
        System.out.print(rev);
    }
}