
public class FindLargestArray {
	 static void  findLargestArray() {
			int arr[]= {10,90,20,80,60,100};
			int largest = 0;
			int secondLargest=0;
			int thirdLargest=0;
			for(int i=0;i<arr.length;i++) {
				if(largest<=arr[i]) {
					largest=arr[i];
				}
				
				else if(secondLargest<=arr[i]) {
					secondLargest=arr[i];
				}
				
			else if(thirdLargest<=arr[i]) {
				thirdLargest=arr[i];
			}
			
		}
			System.out.println("Largest array::"+largest);
			System.out.println("Second Largest array::"+secondLargest);
			
			System.out.println("Third Largest array::"+thirdLargest);
     }
	public static void main(String[] args) {
		FindLargestArray.findLargestArray();
	}

}
