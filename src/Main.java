import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        String str;
        int a,b,c,d;
        str=in.nextLine();

        a=((str.charAt(0)-'0')+7)%10;
        b=((str.charAt(1)-'0')+7)%10;
        c=((str.charAt(2)-'0')+7)%10;
        d=((str.charAt(3)-'0')+7)%10;
        System.out.printf("%d%d%d%d\n",c,d,a,b);
    }
}
