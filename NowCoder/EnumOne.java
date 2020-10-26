package NowCoder;

enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
public class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
        System.out.println(AccountType.SAVING);
        System.out.println(AccountType.CURRENT);
        double d1=-0.5;
        System.out.println("Ceil d1="+Math.ceil(d1));
        System.out.println("floor d1="+Math.floor(d1));
        int [] x = new int[10];
        System.out.println(x[9]);
        System.out.println(x[0]);
    }
}
