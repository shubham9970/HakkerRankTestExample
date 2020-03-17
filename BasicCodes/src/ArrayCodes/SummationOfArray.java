package ArrayCodes;

public class SummationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3};
		int arr1[]=new int[arr.length];
		int pos=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//if(i!=j) {
					System.out.println((arr[i]*i)+(arr[j]*j));
					//arr1[pos]=(arr[i]*i)+(arr[j]*j);
					//pos++;
				//}
			}
		}
		//for(int i=0;i<arr1.length;i++) {
		//	System.out.println(arr1[i]);
		//}
	   
	}

}
