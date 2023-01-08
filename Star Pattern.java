 1)
       
    *
   *
  *
 *
*
 *
  *
   *
    *
		 


class P
{
	public static void main(String args[])

	{
	
	// backward star
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j+i==5)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

//forward star
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j-i==0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------

	
2)

*****
****
***
**
*
 
 
 
 class P
 {
	 public static void main(String args[])
	 {

		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j+i<=4)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------

	
3)
    *
   **
  ***
 ****
*****



class P
 {
	 public static void main(String args[])
	 {

		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j+i>=4)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------

	
4)

*****
 ****
  ***
   **
    *
    


class P
 {
	 public static void main(String args[])
	 {

		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j-i>=0)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------


5)

*
**
***
****
*****



class P
 {
	 public static void main(String args[])
	 {

		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j-i<=0)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
 }


--------------------------------------------------------------------------------------------------------------------------------------------------------

	
6)

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

	
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<10;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j-i>=-5 && j+i>=5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	 }
 }
 

------------------------------------------------------------------------------------------------------------------------------------------------------------------ 


7)

*
**
***
****
*****
****
***
**
*



 class P
 {
	 public static void main(String args[])
	 {
       for(int i=0;i<10;i++)
        {
         for (int j=0;j<5;j++)
          {
           if(j-i<=0 && j+i<=8)
            System.out.print("*");
           else
            System.out.print(" ");
          }
          System.out.println();
        }
	 }
 }
 
 
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 
 8)
 
*****
****
***
**
*
**
***
****
*****



 class P
 {
	 public static void main(String args[])
	 {
      for(int i=0;i<9;i++)
       {
         for (int j=0;j<5;j++)
          {
            if(j+i<=4 || j-i<=-4)
            System.out.print("*");
          else
            System.out.print(" ");
          }
        System.out.println();
       }
    }
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------


9)

*********
 *******
  *****
   ***
    *


 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<9;j++)
			{
				if(j-i>=0 && j+i<=8)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
 }
 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------

 
 10)
 
    *
   ***
  *****
 *******
*********
 
 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<9;j++)
			{
				if(j+i>=4 && j-i<=4)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
 }

------------------------------------------------------------------------------------------------------------------------------------------------------------------

 
 11)
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 

 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<=9;i++)
		{
			for (int j=0;j<=9;j++)
			{
				if(j-i<=0 && j+i<=8)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------


12)


 
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
 

 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<=9;i++)
		{
			for (int j=0;j<=8;j++)
			{
				if((j-i<=0 && j+i<=8)||(j+i>=8 && j-i>=0))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------


13)
 
    *
   * *
  * * *
 * * * *
* * * * *
 
 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j+i>=4)
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 14)
 
* * * * *
 * * * *
  * * *
   * *
    *
 
 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j-i>=0)
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 15)
 
**********
****  ****
***    ***
**      **
*        *
 
 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				if(j+i<=4 || j-i>=5)				
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------

16)

 
*        *
**      **
***    ***
****  ****
**********

 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<10;j++)
			{
				if(j+i>=9 || j-i<=0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------

 17)
 
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
 
 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<9;i++)
		{
			for (int j=0;j<10;j++)
			{
				if((j+i<=4 || j-i>=5) ||( j+i>=13 || j-i<=-4))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 18)
 

    *****
   *****
  *****
 *****
*****

 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<10;j++)
			{
				if((j+i>=4 && j+i<=8))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
19)
 
*****
 *****
  *****
   *****
    *****
	

 
 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<10;j++)
			{
				if(j-i>=0 && j-i<=4)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

20)
 
    *****
   *****
  *****
 *****
*****
 *****
  *****
   *****
    *****
	

 class P
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if(( j+i>=4&& j+i<=8 && i<=4)||(i>4 && j-i>=-4 && j-i<=0))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


----------------------------------------------------------------------------------------------------------------------------------------------------------------------

21)

*
**
* *
*  *
*   *
*  *
* *
**
* 
 
 
 class P
 {
	 public static void main(String args[])
	 {
//horizontal line

		for(int i=0;i<9;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(j==0 || j-i==0 || j+i==8)
				{
					System.out.print("*");
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

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

22)

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 
 
 class P
 {
	 public static void main(String args[])
	 {
//horizontal line

		for(int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if(j+i==4 || j-i==4 || j-i==-4 || j+i==12)
				{
					System.out.print("*");
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


-----------------------------------------------------------------------------------------------------------------------------------------------------------
	
23)

----*----
---*-*---
--*-*-*--
-*-*-*-*-
*-*-*-*-*


class P
 {
	 public static void main(String args[])
	 {

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j+i>=4&& j-i<=4)
				{
					if((j+i)%2==0)
					System.out.print("*");
					else
					System.out.print("-");
				}
			else
				{
				System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
 
----------------------------------------------------------------------------XXXXXXXXXXXXX-------------------------------------------------------------------------
