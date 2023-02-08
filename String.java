1)Length Of a Given String

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		System.out.println(s1.length());
	}
}

Output-
a b c d 
4

-----------------------------------------------------------------------------------------


2)	Create a Character Array Containing The Contents Of a String

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="aabbccd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
	}
}

Output-
a a b b c c d

---------------------------------------------------------------------------------------


3)repeat Each Of The Character Twice

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch+ch;
		}
		System.out.print(s2);
	}
}

Output-
wweellccoommee

--------------------------------------------------------------------------------------


4)	string Contains Only Digits

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="1f23";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch<'0' || ch>'9')
			{
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("contains only digit);
		}
		else
		{
			System.out.println("not contains only digit);
		}
	}
}

Output-
not contains only digit


---------------------------------------------------------------------------------------

5)sumOf The Digits Present In The Given String


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="a2ba1ca3d";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>'0' && ch<'9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}
}

Output-
6

----------------------------------------------------------------------------------------

6)Find Frequency Of each Character

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "aabbcc";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(cnt==0)
			{
				System.out.println(s1.charAt(i)+" "+count);
			}
		}
	}
}

Output-
a 2
b 2
c 2
	
-----------------------------------------------------------------------------------------------------------------------	
	

7)Index Of All The Characters Of The Alphabet


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			System.out.println(i+" "+ch);
		}
	}
}

Output-
0 a
1 b
2 c
3 d


--------------------------------------------------------------------------------------------------------------------------

8)remove A Specified Character From AString

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="Aabcd";
		char ch='a';
		myCode(s1,ch);
	}
	//EndOfMainMethod
	private static void myCode(String s1,char ch) 
	{
		//WriteCode Here
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}

Output-
Abcd
	
------------------------------------------------------------------------------------------------------------------------------
	

9)replace D with F	
	
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "dddaa";
		char ch1='d';
		char ch2='f';
		myCode(s1,ch1,ch2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,char ch1,char ch2) 
	{
		//write code here
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch1)
			{
				s=s+ch2;
			}
			else
			{
				s=s+s1.charAt(i);
			}
		}
		System.out.println(s);
	}
}
			
			
Output-
        fffaa
	
--------------------------------------------------------------------------------------------------------------------------------------	
	

10)String Convert To Upper Case


import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}

Output-
WELCOME

	
----------------------------------------------------------------------------------------------------------------------------------------


11)String Convert To LowerCase

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "WELCOME";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}

Output-
welcome
	
-------------------------------------------------------------------------------------------------------------------------------	
	

12)remove Duplicate Ele From String

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "abbcfedafbcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}

Output-
abcfed
	
	
	
13)print All The Duplicates In  TheInput String
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcdabcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		char[]c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]);
					break;
				}
			}
		}
	}
}
			
			
Output-
4
abcd
	
	
	
	
14)sort Numbers In A String.
		
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "43521";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		char []s2=s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i]>s2[j])
				{
					char temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		s1=new String(s2);
		System.out.println(s1);
	}
}


Outpur-
	12345
