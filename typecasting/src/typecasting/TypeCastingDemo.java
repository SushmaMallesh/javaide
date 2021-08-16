package typecasting;

public class TypeCastingDemo {
	public static void main(String args[])
	{
	byte b=(byte)((byte)(13+(12)));
	System.out.println(b);
    
	short s=(short)((short)(20+(2334)));
	System.out.println(s);
	
	short sh=(short)((short)(20)+(byte)(34));
	System.out.println(sh);
	
	
	
	char ch=(char)((int)(12)+(char)('b'));
	System.out.println(ch);
	
	byte a =44;
	int a1 = a;
	System.out.println(a1);
	
	short o=145;
	int a2=o;
	System.out.println(a2);
	
	
	char p='m';
	int a3=p;
	System.out.println(a3);
	
	double q=452.14f;
	int a4=(int)q;
	System.out.println(a4);
	
	double q1=15252.45f;
	long a5=(long)q1;
	System.out.println(a5);
	
	long q2=14575896;
	float f=q2;
	System.out.println(f);
	

	
	
	
	
	
    }
}
