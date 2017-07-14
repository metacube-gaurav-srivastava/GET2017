/*
 * merge two sorted array into a new 
 * sorted array.We have assumed here 
 * that resulting sorted array will be  
 * in ascending order.
 * */
public class MergeArray {
	int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int i=0,j=0,k=0;
		
		// to check if array has no value
		if(asize==0)
			return b;
		else if(bsize==0)
			return a;
		
		//to convert descending array into ascending array
		if(a[0]>a[1]){
			for(int q=0;q<(a.length/2);q++){
				int temp=a[q];
				a[q]=a[a.length-q-1];
				a[a.length-q-1]=temp;
				
			}
				
		}
		if(b[0]>b[1]){
			for(int q=0;q<(b.length/2);q++){
				int temp=b[q];
				b[q]=b[b.length-q-1];
				b[b.length-q-1]=temp;	
			}
			
		}
	 
		while(i<asize && j<bsize){
			// compare elements of array for sorting.
			if(a[i] < b[j]){
	            c[k] = a[i];
	            i++;
	        }
	        else{
	            c[k] = b[j];
	            j++;
	        }
	        k++;
		}
		//condition if array 'a' still has elements.
		 while(i < a.length){
		        c[k] = a[i];
		        i++;
		        k++;
		    }
		//condition if array 'a' still has elements.
		 while (j < b.length){
		        c[k] = b[j];
		        j++;
		        k++;
		    }
            return c;	
	}
	

}
