class RemoveDuplicate{
	public static void main(String[] args)
	{
		int[] arr={1,1,1,3,5,3,1,6,6,5};
		int[] temp=new int[arr.length];
		int size=arr.length;
		int count=1;
		for(int i=0;i<size;i++)
		{
		  temp[i]=arr[i];
		   
		}
		for(int i=0;i<size;i++)
		{	
	        for(int j=count;j<size;j++)
			{
			  if(temp[i]==arr[j])
			  {
				arr[j]=0;
				//System.out.print(temp[i]);
			  }
			}
			count++;
		}
		//System.out.println();
		
		for(int k=0;k<size;k++)
		{
			if(arr[k]!=0)
			{
				System.out.print(arr[k]+" ");
			}
		}
	}
}