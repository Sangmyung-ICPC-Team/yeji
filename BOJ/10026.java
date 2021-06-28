import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static char map [][]; 
	static int N;
	static int arr1[][];
	static int arr2[][];
	static int result1=0;
	static int result2=0;
	static int pos[][]= {{0,-1},{0,1},{-1,0},{1,0}}; //»óÇÏÁÂ¿ì
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		map = new char[N][N];
		arr1 = new int[N][N];
		arr2 = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr1[i][j] == 0) {	
					result1++;
					DFS1(i, j, map[i][j], result1);
				}
				
				if(arr2[i][j] == 0) {	
					result2++;
					DFS2(i, j, map[i][j], result2);
				}
			}
		}
		
		bw.append(result1+" "+result2);
		bw.flush();bw.close();br.close();
	}
	
	
	static void DFS2(int y, int x, char color, int count) {
		arr2[y][x] = count;
		
		for(int i = 0; i < 4; i++) {
			int nX = x + pos[i][0];
			int nY = y + pos[i][1];
			
			if(nX < 0 || nX >= N || nY < 0 || nY >= N) {
				continue;
			}	
			
			if(arr2[nY][nX] != 0) { 
				continue;
			}
			
			char nextColor = map[nY][nX];
			if(nextColor == color) {
				DFS2(nY, nX, nextColor, count);
			}
			else {
				if((color == 'R' && nextColor == 'G') || (color == 'G' && nextColor == 'R')) {
					DFS2(nY, nX, nextColor, count);
				}
			}
		}
	}
	
	static void DFS1(int y, int x, char color, int count) {
		arr1[y][x] = count;
		
		for(int i = 0; i < 4; i++) {
			int nX = x + pos[i][0];
			int nY = y + pos[i][1];
			
			if(nX < 0 || nX >= N || nY < 0 || nY >= N) {
				continue;
			}
			
			if(arr1[nY][nX] != 0) { 
				continue;
			}
			
			if(map[nY][nX] == color) {
				DFS1(nY, nX, map[nY][nX], count);
			}
		}
	}

}
