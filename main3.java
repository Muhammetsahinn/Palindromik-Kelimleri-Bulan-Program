import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main3 {

    static boolean isPalindromik(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
            return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindromik2(String str){
        String top = "";
        for(int i = str.length()-1; i>=0; i--){
            top += str.charAt(i);
        }
            if(str.equals(top))
                return true;
            else
                return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindromik2("kavak"));

    }
}
