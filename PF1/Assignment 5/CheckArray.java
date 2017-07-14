
public class CheckArray {
	int checkSortedArray(int input[]){
		int count1=0,count2=0,temp;
		int len=input.length;
		for(int i=1;i<len;i++){
			temp=input[i]-input[i-1];
			if(temp>0){
				count1+=1;
			}
			else if(temp<0){
				count2+=1;
			}
			else{
				count1+=1;
				count2+=1;
			}
		}
		if(count1==len-1){
			return 1;
		}
		else if(count2==len-1){
			return 2;
		}
		else{
			return 0;
		}
	}
	
}
