package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		//System.out.println(array1.length);
		//System.out.println(array2.length);
		for(int i=0;i<array1.length;i=i+1)
		{
			for(int j=0;j<array2.length;j=j+1)
			{
				if(array1[i]==array2[j])
				{
					System.out.println("Interaction:"+array1[i]);
				}
			}
		}
	}

}
