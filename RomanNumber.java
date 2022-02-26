import java.util.*;
class RomanNumber
{
    int n,th,nh,fh,frh,hun,nty,fif,frty,tn,nin,fiv,fr,one;
    String str="";
    public RomanNumber(int a)
    {
        n=a;
    }

    public void count(int a)    //function to get the digits from a number
    {
        th=a/1000;
        a=a%1000;
        nh=a/900;
        a=a%900;
        fh=a/500;
        a=a%500;
        frh=a/400;
        a=a%400;
        hun=a/100;
        a=a%100;
        nty=a/90;
        a=a%90;
        fif=a/50;
        a=a%50;
        frty=a/40;
        a=a%40;
        tn=a/10;
        a=a%10;
        nin=a/9;
        a=a%9;
        fiv=a/5;
        a=a%5;
        fr=a/4;
        a=a%4;
        one=a;
    }

    public void convert()   //function to form roman number
    {
        int i;
        for(i=1;i<=th;i++)
            str=str+"M";
        for(i=1;i<=nh;i++)
            str=str+"CM";
        for(i=1;i<=fh;i++)
            str=str+"D";
        for(i=1;i<=frh;i++)
            str=str+"CD";
        for(i=1;i<=hun;i++)
            str=str+"C";
        for(i=1;i<=nty;i++)
            str=str+"XC";
        for(i=1;i<=fif;i++)
            str=str+"L";
        for(i=1;i<=frty;i++)
            str=str+"XL";
        for(i=1;i<=tn;i++)
            str=str+"X";
        for(i=1;i<=nin;i++)
            str=str+"IX";
        for(i=1;i<=fiv;i++)
            str=str+"V";
        for(i=1;i<=fr;i++)
            str=str+"IV";
        for(i=1;i<=one;i++)
            str=str+"I";
        System.out.println("Roman Number: "+str);
    }

    public static void main(String args[])
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("\nEnter a number: ");
            int a=sc.nextInt();
            RomanNumber obj=new RomanNumber(a);
            obj.count(a);
            obj.convert();
            System.out.print("\n1. Continue\n2. Exit\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: continue;
                case 2: System.exit(0);
                    break;
                default: System.out.println("Invalid Entry. Please enter from the given choices.");
            }
        }
    }
}

