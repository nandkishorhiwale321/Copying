package Deep;

public class Fourth {

	public static void main(String[] args) {
	
		int arr []= {12,45,2,30,12,20,88};
		
		int sum=0;
		for(int i=0; i<arr.length;i=i+2) {
		sum+=arr[i];	
		}
		System.out.println(sum);
	}

}
