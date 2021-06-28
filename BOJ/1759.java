import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static char pw[];
	static int L;
	static int C;
	static char arr[];
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception{
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		L=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		arr=new char[C];
		pw=new char[L];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<C;i++) {
			arr[i]=st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);
		
		DFS(0,0);
		bw.flush();bw.close();br.close();
	}
	
	public static void DFS(int index, int depth) throws Exception {
		if(depth==L) {
			if(check()) {
				for(int i=0;i<L;i++) {
					bw.append(pw[i]+"");
				}
				bw.append("\n");
			}
			return;
		}
		
		for(int i=index;i<C;i++) {
			pw[depth]=arr[i];
			DFS(i+1,depth+1);
		}
	}
	
	public static boolean check() {
		int vowel=0;
		int consonant=0;
		for(int i=0;i<L;i++) {
			if(pw[i]=='a'||pw[i]=='e'||pw[i]=='i'||pw[i]=='o'||pw[i]=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		
		if(vowel>=1&&consonant>=2) {
			return true;
		}
		
		return false;
	}

}
