import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				bw.append(i+"\n");
				n /= i;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
