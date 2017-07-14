/*
 *convert binary number to octal number. */
public class OctConvert{
public int convertBinaryToOctal(int binum){
			int decinum=0,octnum=0,temp,flag=1;
	
			try{
				//condition to check number is binary or not.
				if (binum>0){
					//to generate decimal number.
					while(binum >0){
						temp=binum%10;
						if(temp==0 ||temp==1){
							decinum = decinum +temp*flag ;
							flag=flag*2;
							binum=binum/10;
						}
						//throw an exception for decimal value.
						else{
							throw new Exception("this is decimal no");
						}
					}
					//to convert decimal into octal number.
					flag=1;
					while(decinum>0){
						temp=decinum%8;
						octnum=octnum+temp*flag;
						flag=flag*10;
						decinum=decinum/8;
					}
				}
				//throw an exception for negative value
				else{
					throw new Exception("this is negative no");
				}
			
			return octnum;
			} catch(Exception e){
				System.out.print(e);
				return-1;
			}
			}

}

