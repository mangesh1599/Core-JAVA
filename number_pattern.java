Number Patterns
						  
				  Number pattern easy solution . This is helpful for you .  		  
				----------------------------------------------------------
				
/*38

1
12
123
1234
12345

*/


public class number_Pattern_38{
public static void main(String [] args){
	int i,j;
	for(i=0;i<5;i++){
		int cnt=1;
		for(j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(cnt);
				cnt++;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}
	
--------------------------------------------------------------------------------------------------------------------------------------------------


/*39

5
54
543
5432
54321

*/

public class number_Pattern_39{
public static void main(String [] args){
	int i,j;
	for(i=0;i<5;i++){
		int cnt=5;
		for(j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(cnt);
				cnt--;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*40,

12345
2345
345
45
5

*/


public class number_Pattern_40{
public static void main(String[] args)
{	
	int cnt=1;
	for(int i=0;i<5;i++)
	{	
		int cnt1=cnt;
	
		for(int j=0;j<5;j++)
		{
			if(j+i<=4)
			{
				System.out.print(cnt1);
				cnt1++;
			}
			else
				System.out.print(" ");
		
		}
		cnt++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------


/*42.

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/



public class number_Pattern_42{
public static void main(String[] args)
{	
	int cnt=1,cnt2=5;
	for(int i=0;i<9;i++)
	{   int cnt1=cnt;
		int cnt3=cnt2;
		for(int j=0;j<5;j++)
		{
	        if(j-i>=0 || i+j>=8)
				
			{
				if(i<4)
				System.out.print(cnt1++ +" ");
			    else
				System.out.print(cnt3++ + " ");
			}
			else
			System.out.print(" ");
		}
		cnt++;
		if(i>=4)
			cnt2--;
		System.out.println();
	}
}
}



equation method------>>>

public class number_Pattern_42{
public static void main(String[] args)
{	
	for(int i=0;i<10;i++)
	{
		

		for(int j=0;j<5;j++)
		{
			if(j-i>=0 || j+i>=9)
			{
				System.out.print((j+1+" "));
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

--------------------------------------------------------------------------------------------------------------------------------------------------



/*43,

    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

public class number_Pattern_43{
public static void main(String[] args)
{	
	int cnt=5;
	for(int i=0;i<5;i++)
	{	
		int cnt1=cnt;
	
		for(int j=0;j<5;j++)
		{
			if(j+i>=4)
			{
				System.out.print(cnt1+" ");
				cnt1++;
			}
			else
				System.out.print(" ");
		
		}
		cnt--;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------



/*44,

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/




public class number_Pattern_44{
public static void main(String[] args)
{	int cnt=1;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i+j>=4)
			{
				System.out.print(cnt+" ");
			
			}
			else
			{
				System.out.print(" ");
			}
		}
		cnt++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

/*45,

1
12
123
1234
12345
123456
1234567
12345678
123456789

*/




public class number_pattern_45
{

public static void main(String [] args)
{
	for(int i=0;i<9;i++)
	{  int cnt=1;
		for(int j=0;j<9;j++)
		{
	        if(j-i<=0)
			{
				System.out.print(cnt++);
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------



/* 46,

1
22
333
4444
55555
666666
7777777
88888888
999999999

*/




public class number_pattern_46
{

public static void main(String [] args)
{    int cnt=1;
	for(int i=0;i<9;i++)
	{  
		for(int j=0;j<9;j++)
		{
	        if(j-i<=0)
			{
				System.out.print(cnt);
			}
			else
			System.out.print(" ");
		}
		cnt++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------




/*47,

9
98
987
9876
98765
987654
9876543
98765432
987654321

*/




public class number_pattern_47
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{  int cnt=9;
		for(int j=0;j<9;j++)
		{
	        if(j-i<=0)
			{
				System.out.print(cnt--);
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*48,

9
88
777
6666
55555
444444
3333333
22222222
111111111

*/




public class number_pattern_48
{

public static void main(String [] args)
{    int cnt=9;
	for(int i=0;i<9;i++)
	{  
		for(int j=0;j<9;j++)
		{
	        if(j-i<=0)
			{
				System.out.print(cnt);
			}
			else
			System.out.print(" ");
		}
		cnt--;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------



/*49,

        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789
*/

public class number_Pattern_49{
public static void main(String[] args)
{	
	for(int i=0;i<9;i++)
	{
		int cnt=1;

		for(int j=0;j<9;j++)
		{
			if(i+j>=8)
			{
				System.out.print(cnt++);
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

eq. method ------>>>>>


public class number_Pattern_49{
public static void main(String[] args)
{	
	for(int i=0;i<9;i++)
	{
		

		for(int j=0;j<9;j++)
		{
			if(i+j>=8)
			{
				System.out.print((j+i-7));
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

--------------------------------------------------------------------------------------------------------------------------------------------------


/*50,

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999


*/




public class number_Pattern_50{
public static void main(String[] args)
{	
	for(int i=0;i<5;i++)
	{
		
		int cnt=0;
		for(int j=0;j<10;j++)
		{   
			for(int k=0;k<3;k++){
				System.out.print(cnt);
			}
			cnt++;
		}
		
		System.out.println();
	}
	
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/* 51,

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1

*/




public class number_pattern_51
{

public static void main(String [] args)
{   
    int cnt=1,cnt2=5;
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j+i>=4 && j-i>=-4)
				
			{
				if(i<4)
				System.out.print(cnt +" ");
			    else
				System.out.print(cnt2 + " ");
			}
			else
			System.out.print(" ");
		}
		cnt++;
		if(i>=4)
			cnt2--;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------




/*52,

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/




public class number_pattern_52
{

public static void main(String [] args)
{   
    int cnt=1;
	for(int i=0;i<9;i++)
	{  
		for(int j=0;j<9;j++)
		{
	        if(j+i>=8)
			{
				System.out.print(cnt+" ");
			}
			else
			System.out.print(" ");
		}
		cnt++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/* 53,

        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/




public class number_pattern_53
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   int cnt=1;
		for(int j=0;j<9;j++)
		{
	        if(j+i>=8)
			{
				System.out.print(cnt++ +" ");
			}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/*54,

9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

*/




public class number_pattern_54
{

public static void main(String [] args)
{   
    int cnt=9;
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<9;j++)
		{
	        if(j-i>=0)
			{
				System.out.print(cnt +" ");
			}
			else
			System.out.print(" ");
		}
		cnt--;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/*55,

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


*/




public class number_pattern_55
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   int cnt=1;
		for(int j=0;j<9;j++)
		{
	        if(j-i<=0 && j+i<=8)
			{
				System.out.print(cnt++);
			}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------




/*56

1
12
123
1234
12345


*/




public class number_pattern_56
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   int cnt=1;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
			{
				System.out.print(cnt++);
			}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/*58

12345
1234
123
12
1
12
123
1234
12345

*/




public class number_pattern_58
{

public static void main(String [] args)
{   
    
	for(int i=0;i<9;i++)
	{   int cnt=1;
		for(int j=0;j<9;j++)
		{
	        if(j+i<=4 || j-i<=-4)
			{
				System.out.print(cnt++);
			}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/* 59,

12345
 1234
  123
   12
    1
   12
  123
 1234
12345
*/



public class number_Pattern_59{
public static void main(String[] args)
{	
	for(int i=0;i<9;i++)
	{
		int cnt=1;

		for(int j=0;j<5;j++)
		{
			if(j-i>=0 || i+j>=8)
			{   if(i<4)
				System.out.print(cnt++);
				else
				System.out.print(cnt++);
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



eq method ------>>>>>>

 
public class number_Pattern_59{
public static void main(String[] args)
{	
	for(int i=0;i<9;i++)
	{
		

		for(int j=0;j<5;j++)
		{
			if(j-i>=0 && i<=4)
			{
				System.out.print(j-i+1);
			}
			else if(i+j>=8)
			{
				System.out.print(j+i-7);
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


--------------------------------------------------------------------------------------------------------------------------------------------------



/*60

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5


*/




public class number_Pattern_60{
public static void main(String[] args)
{	int cnt=1;
	int cnt3=4;
	for(int i=0;i<9;i++)
	{ 
	  
	  int cnt2=cnt;
	  int cnt4=cnt3	;
        
		for(int j=0;j<5;j++)
		{
			if(j-i>=0  || j+i>=8)
			{  
				if(i<=4)
				System.out.print(cnt2++ +" ");
				else
				System.out.print(cnt4++ +  " ");
			}
		
			else
			{
				System.out.print(" ");
			}
			
		}
		cnt++;
		if(i>4)
			cnt3--;
		System.out.println();
			
		
		
	}
	
}
}



--------------------------------------------------------------------------------------------------------------------------------------------------

/* 71,

1
121
12321
1234321
123454321


*/




public class number_Pattern_71{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		int cnt=1;
        
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print(cnt++);
				else
				System.out.print(cnt--);
				
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

--------------------------------------------------------------------------------------------------------------------------------------------------



/* 72,

    1
   121
  12321
 1234321
123454321


*/
public class number_Pattern_72{
public static void main(String[] args)
{	int cnt=0;
	for(int i=0;i<5;i++)
	{
		cnt=1;

		for(int j=0;j<10;j++)
		{
			if(j+i>=4 && j-i<=4)
			{   if(j<4)
				System.out.print(cnt++);
				else
				System.out.print(cnt--);
				
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


--------------------------------------------------------------------------------------------------------------------------------------------------


/* 76,

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/




public class number_Pattern_76{
public static void main(String[] args)
{	int cnt=1;
	for(int i=0;i<5;i++)
	{
		

		for(int j=0;j<5;j++)
		{
			if(j-i<=0)
			{
				System.out.print(cnt+" ");
				cnt++;
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

--------------------------------------------------------------------------------------------------------------------------------------------------




/*77,

1
26
3710
481113
59121415


*/




public class number_Pattern_77{
public static void main(String[] args)
{	int cnt=1;
	for(int i=0;i<5;i++)
	{ 
	  int diff=4;
	  int cnt1=cnt;
		
        
		for(int j=0;j<5;j++)
		{
			if(j-i<=0)
			{  
				System.out.print(cnt1);
				
			}
			else
			{
				System.out.print(" ");
			}
			cnt1=cnt1+diff;
			diff--;
			
		}
		
		cnt++;
		System.out.println();
	}
	
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/*81

1        1
12      21
123    321
1234  4321
1234554321

*/




public class pattern_81
{

public static void main(String [] args)
{   int cnt1=1;
	for(int i=0;i<5;i++)
	{   int cnt=1;
		int cnt2=cnt1;
		for(int j=0;j<10;j++)
		{
			if(j-i<=0 || i+j>=9)
			{ if(j<=4)
				System.out.print(cnt++);
				
				else
				System.out.print(cnt2--);
			}
			else
				System.out.print(" ");
		}
		cnt1++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*82,

1        1
22      22
333    333
4444  4444
5555555555

*/




public class pattern_82
{

public static void main(String [] args)
{   int cnt1=1;
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<10;j++)
		{
			if(j-i<=0 || i+j>=9)
			{ 
				System.out.print(cnt1);
				
				
			}
			else
				System.out.print(" ");
		}
		cnt1++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*83

1        1
12      12
123    123
1234  1234
1234512345

*/




public class pattern_83
{

public static void main(String [] args)
{   
	for(int i=0;i<5;i++)
	{   int cnt=1,cnt1=1;
		for(int j=0;j<10;j++)
		{
			if(j-i<=0 || i+j>=9)
			{ if(j<=4)
				System.out.print(cnt++);
				
				else
				System.out.print(cnt1++);
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*104

10101
10101
10101
10101
10101

*/




public class number_pattern_104
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j%2==0)
				
			{
			System.out.print("1");
			}
			else
			System.out.print("0");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/*105

10101
01010
10101
01010
10101

*/




public class number_pattern_105
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if((i+j)%2==0)
				
			{
			System.out.print("1");
			}
			else
			System.out.print("0");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------



/* 106

1
01
101
0101
10101

*/




public class number_pattern_106
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0){
		
				if((i+j)%2==0)
				
				{
				System.out.print("1");
				}
				else
				System.out.print("0");
				}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}



--------------------------------------------------------------------------------------------------------------------------------------------------


/*107

10000
01000
00100
00010
00001

*/




public class number_pattern_107
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i==0)
				
				{
				System.out.print("1");
				}
				else
				System.out.print("0");
				
			
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*108,

10000
02000
00300
00040
00005

*/




public class number_pattern_108
{

public static void main(String [] args)
{   
    int count=1;
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i==0)
				
				{
				System.out.print(count);
				}
				else
				System.out.print("0");
				
			
		}
		count++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


/*109,

11111
11122
11333
14444
55555

*/




public class number_pattern_109
{

public static void main(String [] args)
{   
    int count=1;
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j+i>=4)
				
				{
				System.out.print(count);
				}
				else
				System.out.print("1");
				
			
		}
		count++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------




/*110

55555
45555
34555
23455
12345

*/




public class number_pattern_110
{

public static void main(String [] args)
{   
    int count=5;
	for(int i=0;i<5;i++)
	{   int cnt1=count;
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0)
				
				{
				System.out.print(cnt1++);
				}
				else
				System.out.print("5");
				
			
		}
		count--;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------


/*111

55555
54444
54333
54322
54321

*/




public class number_pattern_111
{

public static void main(String [] args)
{   
    int cnt=5;
	for(int i=0;i<5;i++)
	{   int cnt1=5;
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0)
				
				{
				System.out.print(cnt1--);
				}
				else
				System.out.print(cnt);
				
			
		}
		cnt--;
		System.out.println();
	}
}
}


------------------------------------------------------------------xxxxxxxxxx--------------------------------------------------------------------------------

