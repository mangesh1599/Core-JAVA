                                                                                    *Character Patterns*
						  
				                                 Character pattern easy solution . This is helpful for you .  		  
				                               ---------------------------------------------------------------




/*25,

A
AB
ABC
ABCD
ABCDE


*/

public class character_pattern_25{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		int  cnt=0;
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(cnt+65));
				cnt++;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}



method 2------>>>>>>>>

public class character_pattern_25{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		char ch='A';
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(ch);
				ch++;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}


eq method ------>>>>
public class character_pattern_25{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(j+65));
				cnt++;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}

--------------------------------------------------------------------------------------------------------



/*26,

A
BB
CCC
DDDD
EEEEE

*/

public class character_pattern_26{
public static void main(String [] args){
	int  cnt=0;
	for(int i=0;i<5;i++){
	
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(cnt+65));
				
			}
			else
				System.out.print(" ");
				
		}cnt++;
		System.out.println();
		}
		
	
	}
}

Method 2 ------->>>>>>>


public class character_pattern_26{
public static void main(String [] args){
	char ch='A';
	for(int i=0;i<5;i++){
	
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(ch);
				
			}
			else
				System.out.print(" ");
				
		}ch++;
		System.out.println();
		}
		
	
	}
}
	


---------------------------------------------------------------------------------------------------

/* 51,

A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A
*/




public class character_pattern_27{
public static void main(String [] args){
	int  cnt=0,cnt2=4;
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)
				
			{
				if(i<4)
				System.out.print((char)(cnt+65) );
			    else
				System.out.print((char)(cnt+65));
			}
			else
			System.out.print(" ");
		}
		cnt++;
		if(i>=4)
			cnt--;
		System.out.println();
	}
		
	
	}
}

methode 2nd ---------->>>>>>>



public class character_pattern_27
{

public static void main(String [] args)
{   
    char ch='A',ch2='E';
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)
				
			{
				if(i<4)
				System.out.print(ch );
			    else
				System.out.print(ch2 );
			}
			else
			System.out.print(" ");
		}
		ch++;
		if(i>=4)
			ch2--;
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------


/* 28,

A
AB
ABC
ABCD
ABCDE
ABCD
ABC
AB
A
*/



public class character_pattern_28{
public static void main(String [] args){
	for(int i=0;i<9;i++)
	{   int  ch1=0;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)
				
			{
				
				System.out.print((char)(ch1++ + 65) );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
		
	
	}
}
 


method 2------>>>>>>



public class character_pattern_28
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   char ch1='A';
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)
				
			{
				
				System.out.print(ch1++ );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------



/* 29,

ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE
*/



public class ccharacter_pattern_25{
public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   int ch1=0;
		for(int j=0;j<5;j++)
		{
	        if(j+i<=4 || j-i<=-4)
				
			{
				
				System.out.print((char)(ch1++ +65) );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}

Method 2 ------->>>>>>

public class character_pattern_29
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   char ch1='A';
		for(int j=0;j<5;j++)
		{
	        if(j+i<=4 || j-i<=-4)
				
			{
				
				System.out.print(ch1++ );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}

------------------------------------------------------------------------------------------------------



/* 30,

FEDCBA
EDCBA
DCBA
CBA
AB
A
AB
ABC
ABCD
ABCDE
ABCDEF
*/

public class character_pattern_30
{

public static void main(String [] args)
{   
    int ch=5;
	for(int i=0;i<11;i++)
	{   int ch1=ch;
		int ch3=0;
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 || j-i<=-5)
				
			{   if(i<4)
				
				System.out.print((char)(ch1-- +65) );
				else
				System.out.print((char)(ch3++ + 65));
			    
			}
			else
			System.out.print(" ");
		}
		
		ch--;
		System.out.println();
	}
}
}


Method 2 -------->>>>>>>>>

public class character_pattern_30
{

public static void main(String [] args)
{   
    char ch='F';
	for(int i=0;i<11;i++)
	{   char ch1=ch;
		char ch3='A';
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 || j-i<=-5)
				
			{   if(i<4)
				
				System.out.print(ch1-- );
				else
				System.out.print(ch3++);
			    
			}
			else
			System.out.print(" ");
		}
		
		ch--;
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------
/* 31,

     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F

*/




public class character_pattern_31
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   int  ch1=0;
		
		for(int j=0;j<6;j++)
		{
	        if(j+i>=5 )
			System.out.print((char)(ch1++ + 65)  + " " );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}




Method 2 ------------------>>>>>>>




public class character_pattern_31
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   char ch1='A';
		
		for(int j=0;j<6;j++)
		{
	        if(j+i>=5 )
			System.out.print(ch1++ + " " );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}




/* 32,

FEDCBA
FEDCB
FEDC
FED
FE
F

*/


public class character_pattern_32
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   int ch1=5;
		
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print((char)(ch1-- +65) );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}



Method 2------------>>>>>>>


public class character_pattern_32
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   char ch1='F';
		
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print(ch1-- );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------


/* 33,

F
FE
FED
FEDC
FEDCB
*/



public class character_pattern_33
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   int  ch1=5;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print((char)(ch1-- +65) );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


Method -------->>>>>>

public class character_pattern_33
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   char ch1='F';
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print(ch1-- );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------


/* 34,

ABCDEF
ABCDE
ABCD
ABC
AB
A

*/

public class character_pattern_34
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   int ch1=0;
		
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print((char)(ch1++ + 65) );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


Method ----------->>>>>> 


public class character_pattern_34
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   char ch1='A';
		
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print(ch1++ );
				
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}



------------------------------------------------------------------------------------------------



/* 35,

A
BC
DEF
GHIJ
KLMNO
*/




public class character_pattern_35
{

public static void main(String [] args)
{   
	int  ch=0;
    
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print((char)(ch++ + 65) );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}

Method 2----->>>>>

public class character_pattern_35
{

public static void main(String [] args)
{   
	char  ch='A';
    
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print(ch++  );
			    
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


-----------------------------------------------------------------------------------------------


/* 36,

A
BA
CBA
DCBA
EDCBA
*/




public class character_pattern_36
{

public static void main(String [] args)
{   
	int ch=0;
    
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print((char)(ch1--) );
			    
			}
			else
			System.out.print(" ");
		}
		ch++;
		
		System.out.println();
	}
}
}

Method 2------------------->>>>>>>>>>>>>>>>



public class character_pattern_36
{

public static void main(String [] args)
{   
	char ch='A';
    
	for(int i=0;i<5;i++)
	{   char ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print(ch1-- );
			    
			}
			else
			System.out.print(" ");
		}
		ch++;
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------



/* 37,

A
BG
CHM
DINS
EJOTY
FKPUZ_

*/




public class character_pattern_37
{

public static void main(String [] args)
{   
	int ch=0;
    
	for(int i=0;i<6;i++)
	{   int ch1=ch;
		for(int j=0;j<6;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print((char)(ch1+65));
				ch1+=5;
				
			    
			}
			else
			System.out.print(" ");
		}
		ch++;
		
		System.out.println();
	}
}
}



Method 2------>>>>>>>>>



public class character_pattern_37
{

public static void main(String [] args)
{   
	char ch='A';
    
	for(int i=0;i<6;i++)
	{   char ch1=ch;
		for(int j=0;j<6;j++)
		{
	        if(j-i<=0 )
				
			{
				
				System.out.print(ch1);
				ch1+=5;
				
			    
			}
			else
			System.out.print(" ");
		}
		ch++;
		
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------


/* 73,

A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

*/


public class character_pattern_73{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		int ch=0;
        
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print((char)(ch++ + 65));
				else
				System.out.print((char)(ch-- + 65));
				
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		
		
		System.out.println();
	}
	
}
}

Method 2------>>>>>>>>


public class character_pattern_73{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		char ch='A';
        
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print(ch++);
				else
				System.out.print(ch--);
				
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		
		
		System.out.println();
	}
	
}
}

------------------------------------------------------------------------------------------------------



/* 74,

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA


*/



public class character_pattern_74{
public static void main(String[] args)
{	
	for(int i=0;i<5;i++)
	{
		int ch=0;

		for(int j=0;j<10;j++)
		{
			if(j+i>=4 && j-i<=4)
			{   if(j<4)
				System.out.print((char)(ch++ + 65));
				else
				System.out.print((char)(ch-- + 65));
				
			}
			
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
}
}



Method 2------>>>>>>>




public class character_pattern_74{
public static void main(String[] args)
{	
	for(int i=0;i<5;i++)
	{
		char ch='A';

		for(int j=0;j<10;j++)
		{
			if(j+i>=4 && j-i<=4)
			{   if(j<4)
				System.out.print(ch++);
				else
				System.out.print(ch--);
				
			}
			
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
}
}


------------------------------------------------------------------------------------------


/* 85,

OO*OO
OO*OO
*****
OO*OO
OO*OO

*/




public class character_pattern_85
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==2 || j==2 )
				
			{
				
				System.out.print("*");
			}
			else
			System.out.print("O");
		}
		
		
		System.out.println();
	}
}
}

---------------------------------------------------------------------------------------------------



/* 86,

OXXXX
XOXXX
XXOXX
XXXOX
XXXXO

*/




public class character_pattern_86
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 )
				
			{
				
				System.out.print("O");
			}
			else
			System.out.print("X");
		}
		
		
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------------


/* 87,

A   A
 A A
  A
 A A
A   A

*/




public class character_pattern_87
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 || j+i==4 )
				
			{
				
				System.out.print("A");
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------


/* 89,

ABBBA
BABAB
BBABB
BABAB
ABBBA

*/




public class character_pattern_89
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 || j+i==4 )
				
			{
				
				System.out.print("A");
			}
			else
			System.out.print("B");
		}
		
		
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------



/* 88,

PPPPP
P   P
P   P
P   P
PPPPP

*/




public class character_pattern_88
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==0 || j==0 || i==4 || j==4 || i==4 )
				
			{
				
				System.out.print("P");
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------



/* 90,

PPPPP
PQQQP
PQQQP
PQQQP
PPPPP

*/




public class character_pattern_90
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==0 || j==0 || i==4 || j==4 || i==4 )
				
			{
				
				System.out.print("P");
			}
			else
			System.out.print("Q");
		}
		
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------


/* 91,

    N
   N
  N
 N
N

*/




public class character_pattern_91
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j+i==4 )
				
			{
				
				System.out.print("N");
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------------------


/* 92,

N
 N
  N
   N
    N

*/




public class character_pattern_92
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<9;j++)
		{
	        if(j-i==0 )
				
			{
				
				System.out.print("N");
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}


-----------------------------------------------------------------------------------------------------------------



/* 93,

N       N
 N     N
  N   N
   N N
    N

*/




public class character_pattern_93
{

public static void main(String [] args)
{   
	
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<9;j++)
		{
	        if(j-i==0  || j+i ==8)
				
			{
				
				System.out.print("N");
			}
			else
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}



========================================xxxxxxxxxxx======================================================

