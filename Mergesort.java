import java.util.Scanner;
class Mergesort
{
void sort(int a[],int low,int high)
{
int N=high-low;
if(N<=1)
return;
int mid=low+N/2;
sort(a,low,mid);
sort(a,mid,high);
int temp[]=new int[N];
int i=low,j=mid;
for(int k=0;k<N;k++)
{
if(i==mid)
temp[k]=a[j++];
elseif(j==high)
temp[k]=a[i++];
elseif(a[j]<a[i])
temp[k]=a[j++];
else
temp[k]=a[i++];
}
for(int k=0;k<N;k++)
a[low+k]=temp[k];
}
public static void main(String[]args)
{
int a[],n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements:");
n=sc.nextInt();
a[]=newint[n];
System.out.println("enter "+n+"elements:");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
Mergesort ms=new Mergsort();
ms.sort(a,0,n);
System.out.print("array after Mergesort is :");
for(i=0;i<n;i++)
System.out.println(""+a[i]);
}
}