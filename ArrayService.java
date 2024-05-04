import java.util.Scanner;
public class ArrayService {
	
//add array elements of matrix1
	public static void addnewdata(int[][] arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements of matrix1: ");
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				//System.out.println("Enter the number at row "+i+" and coloumn "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
	}
	
//----------------------------------------------------------------------------------------
	
	
	//display array elements of matrix1
	public static void displaydata(int[][] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}
	
//----------------------------------------------------------------------------------------
		
	
	
	
	public static void transposearray(int[][] arr)
		{
			
			System.out.println("Transpose of matrix is");
			int transpose[][]= new int[3][3];
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					transpose[j][i]=arr[i][j];
				
				}
			}
			
			for(int i=0;i<transpose.length;i++)
				{
					for(int j=0;j<transpose[i].length;j++)
					{
						System.out.print(transpose[i][j]+"\t");
					}
					System.out.println();
					
				}
				
			
		  }
		

//----------------------------------------------------------------------------------------		
		
	
	public static void rowsum(int[][] arr)
		{		
			int sum1=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					sum1=sum1 + arr[i][j];
				}
				System.out.println("sum of rows is"+sum1);
				sum1=0;
			}
		}
		
		
//----------------------------------------------------------------------------------------		
		
		
		public static void colsum(int[][] arr)
		{		
			int sum2=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					sum2=sum2 + arr[j][i];
				}
				System.out.println("sum of column is"+sum2);
				sum2=0;
			}
	  	}
		
		
		
//----------------------------------------------------------------------------------------		
	
		
		public static void addnewdata2(int[][] arr)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array elements of matrix2: ");
			
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					
					//System.out.println("Enter the number at row "+i+" and coloumn "+j);
					arr[i][j]=sc.nextInt();
				}
			}
			
		}
		
//----------------------------------------------------------------------------------------		
		
		
		
		public static void matrixmultiplication(int[][] arr2,int[][] arr)
		{
			int[][]result = new int[3][3];
		
			System.out.println("Multiplication of array is :");
			
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{	result[i][j]=0;
					for(int k=0;k<3;k++)
					{
						result[i][j]=result[i][j]+arr2[i][k]*arr[k][j];
					}
			
			
			
				}
			}
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				
					
					System.out.print(result[i][j]+"\t");
		
				}
				System.out.println();
				
			}
			
			
		}
		
//----------------------------------------------------------------------------------------				
		
		
		public static void addmatrix(int[][] arr2,int[][] arr)
		{
			int c[][]=new int[3][3];
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					c[i][j]= arr2[i][j]+arr[i][j];
				}
		
				
			}
			
			System.out.println("addition of matrix is :");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				
					System.out.print(c[i][j]+"\t");
		
				}
				System.out.println();
				
			}
		}
	
		
		
//----------------------------------------------------------------------------------------			
		
		
		public static void maxofarray(int[][] arr2)
		{
			int maxEle=1;
			for(int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr2[i].length;j++)
				{
					if(arr2[i][j]>maxEle)
					{
						maxEle=arr2[i][j];
					}
				}
			}
			
			System.out.println("Maximum element of given matrix is :\n" + maxEle);
			
		}
		
//----------------------------------------------------------------------------------------	

		
		public static void maxofrowwise(int[][] arr2)
		{
			
			for(int i=0;i<arr2.length;i++)
			{
				int maxElerow=arr2[i][0];
				
				for(int j=0;j<arr2[i].length;j++)
				{
					if(arr2[i][j]>maxElerow)
					{
						maxElerow=arr2[i][j];
					}
				}
				
				System.out.println("Maximum element of row " + (i+1) +" : "+ maxElerow);
			}
			
			
		}

//----------------------------------------------------------------------------------------		
		
		public static void maxofcolwise(int[][] arr2)
		{
			for(int i=0;i<arr2.length;i++)
			{
				int maxElecol=arr2[0][i];
				
				for(int j=0;j<arr2[i].length;j++)
				{
	
					
					if(arr2[j][i]>maxElecol)
					{
						maxElecol=arr2[j][i];
					}
				}
				
				System.out.println("Maximum element of column "+(i+1)+" : " + maxElecol);
			}
			
			
		
		}

}
	
