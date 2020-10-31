import java.util.Scanner;
class CRC
{
	public static void main(String args[])
	{
		int m,n,tbits,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of data");
		m=sc.nextInt();
		int msg[] = new int[m];
		System.out.println("Enter the binary values");
		for(i=0;i<m;i++)
		{
			msg[i]=sc.nextInt();
		}
		System.out.println("Enter the size of generator");
		n=sc.nextInt();
		int gen[] = new int[n];
		System.out.println("Enter the binary values");
		for(i=0;i<n;i++)
		{
			gen[i]=sc.nextInt();
		}
		
		System.out.println("The data bits are");
		for(i=0;i<m;i++)
		{
			System.out.print(msg[i]);
		}
		System.out.println();
		System.out.println("The generator bits are");
		for(i=0;i<n;i++)
		{
			System.out.print(gen[i]);
		}
		System.out.println();
		
		tbits=m+n-1;
		int apmsg[]=new int[tbits];	//append zeros
		int rem[]=new int[tbits];	//findind remainder 
		int tcode[]=new int[tbits];	//received data
		for(i=0;i<msg.length;i++)
		{
			apmsg[i]=msg[i];	//appended msg
		}
		System.out.println("The data after appending zeros");
		for(i=0;i<apmsg.length;i++)
		{
			System.out.print(apmsg[i]);
		}
		System.out.println();
		for(i=0;i<apmsg.length;i++)
		{
			rem[i]=apmsg[i];	//copy to remainder
		}
		rem = calCRC(apmsg,gen,rem);	//calculate the crc and store in remaider
                
                for(i=0;i<rem.length;i++)
                 { System.out.print(rem[i]); }
                System.out.println();

			
		for(i=0;i<rem.length;i++)
		{
			rem[i]=(apmsg[i]^rem[i]);
		}

		System.out.println("The crc code");
		for(i=0;i<rem.length;i++)
		{
			System.out.print(rem[i]);
		}
		System.out.println();

		//error detection

		System.out.println("Enter the recived crc code");
		for(i=0;i<tbits;i++)
		{
			tcode[i]=sc.nextInt();		//received data after transmitting
		}
		System.out.println("The recieved data is:");
		for(i=0;i<tbits;i++)
		{
			System.out.print(tcode[i]);		//received data after transmitting
		}
		System.out.println();
		for(i=0;i<tbits;i++)
		{
			rem[i]=tcode[i];	//copy to remainder
		}
		rem=calCRC(tcode,gen,rem);	//calculate crc
		for(i=0;i<rem.length;i++)
		{
			if(rem[i]!=0)		//if remainder is not zero error
			{
			System.out.println("Error");
			break;
			}
			if(i==rem.length-1)
			{
			System.out.println("Correct data");
			}
		}
	}
	
	static int[] calCRC(int apmsg[],int gen[],int rem[])
	{
		int i, c=0;
		while(true)
		{
			for(i=0;i<gen.length;i++)
			{
			rem[c+i]=(rem[c+i]^gen[i]);
			}
			while(rem[c]==0 && (c!=rem.length-1))
			{
			c++;
			}
			if((rem.length-c)<gen.length)
			break;	
		}
		return(rem);
	}
}
