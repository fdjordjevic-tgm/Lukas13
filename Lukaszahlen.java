
public class Lukaszahlen {
	static int[] arr1;
	static int[] arr2;
	public static int lucas(int l) {
		if(l<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(l==0) return 2;
	    if(l==1) return 1;
	    return lucas(l-1) + lucas(l-2);
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(2));
	}
	public static int fibonacci(int f){
		if(f<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		arr1=new int[f];
		arr1[f]=(f+1)+f;
		return fibonacci(f-1); 
	}
}
