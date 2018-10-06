public class QuickSort implements SortingAlgorithm {

	public void sort(int[] arr, int left, int right){
		if(left<right){ 
			 int p = Partition(arr,left,right);
			 sort(arr,left,p-1);
			 sort(arr,p+1,right);
		}
	}
	public void sort(int[] arr){
		sort(arr, 0, arr.length-1);
	}
	public int Partition(int[] arr, int left, int right){
		int pivot = left;
		int i = left + 1;
		int k = right;
		while(i<k){
			while(i<right && arr[i]<arr[pivot]){
				++i;
			}
			while(k>i && arr[k]>arr[pivot]){
				--k;
			}
			if(i<k){
				swap(arr,i,k);
			}
		}
		swap(arr,pivot,k);
		return k;
	}
	public void swap(int[] arr, int a, int b){
		int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
	}
}