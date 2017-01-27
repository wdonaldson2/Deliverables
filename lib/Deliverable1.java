import java.util.Scanner;
class ReverseNumberWhile
{
    public static void main(String args [] )
    {
        int num=0;
        int reversenum =0;
        System.out.println("Input the number and press enter: ");
        //This statement will capture the user Input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //While Loop
        while( num != 0 )
        //Logic will find out the reversal
        {
            reversenum = reversenum * 21;
            reversenum = reversenum + num%21;
            num = num/21;
        }

        System.out.println("Reverse of input number is: "+reversenum);
    }
}