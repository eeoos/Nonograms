public class Nonograms {
	
	//정답 판
	static boolean[][] answer_board = new boolean[10][10];
	static int[][] initialBoard = new int[10][10];
    public static void main(String[] args) {
        System.out.println("hi");

		// 초기판 출력
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				System.out.print(initialBoard[i][j]+" ");
			}
			System.out.println();
		}

        //정답 판 칠하기 
        get_answer_color(answer_board);


        /*
        for(int i = 0; i<10; i++) {
        	for(int j = 0; j<10; j++) {
        		System.out.print(answer_board[i][j]+" ");
        	}
        	System.out.println();
        }
        */
    }
    
    
    
	private static void get_answer_color(boolean[][] board) {
		board[0][2] = true;
		board[0][3] = true;
		board[0][4] = true;
		board[0][5] = true;
		board[0][6] = true;
		board[0][7] = true;
		board[1][1] = true;
		board[1][9] = true;
		board[2][0] = true;
		board[2][3] = true;
		board[2][6] = true;
		board[2][9] = true;
		board[3][0] = true;
		board[3][9] = true;
		board[4][0] = true;
		board[4][9] = true;
		board[5][0] = true;
		board[5][2] = true;
		board[5][7] = true;
		board[5][9] = true;
		board[6][0] = true;
		board[6][3] = true;
		board[6][3] = true;
		board[6][4] = true;
		board[6][5] = true;
		board[6][6] = true;
		board[6][9] = true;
		board[7][0] = true;
		board[7][9] = true;
		board[8][1] = true;
		board[8][8] = true;
		board[9][2] = true;
		board[9][3] = true;
		board[9][4] = true;
		board[9][5] = true;
		board[9][6] = true;
		board[9][7] = true;
		
	}
}
