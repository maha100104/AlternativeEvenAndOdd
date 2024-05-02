import java.util.*;
public class Dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            System.out.print("Enter the number: ");
            arr[i]=sc.nextInt();
        }
        List<Integer> even=new ArrayList<>();
        List<Integer> odd= new ArrayList<>();
        for(int num:arr)
        {
            if(num%2==0)
            {
                even.add(num);
            }
            else
            {
                odd.add(num);
            }
        }
        int i=0,j=0;
        System.out.println("Alternative Even Odd Numbers: ");
        while(i<even.size() && i<odd.size())
        {
            System.out.print(even.get(i++)+" ");
            System.out.print(odd.get(j++)+" ");
        }
        while(i<even.size())
        {
            System.out.print(even.get(i++)+" ");
        }
        while(j<odd.size())
        {
            System.out.print(odd.get(j++)+" ");
        }
    }
}
/*
Input:
Enter the Size:  5
Enter the number: 4
Enter the number: 5
Enter the number: 44
Enter the number: 47
Enter the number: 78
Output:
Alternative Even Odd Numbers: 
4 5 44 47 78 */
