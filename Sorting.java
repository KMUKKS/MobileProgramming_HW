import java.util.*;

public class Sorting {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
	     Scanner scan = new Scanner(System.in);

	    System.out.println("5���� ���� �Է��ϼ���");
	     
	     for(int i = 0; i < 5; i++)
	    {
	       arr[i] = scan.nextInt();
	    }

	    int temp = 0;

	    for(int i = 0 ; i < 5 ; i++)
	    {
	       for(int k = i ; k < 5 ; k++)
	       {
	            if(arr[i] < arr[k])
	         {
	            temp = arr[i];
	            arr[i] = arr[k];
	            arr[k] = temp;
	         }
	      }
	    }
	 
	    System.out.println("�����");
	    for(int i = 0 ; i < 5 ; i++)
	    {
	       System.out.println(arr[i]);
	     }
	}

}
