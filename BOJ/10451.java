import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int N;
	static int arr[];
	static boolean visited[];
	static int result;
	
	public static void main(String[] args) throws Exception{
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			N=Integer.parseInt(br.readLine());
			arr=new int[N+1];
			visited=new boolean[N+1];
			result=0;
			
			st=new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			for(int i=1;i<=N;i++) {
				if(!visited[i]) {
					DFS(i);
					result++;
				}
			}
			
			bw.append(result+"\n");
		}
		
		bw.flush();bw.close();br.close();
		
		

	}
	
	public static void DFS(int num) {
		if(!visited[num]) {
			visited[num]=true;
			DFS(arr[num]);
		}
	}

}
