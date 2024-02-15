package array;


public class DuplicateRemove {
	public static void main(String[] args) {
	    int[] arr = {1,2,2,0,1,0,0,6,7,4,5,5};
	    String[] starr = new String[arr.length];
	    int tempLength = 0;
	    for(int i=0;i<arr.length;i++){
	        Boolean exist = null;
	        String arrs = String.valueOf(arr[i]);
	       for(int j=0;j<starr.length;j++){
	           if(i==0 && j==0){
	               starr[tempLength] = arrs;
	               tempLength++;
	               exist=true;
	               break;
	           }
	           else if (starr[j]==null){
	               break;
	           }
	           else if(arrs.equalsIgnoreCase(starr[j])){
	               exist = true;
	               }
	       }
	       if(exist==null || !exist){
	           starr[tempLength] = arrs;
	           tempLength++;
	       }
	       }
	    int[] num = new int[tempLength];
	    int n = 0;
	    for(int s=0;s< starr.length;s++){
	        if(starr[s]!=null){
	         num[n] = Integer.parseInt(starr[s]);
	         n++;
	        }
	    }
	    for(int k=0;k<num.length;k++){
	        System.out.println(num[k]);
	    }

	}
}
