import java.util.Scanner;


public class TestArray {

			public static void main(String[] args) {
				int[][] arr2=new int[3][3];
				int[][] arr=new int[3][3];
				Scanner sc=new Scanner(System.in);
				int choice=0;
				do {
				System.out.println("1. add data\n2. display data\n3. transpose of matrix\n4. rowwise sum\n5. columnwise sum\n6. add new data for matrix2\n7. matrix multiplication\n8..matrix addition\n9. find maximum of array\n10. find maximum row wise\n 11.find maximum of column wise \n12.exit");
		
				//System.out.println("9. find maximum row wise\n 10. find max columnwise\n11. exit\n choice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					ArrayService.addnewdata(arr2);
					break;
					
				case 2:
					ArrayService.displaydata(arr2);
					break;
					
				case 3:
					ArrayService.transposearray(arr2);
					break;
					
				case 4:
					ArrayService.rowsum(arr2);
					break;
					
				case 5:
					ArrayService.colsum(arr2);
					break;
					
				case 6:
					ArrayService.addnewdata2(arr);
					break;
					
				case 7:
					ArrayService.matrixmultiplication(arr2,arr);
					break;
					
				case 8:
					ArrayService.addmatrix(arr2,arr);
					break;
					
				case 9:
					ArrayService.maxofarray(arr2);
					break;
					
				case 10:
					ArrayService.maxofrowwise(arr2);
					break;
					
					
				case 11:
					ArrayService.maxofcolwise(arr2);
					break;
					
				case 12:
					
					//System.exit(0);
					sc.close();
					System.out.println("Thank you for visiting....");
					break;
				default:
					System.out.println("Wrong choice");
					break;
				}
				
				}while(choice!=12);
			}

		

	}


