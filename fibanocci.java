class Fibanocci
{

public static void main(String args[])
{
	  int a=0;
	  int b=1;
	  System.out.println(a);
	  System.out.println(b);
	  for(int c=0;c<=10;c++)
	  {
	  int d=a+b;
	  a=b;
	  b=d;
	  System.out.println(d);
	  }
}
}   