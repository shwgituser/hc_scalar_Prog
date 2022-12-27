package humanCloundScalerProgram.assignments15_12_23;
// Used bubble sorting
//time complexity is O(n^2)
//space complexity is 4*7=28bytes , this much of space is allocated in memory
public class Assignment1 {
	
	
	public void inputArray(int arr[]) {
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
	}
	}
	public void displaySortedArray(int arr[]) {
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String args[]) {
	int arr[]= {10,70,2,80,9,67,15};
		int n=arr.length;
		Assignment1 obj1= new Assignment1();
		obj1.inputArray(arr);
	    obj1.displaySortedArray(arr);
	
	System.out.println(" ");
    System.out.println("Worst Time Complexity: "+n*n);	
    System.out.println("Best Time Complexity: "+n);	
    System.out.println("Average Time Complexity: "+(n*n)/2);	
}
}
