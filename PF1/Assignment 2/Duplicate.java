/*
 * remove duplicates from an array.*/
public class Duplicate {
	
		 int[] removeDuplicate(int input[]){
			 int len=input.length,k=0,i,l=1;
			 int [] output_array=new int [len+1];
			 
			 
			 for(i=0;i<len;i++){
				//condition to put first array value
				 if(k==0){
					output_array[k++]=input[i];
				}
				 
				 //condition to remove duplicate element.
				else{
					int j;
					for(j=0;j<k;j++){
						if(input[i]==output_array[j]){
							break;
						}
					}
					//condition to add value to output array
					if(j==k){
					 output_array[k++]=input[i];
					 output_array[k]='*';
					 l=l+1;
					}
				}
			     
			 }
			 
			 int [] final_array=new int [l];
			 for(i=0;i<l;i++){
				 final_array[i]=output_array[i];
			 }
			 
			 return final_array;
		 }
		

}
