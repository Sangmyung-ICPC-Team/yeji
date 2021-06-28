import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
static int N;

	public static void main(String[] args) throws Exception{
		N=Integer.parseInt(br.readLine());
		
		f("");
		bw.close();br.close();
	}
	
	public static void f(String result) throws Exception{
		if(result.length()==N) {
			bw.append(result);
			bw.flush();
			System.exit(0);
			return;
		}
		
		for(int i=1;i<=3;i++) {
			if(check(result+i)) {
				f(result+i);
			}
		}
	}
	
	public static boolean check(String result)  throws Exception{
		int l=result.length();
		for(int i=1;i<=l/2;i++) {
			String str1= result.substring(result.length()-i-i, result.length()-i);
			String str2= result.substring(result.length()-i, result.length());
			if(str1.equals(str2)) return false;
		}
		return true;
		  
	}

}
