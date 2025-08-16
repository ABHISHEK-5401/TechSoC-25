import java.util.*;
import java.lang.Character;
public class CaesarCiphar {
    public static StringBuilder shift(String str, int n){
        //halding 0 shift
        if(n==0){
            return new StringBuilder(str);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(Character.isLetter(curr)){
                int charnum= (int)curr+n;
                if((charnum>=65 && charnum<=90)||(charnum>=97 && charnum<=122)){
                    ans.append((char)charnum);
                }
                else if(curr>='A'&&curr<='Z'){
                    if(charnum<65){
                        charnum+=26;
                        ans.append((char)charnum);
                    }
                    else{
                        charnum-=26;
                        ans.append((char)charnum);
                    }
                }
                else{
                    if(charnum<97){
                        charnum+=26;
                        ans.append((char)charnum);
                    }
                    else{
                        charnum-=26;
                        ans.append((char)charnum);
                    }
                }
            }
            else{
                ans.append(curr);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Press 1 to Code and 2 to Decode");
        int op=sc.nextInt();
        sc.nextLine();
        if(op==1){
            System.out.print("Type the String:");
            String str= sc.nextLine();
            System.out.print("Enter the shift value:");
            int n=sc.nextInt();
            System.out.println(shift(str, n));
        }
        else if(op==2){
            System.out.print("Type the String:");
            String str= sc.nextLine();
            System.out.print("Enter the shifted value:");
            int n=sc.nextInt();
            System.out.println(shift(str, -n));
        }
        else{
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
