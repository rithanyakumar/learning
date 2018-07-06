import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int makeAnagram(String a, String b) 
    {
        int d=a.length();
        int e=b.length();
        int rep=d+e;
        int count=0;
        char arr[]=a.toCharArray();
        char brr[]=b.toCharArray();
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<e;j++)
            {
                if(arr[i]==brr[j])
                {
                    count=count+2;
                    brr[j]=0;
                    break;
                }
            }
        }
        return rep-count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
