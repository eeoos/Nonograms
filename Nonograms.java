import java.util.*;
import java.io.*;

public class Nonograms {
	
	//정답 판
	static int[][] answer_board = new int[10][10];
	static int[][] initialBoard = new int[10][10];
    public static void main(String[] args) throws IOException {
        System.out.println("hi");

		// 초기판 출력
	
        //정답 판 칠하기 
        get_answer_color(answer_board);


        while(true) {
        	//1. 사용자 입력 받기 
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("0~9까지의 수 중 x, y좌표를 입력해주세요 \n");
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	//2. 초기판 색칠
        	initialBoard[x][y] = 1;
        	
        	//3. 색칠한 좌표가 정답인지 확인
        	if(validate(x, y,answer_board)) {
        		System.out.println("정답입니다");
        		//보드 출력
        		print(initialBoard);
        		
        	}else {
        		System.out.print("정답이 아닙니다");
        		initialBoard[x][y] = 0;
        		continue;
        	}
        	
        	//4. 정답판을 완성했는지 확인
        	if(isCorrect(initialBoard, answer_board)) {
        		System.out.print("완성하셨습니다!");
        		print(initialBoard);
        		break;
        	}
        	
        }
    }

	//4.
	private static boolean isCorrect(int[][] initialBoard, int[][] answer_board) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				if(initialBoard[i][j] != answer_board[i][j])return false;
			}
		}
		return true;
	}







	private static void print(int[][] initialBoard) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				System.out.print(initialBoard[i][j]+" ");
			}
			System.out.println();
		}

	}






	//3.
	private static boolean validate(int x, int y, int[][] answer_board) {
		if(answer_board[x][y] == 1) {
			return true;
		}
		else return false;
	}
    
    
   


	private static void get_answer_color(int[][] board) {
		board[0][2] = 1;
		board[0][3] =  1;
		board[0][4] =  1;
		board[0][5] =  1;
		board[0][6] =  1;
		board[0][7] =  1;
		board[1][1] =  1;
		board[1][9] =  1;
		board[2][0] =  1;
		board[2][3] =  1;
		board[2][6] =  1;
		board[2][9] =  1;
		board[3][0] =  1;
		board[3][9] =  1;
		board[4][0] = 1;
		board[4][9] = 1;
		board[5][0] = 1;
		board[5][2] = 1;
		board[5][7] = 1;
		board[5][9] = 1;
		board[6][0] = 1;
		board[6][3] = 1;
		board[6][3] = 1;
		board[6][4] = 1;
		board[6][5] = 1;
		board[6][6] = 1;
		board[6][9] = 1;
		board[7][0] = 1;
		board[7][9] = 1;
		board[8][1] = 1;
		board[8][8] = 1;
		board[9][2] = 1;
		board[9][3] = 1;
		board[9][4] = 1;
		board[9][5] = 1;
		board[9][6] = 1;
		board[9][7] = 1;
		
	}
}
