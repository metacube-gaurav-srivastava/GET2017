
public class FirstComeFirstServe {
	 int [][]FCFS( int arrival_time [], int job_size[] ) {
		 int k=0,start_time=1,wait_index,temp=0;
		 int len=arrival_time.length;
		 int result_fcfs[][]=new int[len][5];
		 for(int i=0;i<len;i++){
			 result_fcfs[i][k++]=++temp;
			 result_fcfs[i][k++]=arrival_time[i];
			 if(i==0){
				 result_fcfs[i][k++]=start_time-arrival_time[0];
				 result_fcfs[i][k++]=start_time;
				 result_fcfs[i][k++]=job_size[i];
				 k=0;
			 }
			 else{
				 wait_index=k++;
				 //start
				 if( result_fcfs[i-1][4]<arrival_time[i]){
					 result_fcfs[i][k++]=arrival_time[i];
				 }
				 else{
					 result_fcfs[i][k++]= result_fcfs[i-1][4]+1;
				 }
				 //finish time
				 result_fcfs[i][k++]= (result_fcfs[i][3]+job_size[i])-1;
				 
				 //wait time
				 result_fcfs[i][wait_index]= result_fcfs[i][3]-arrival_time[i];
				 k=0;
			 }
		 }
		 return result_fcfs;
	 }
	

}
