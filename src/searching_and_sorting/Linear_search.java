package searching_and_sorting;

public class Linear_search {
    public int LinearSearch(int[] arr,int k)
    {
    	int n=arr.length;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]==k)
    		{
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,7,86,4};
		Linear_search ls=new Linear_search();
		int index=ls.LinearSearch(arr,6);
		System.out.println(index);
	}

}
