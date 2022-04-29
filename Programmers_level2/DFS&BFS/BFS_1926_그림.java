import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    static int N, M;
    static int[][] map, visit;
    static int cnt = 0;
    static int size = 0;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new int[N][M];
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();
        
        bw.write(cnt + "\n");
        bw.write(size + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static void bfs(){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j] == 0 || visit[i][j] == 1) continue;
                cnt++;                              //그림개수
                visit[i][j] = 1;                    //방문완료
                Queue<Integer> qy = new LinkedList<>();
                Queue<Integer> qx = new LinkedList<>();
                qy.add(i); qx.add(j);
                int tempSize = 0;
                while(qy.size()!=0){
                    tempSize++;
                    int tempY = qy.peek();
                    int tempX = qx.peek();
                    qy.remove(); qx.remove();
                    for(int k=0;k<4;k++){
                        int ny = tempY+dy[k];
                        int nx = tempX+dx[k];
                        if(ny<0 || nx<0 || ny>=N || nx>=M) continue;
                        if(visit[ny][nx] == 1 || map[ny][nx] == 0) continue;
                        visit[ny][nx] = 1;
                        qy.add(ny); qx.add(nx);
                    }
                }
                size = Math.max(size, tempSize);
            }
        }
    }
}
