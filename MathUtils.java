
public class MathUtils {
	
	public static void main(String args[]) {
			System.out.println(rat2dec(114,205));
	}
	
	static String rat2dec(int a, int b) {
		
		String res = "";
		String right="";

		int left = a/b; res+=left; int rem = a%b;
		
		if(rem!=0) {
			
			boolean cycle = false; int seen[] = new int[b]; res+=".";
			
			int cnt = 1; seen[rem] = cnt;
			while(rem!=0) {
				
				cnt++; int d = (rem*10)/b; rem = (rem*10)%b; right+=d;
				
				if(seen[rem] != 0) {
					cycle = true; break;
				}
				else
					seen[rem] = cnt;
				
			}
			if(cycle) {
				int p = right.length() - (cnt - seen[rem]);	
				right = right.substring(0,p) + "(" + right.substring(p) + ")";	
			}
		}
		res += right;
		return res;
	}
}
