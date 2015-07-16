import java.util.Scanner;
public class Salesman
{
public static void main(String ... args)
{int arr [][];
String arr1[][];
String arr2[][];
arr=new int [6][6];
arr1=new String [6][6];
arr2=new String [6][6];
Scanner scn=new Scanner(System.in);
int no,p1=0,p2=0,p3=0,p4=0,total=0,total1=0,total2=0,total3=0,i,j;



System.out.println("enter salesman no.");
for(i=0;i<4;i++)
{
arr[i][0]= scn.nextInt();
}
System.out.println("enter p1 no");
for(i=0;i<4;i++)
{
arr[i][1]= scn.nextInt();
}
System.out.println("enter p2 no.");
for(i=0;i<4;i++)
{
arr[i][2]= scn.nextInt();
}
System.out.println("enter p3 no.");
for(i=0;i<4;i++)
{
arr[i][3]= scn.nextInt();
}
System.out.println("enter p4 no.");
for(i=0;i<4;i++)
{
arr[i][4]= scn.nextInt();
}
for(i=0;i<4;i++)
{
total= total+arr[0][i+1];
}
for(i=0;i<4;i++)
{
total1= total1+arr[1][i+1];
}
for(i=0;i<4;i++)
{
total2= total2+arr[2][i+1];
}
for(i=0;i<4;i++)
{
total3= total3+arr[3][i+1];
}

arr[0][5]=total;

arr[1][5]=total1;
arr[2][5]=total2;
arr[3][5]=total3;
//System.out.println("total"+total);
//System.out.println("product total");
for(i=0;i<4;i++)
{
p1= p1+arr[i][1];//4,1
}
for(i=0;i<4;i++)
{
p2= p2+arr[i][2];//4,2
}
for(i=0;i<4;i++)
{p3= p3+arr[i][3];//4,3
}
for(i=0;i<4;i++)
{p4= p4+arr[i][4];//4,4
}

arr[4][1]=p1;
arr[4][2]=p2;
arr[4][3]=p3;
arr[4][4]=p4;
//arr[0][0]=(String)"product no";

//System.out.print("product no"+"p1"+"p2"+"p3"+"p4");
/*for(i=0;i<4;i++)

{
System.out.print(arr[i][1]*/
arr1[0][0]="Salesman id";
arr1[0][1]="prodduct1";
arr1[0][2]="prodduct2";
arr1[0][3]="prodduct3";
arr1[0][4]="prodduct4";
arr1[0][5]="total";
for(i=0;i<1;i++)
{for(j=0;j<6;j++)
System.out.print(arr1[i][j]+"   ");
System.out.println();
}

for(i=0;i<5;i++)
{
for(j=0;j<6;j++)
if((i==4)&&(j==0))
{
arr2[4][0]="Prod Total";
System.out.print(arr2[4][0] +" ");
}
else


System.out.print(arr[i][j]+"            ");
System.out.println();
}
//arr2[4][0]="Prod Total";
//System.out.print(arr2[4][0]);
}
}