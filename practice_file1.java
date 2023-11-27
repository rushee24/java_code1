package  pratice_1;



/*
class jav
{
    public static void main(String[] args) {
        int []arr={2,31,13,3,13,4,4};
        int s=0;
        int end=arr.length-1;
        while (s<end)
        {
            int temp=arr[s];
            arr[s]=arr[end];
            arr[end]=temp;
            s++;
            end--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
/*

class jav
{
    static  int getmin(int arr[],int i,int n)
    {
        return (n==1)? arr[i]:Math.min(arr[i],getmin(arr,i+1,n-1))
    }
    static  int getmin(int arr[], int i,int n)
        [
                ]
    public static void main(String[] args) {

    }
}

/*
class jav
{
    public static void main(String [] args)
    {
        int [] arr={1,2,34,543,22,90};
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }

    }
}

/*
class jav
{
    public static void main(String[] args) {
        int arr[]={1,22,344,555,3,33,33,3};
        int res=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            res=Math.max(res,arr[i]);

            if(i ==arr.length-1)
                System.out.println(arr[i]);
        }
        System.out.println(res);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        int arr[]={1,22,45,33,11,22,33,43,66};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
/*
import java.util.Arrays;

class jav
{
    public static void main(String[] args) {
        int arr[]={1,33,233,222,3442,221,2,11,90};
        Arrays.sort(arr);
        System.out.println("min="+arr[0]);
    }
}

/*
class peakelement
{
    static int binarysearch(int arr[],int low, int high,int n)
    {
        int mid=low +(high-low)/2;
        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
        {
            return mid;
        }
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return binarysearch(arr, low, (mid - 1), n);

        static int findpeak(int arr[],int n)
        {
            return binarysearch(arr,0,n-1,n);
        }
    }
}
class jav
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,5};
        int n=arr.length;
        peakelement.binarysearch(arr,0,n-1,n);
    }
}
/*
class jav
{
    public static int method(int arr[],int n)
    {
        if(n==1)
        {
            return 1;
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,6};
        int n=arr.length;
        System.out.println("Index of by "+method(arr,n));
    }
}



/*
package pratice_1;
class jav
{
    public static void main(String[] args) {
        String str="Rushikesh";
        char []temp= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            temp[i]=str.charAt(i);
        }
        for(int i= temp.length-1;i>=0;i-- ){
            System.out.print(temp[i]);
        }

    }
}
/*
class jav
{
    public static void main(String[] args) {
        System.out.println("Rushikesh");
    }
}

/*


class jav
{
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("apple");
        name.add("Banana");
        name.add("cherry");
        name.add("peru");
        System.out.println(name.get(0));
        System.out.println("here has all fruits:");
        for (String fruit:name
             ) {
            System.out.println(fruit);
        }
        boolean con=name.contains("peru");
    }
}

/*

class jav
{
    public static void main(String[] args) {
        String  s1="Education";
        char arr[]=s1.toCharArray();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
                System.out.print(arr[i]);
        }
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(!(c=='a'||c=='A'||c=='i'||c=='I'||c=='e'||c=='E'||c=='o'||c=='O'||c=='u'||c=='U'))
            {
                System.out.print(c);
            }
        }
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String s1="Education";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(!(c=='a'||c=='A'||c=='i'||c=='I'||c=='e'||c=='E'||c=='o'||c=='O'||c=='u'||c=='U'))
            {
                System.out.print(c);
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if((c=='a'||c=='A'||c=='i'||c=='I'||c=='e'||c=='E'||c=='o'||c=='O'||c=='u'||c=='U'))
            {
                System.out.print(c);
            }
        }
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String s1="Education";
        char []temp= new char[s1.length()];
        char [] temp1=new char[s1.length()];;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                temp[i]=c;
            else
            {
                temp1[i]=c;
            }
        }

        System.out.println(temp1);
    }
}

/*
import java.util.Locale;
class jav{
    public static void main(String[] args) {
        String str="Education";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                System.out.print(c);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'))
            {
                System.out.print(c);
            }
        }
    }
}


/*

class jav
{
    public static void main(String[] args) {
        String s1="Rushikesh";
        s1=s1.toLowerCase();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                System.out.print(count--);
            else
                System.out.print(c);
        }
    }
}
/*

class jav
{
    public static void main(String[] args) {
        String s1="Rushikesh";
        s1=s1.toLowerCase();
        int count =0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='i'||c=='e'|| c=='o')
            {
                System.out.println(c);
            }
            else
            {
                System.out.println("this are the consunant:"+c);
            }
        }
    }
}
/*

class jav
{
    public static void main(String[] args) {
        String str1="Rushikesh khillare";
        System.out.println(str1.replace('a','k'));
    }
}
/*
class jav
{
    public static void main(String[] args) {
        String str1="Rushikesh khillare";
        System.out.println(str1.substring(1,8));;
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String str="Rushikesh";
        String str1="khillare";
        String res=String.join(" " ,str1 +" "+str);
        System.out.println(res);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String str;
        str=String.join("_","I","am","Happy");
        System.out.println(str);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String str1="i";
        String str2="love";
        String str3="Rushikesh";
        String name=String.join(" " + str2,str1,str3);
        System.out.println(name);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String str1="Rushikesh khillare";
        System.out.println(str1.substring(0,7));// this line exicuting for 0 to 7 index
        System.out.println(str1.substring(3,5));//this line is starting for the 3 to 5 index
    }
}


/*
class  jav
{
    public static void main(String[] args) {
        String str1="program";
        //it is starting for the 0 and 3 index
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(3));
    }
}


/*
class jav
{
    public static void main(String[] args) {
        String str1= "java is fun";
        System.out.println(str1.substring(0,4));
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String str1="Rushikesh khillare";
        String str2="java";
        String str3="java";
        if(str1.contains(str2))
        {
            System.out.println(str1 +  "contain "+ str2);
        }
        else
        {
            System.out.println(str1 + " if not " + str2);
        }
    }
}

/*
class jav{
    public static void main(String[] args) {
        String str1 ="Rushikesh khillare";
        boolean res=str1.contains("Rushikesh");
        System.out.println(res);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String name=new String("khillare");
        System.out.println(name);
    }
}


/*
class jav
{
    public static void main(String[] args) {
        String first ="java programing";
        String second="java programing ";
        boolean res=first.equals(second.trim());
        boolean res1= first.contains(second);
        System.out.println(res1);
    }
}

/*

class jav
{
    public static void main(String[] args) {
        String first="java";
        System.out.println(first);
        String second ="programming";
        System.out.println(first+second);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String greet="Hello world";
        System.out.println(greet);
        int len=greet.length();
        System.out.println(len);
    }
}

/*
class jav
{
    public static void main(String[] args) {
        String first ="java";
        String second="Python";
        String third="javasript";
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}


/*

class myclass implements Runnable
{
    public  void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread"+ Thread.currentThread().getId());
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("catch black");
            }
        }
    }
}

/*
class mythread extends Thread
{
    public  void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread"+Thread.currentThread().getId()+i );
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public  class jav {
    public static void main(String[] args) {
        mythread obj = new mythread();
        obj.start();
    }
}


/*
interface  drawable
{
    void draw();
}
class child implements drawable
{
    public void draw()
    {
        System.out.println("this is interface method");
    }
}
class jav
{
    public static void main(String[] args) {
        child obj=new child();
        obj.draw();
    }
}
/*
abstract class shape{
    public abstract double area();
    public  void display()
    {
        System.out.println("This is shape");
    }
}
class child extends shape
{
    public double area()
    {
        System.out.println("This is abstract method from parent class");
        return width*height;
    }
    private double width;
    private double height;
    child(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
}
class jav
{
    public static void main(String[] args) {
        child obj=new child(78,87.0);
        System.out.println(obj.area());
    }
}
/*
class animal
{
    String brand;
     animal(String brand)
    {
        this.brand=brand;
        System.out.println("this is parent class con:"+brand);
    }
    void start()
    {
        System.out.println("starting the engine of the vehicle");
    }
}
class car extends animal
{
    car(String brand)
    {
        super(brand);
    }
    void method()
    {
        super.start();
    }
}
class jav
{
    public static void main(String[] args) {
       animal obj=new animal("india");

    }
}
/*
class animal
{
    String name;
    animal(String name)
    {
        this.name=name;
    }
    void makesound()
    {
        System.out.println("this is parent class "+name);
    }
}
class dog extends animal
{
    dog(String name)
    {
      super(name);
    }
    @Override
    void makesound()
    {
        super.makesound();
    }
}
class jav
{
    public static void main(String[] args) {
        dog obj=new dog("Rushikesh");
        obj.makesound();

    }
}
/*
class animal
{
    String name;
    animal(String name)
    {
        this.name=name;
        System.out.println("this is parent class con:"+name);
    }
    void makesound()
    {
        System.out.println("animal makes a sound");
    }

}
class  dog extends  animal
{
    String breed;
    dog(String name,String breed)
    {
        super(name);
        System.out.println("child class"+name);
        this.breed=breed;
    }
    void makesound()
    {
        super.makesound();
        System.out.println("dog barks");
    }
    void display()
    {
        System.out.println("Name:"+super.name);
        System.out.println("bred:"+this.breed);
    }
}
class jav
{
    public static void main(String[] args) {
        animal obj=new animal("Rushikesh");
        obj.makesound();
        dog obj1=new dog("khillare","khilllare");
    }
}


/*

class animal
{
    String name;
    animal(String name)
    {
        this.name=name;
    }
    public void makesoun()
    {
        System.out.println("animal make a sound");
    }
}
class dog extends animal
{
    String breed;
    dog(String name,String breed)
    {
        super(name);
        this.breed=breed;
    }
    void makesound(){
        super.makesoun();
        System.out.println("this class has used the super keyword to calling the privious call method");
    }
    void display()
    {
        System.out.println(super.name);
        System.out.println(this.breed);
    }
}
class jav
{
    public static void main(String[] args) {
        animal obj= new animal("satya");
        dog obj1=new dog("pappi","american");
        obj1.display();
    }
}
/*

class shape
{
    int a;
    public void draw()
    {
        System.out.println("thise is the method");
    }
}
class circle extends shape
{
    public void draw()
    {
        System.out.println("thise is child class");
    }
}
class rectanle extends shape
{
    public void draw()
    {
        System.out.println("this is child class but it is rectangle child class");
    }
}
class jav
{
    public static void main(String[] args) {
        rectanle obj=new rectanle();
        obj.draw();
    }
}



/*
class main
{
    public static void main(String args[])
    {
        int mat[][]={{1,2,3,4},
                { 12,3,4,4},
                {
                    4,4,4,4
                },
                {112,4,421,3}};
        int n=4,m=4;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]>max)
                {
                    max=mat[i][j];
                }
            }
        }
        System.out.println(max);
    }
}




/*
    1
   22
  333
 4444
55555


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
EDCBA
DCBA
CBA
BA
A


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
/*
edcba
edcb
edc
ed
e


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}
/*
AAAAA
BBBB
CCC
DD
E
class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(+64));
            }
            System.out.println();
        }
    }
}


/*
ABCDE
ABCD
ABC
AB
A

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
5
45
345
2345
12345


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
54321
5432
543
54
5


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
12345
2345
345
45
5


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
12345
1234
123
12
1


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
55555
4444
333
22
1

class pattrn
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }

    }
}

/*
11111
2222
333
44
5



class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print();
            }
            System.out.println();
        }
    }
}


/*
11111
2222
333
44
5

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/*
5
45
345
2345
12345


class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
E
ED
EDC
EDCB
EDCBA

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=n+1-i;j--)
            {
                System.out.print((char) (64+j));
            }
            System.out.println();
        }
    }
}


/*
a
ba
cba
dcba
edcba
class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}



/*
A
BA
CBA
DCBA
EDCBA

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
A
AB
ABC
ABCD
ABCDE
class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
1
21
321
4321
54321

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
1
12
123
1234
12345

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
5
44
333
2222
11111

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}



/*
1
22
333
4444
55555

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}

/*
eeeee
ddddd
ccccc
bbbbb
aaaaa

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(i+96));
            }
            System.out.println();
        }
    }
}


/*
edcba
edcba
edcba
edcba
edcba

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}


/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char) (i+64));
            }
            System.out.println();
        }
    }
}
/*
54321
54321
54321
54321
54321

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
12345
12345
12345
12345
12345
class jav{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
55555
44444
33333
22222
11111

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
55555
44444
33333
22222
11111
class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}

/*
11111
22222
33333
44444
55555

class jav
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
import java.util.Scanner;

class sum
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
    }
}

/*
class sum
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            int sum=0;
            for(int j=2;j<i;j++)
            {
                sum+=i*j;
            }
            System.out.println(sum);
        }
    }
}
/*


class Substr {
    public static void main(String[] args) {
        String str = "abcabcb";
        int maxLength = 0;
        String repeatedSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                int length = j - i;

                // Check if the substring repeats within the remaining string
                for (int k = j; k <= str.length() - length; k++) {
                    String remaining = str.substring(k, k + length);
                    if (substring.equals(remaining) && length > maxLength) {
                        maxLength = length;
                        repeatedSubstring = substring;
                    }
                }
            }
        }

        if (maxLength > 1) {
            return repeatedSubstring;

        }
    }
}

/*
package pratice_1;


class Substr {
    public static void main(String[] args) {
        String str = "abcabcbb";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
/*
class substr
{
    public static void main(String[] args) {
        String str="rushikesh";
        char []arr= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }

            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<str.length();j++)
                {
                    System.out.print(arr[j]);

                }
                System.out.print(" ");
            }

    }
}


/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindSum {
    public List<int[]> findPairsWithSum(int arr[], int n) {
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    pairs.add(new int[]{arr[i], arr[j]});
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 9, 45, 33, 33};
        FindSum s1 = new FindSum();
        int n = 9;
        System.out.println(s1.pairs);
        }
    }


/*
import java.util.Arrays;

class findsum
{
    public int [] sum(int arr[],int n)
    {
        int[] arr1 =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+arr[i+1]==n)
                arr1[i]=i;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr ={ 12,2,9,45,33,33 };
        findsum s1=new findsum();
        int n=9;
        System.out.println(Arrays.toString(s1.sum(arr, n)));

    }
}

/*
class jav
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,3,33,11,44,332};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!= arr[j])
                {
                    System.out.print(" "+arr[j]);
                    break;
                }
            }
        }
    }
}



/*class pri
{


    public static void main(String[] args) {
        int arr[]={111,2,3,4,5};
        int max=0,min=arr[2];
        for(int i=0;i<arr.length-1;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            } else if (arr[i]>max) {
                max=arr[i];
            }

        }
        System.out.println("MIN:" +min);
        System.out.println("MAX:" +max);

    }
}


/*
//bubble sort
class jav
{
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,32,3,1,2,3,4,5,122,45,1,21,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}

/*
class jav
{
    public static void main(String[] args) {
        int n=5;
       for(int i=1;i<=n;i++)
       {
           for(int j=i;j<=n;j++)
           {
               System.out.print("Ram"+ "\t");
           }
           System.out.println();
       }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("Ram"+ "\t");
            }
            System.out.println();
        }
    }
}


/*
package pratice_1;
public class jav{
    public static void main(String[] args) {
        int n = 0;
        int end = 11;
        int count = 0;

        while (true) {
            int temp = n;
            int length = 0;

            // Calculate the number of digits in n
            while (temp != 0) {
                temp /= 10;
                length++;
            }

            temp = n;
            int sum = 0;

            // Calculate the sum of digits each raised to the power of length
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, length);
                temp /= 10;
            }

            if (sum == n) {
                count++;
            }

            if (count == end) {
                System.out.println("The " + end + "th Armstrong number is " + n);
                break;
            }
            n++;
        }
    }
}

/*
class jav {
    public static void main(String[] args) {
        int n=0;
        int length=0;
        int end=25;
        int count=0;
        while(true)
        {
            int temp=n;
            while(temp!=0)
            {
                temp/=10;
                length++;
            }
            temp=n;
            int sum=0;
            while(temp!=0)
            {
                sum=sum+(int)(Math.pow(temp%10,length));
                temp=temp/10;
            }
            if (sum==n)
            {
                count++;
            }
            if(count==end)
            {
                System.out.println("The "+end+"th armstrong number is "+n);
                break;
            }
            n++;
        }

    }
}
*/
