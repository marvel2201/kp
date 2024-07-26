package javass;

public class twonumbersifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i = 1;
int j = 2;
       if(i==j)
	{
	System.out.println("i is j");
	}
	
	else
	{
		System.out.println("i is not j");
	}
	}

}*/


/*
 * int i=1; for(i=1;i<=3;i++) { System.out.print(" " + i); }
 * System.out.println("");
 * 
 * int j=4; for(j=4;j<=6;j++) { System.out.print(" " + j); }
 * System.out.println();
 * 
 * int a=7; for(a=7;a<=9;a++) { System.out.print(" " + a); }
 * System.out.println();
 * 
 * int b=10; for(b=10;b<=12;b++) { System.out.print(" " + b); }
 * System.out.println();
 * 
 * int c=13; for(c=13;c<=15;c++) { System.out.print(" " + c); }
 * System.out.println();
 */
		
		String str = "prashanth", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i>=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
}
}