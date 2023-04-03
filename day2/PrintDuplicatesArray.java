package week1.day2;

public class PrintDuplicatesArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("Length of the array:"+arr.length);
		//int count;
		for(int i=0;i<arr.length-1;i++)
		{
			//count = 0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicates in array");
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
