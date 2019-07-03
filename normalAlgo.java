          for(int i=0;i<rotateBy;i++)
	        {
	            temp[i]=array[i];
	        }
	        for(int i=0;i<array.length-rotateBy;i++)
	        {
	            array[i]=array[i]+rotateBy;
	        }
	        int n=0;
	        for(int i=array.length-rotateBy;i<array.length;i++)
	        {
	            array[i]=temp[n];
	            n++;
	        }
