import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int N;
	static int map[][];
	static boolean visited[][];
	static int result[];
	
	public static void main(String[] args) throws Exception{
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		map=new int[N+1][10];
		result=new int[N+1];
		visited=new boolean[N+2][10];
		
		
		for(int i=1;i<N+1;i++) {
			st=new StringTokenizer(br.readLine());
			int riceCake=Integer.parseInt(st.nextToken());
			for(int j=0;j<riceCake;j++) {
				map[i][Integer.parseInt(st.nextToken())]=1; 
			}
		}
		
		DFS(1, 0);
		
		bw.append("-1");
		bw.flush();bw.close();br.close();
		
	}
	
	public static void DFS(int day, int pre) throws Exception{
		if(day==N+1) {
			for(int i=1;i<N+1;i++) {
				bw.append(result[i]+"\n");
			}
			bw.flush();
			System.exit(0);
		}
		
		for(int i=1;i<10;i++) {
			if(map[day][i]==1 && !visited[day+1][i] && i!=pre) { 
				visited[day+1][i]=true;
				result[day]=i;
				DFS(day+1, i);
			}
		}
	}
	

}
