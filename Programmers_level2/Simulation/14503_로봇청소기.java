import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[][] map;
    public static int cnt = 0;
    public static int[] dy = {-1, 0, 1, 0}; // 북,동,남,서
    public static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(y, x, d);

        bw.write(cnt + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static void solve(int y, int x, int d){
        if(map[y][x] == 0){
            map[y][x] = 2;
            cnt++;
        }
            
        boolean flag = false;
        int original = d;
        for(int i=0;i<4;i++){        // 4방향 모두 확인
            int nd = (d+3)%4;
            int ny = y + dy[nd];
            int nx = x + dx[nd];
            
            if(0<ny && ny<N && 0<nx && nx<M){
                if(map[ny][nx] == 0){
                    solve(ny,nx,nd);
                    flag = true;
                    break;
                }
            }
            d = (d+3)%4;
        }
            
        if(!flag){                             //4방향 모두 없는 경우
            int ny = y+dy[(original+2)%4];     //뒤쪽이 벽인지 확인
            int nx = x+dx[(original+2)%4];
            if(0<ny && ny<N && 0<nx && nx<M){
                if(map[ny][nx] != 1){
                    solve(ny,nx,original);     //바라보는 방향 유지하면서 후진
                }
            }
        }        
    }
}
