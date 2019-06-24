import java.util.Scanner;

public class Permutation {
    private static int counter = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }

    public void permute(String str, int frontIndex, int backIndex)
    {
        if (frontIndex == backIndex) {
            System.out.println(str);
            counter++;
        }
        else {
            for (int i = frontIndex; i <= backIndex; i++) {
                str = swap(str, frontIndex, i);
                permute(str, frontIndex + 1, backIndex);
                str = swap(str, frontIndex, i);
            }
        }
    }


    public int getCounter() {
        return counter;
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
