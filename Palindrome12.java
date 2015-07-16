
public class Palindrome12
{

public static void main(String ... args)

 {long num,num1;
 long a=0,b,c,d,e,f,g,h,i;
 
 for(i=12345;i<98766;i++)
 a=i/10000;
 //System.out.println("number"+a);
 b=i%10000;
 c=b/1000;
 d=b%1000;
 e=d/100;
 f=d%100;
 g=f%10;
 h=f/10;

 
 num1=4*((g*10000)+(h*1000)+(e*100) + (c*10) +a);

 if(i==num1)

 System.out.println("number"+i);
 
 }
 }
