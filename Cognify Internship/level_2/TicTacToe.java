import java.util.Scanner;
public class TicTacToe{
    public static void main(String[] args){
        char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        Scanner sc=new Scanner(System.in);
        char player='X';
        for(int moves=0;moves<9;moves++){
            System.out.println("Player "+ player +" enter rows and cols(1-3):");
            int row=sc.nextInt()-1;
            int col=sc.nextInt()-1;
            if(board[row][col]==' '){
                board[row][col]=player;
                for(char[] r:board){
                    System.out.println(r);
                }
                if((board[row][0]==player && board[row][1]==player && board[row][2]==player)||
                (board[0][col]==player && board[1][col]==player && board[2][col]==player)||
                (board[0][0]==player && board[1][1]==player && board[2][2]==player)||
                (board[0][2]==player && board[1][1]==player && board[2][0]==player)){
                    System.out.println("player"+player+"wins!");
                    return;
                }
                player=(player=='X')?'O':'X';
            }
            else{
                System.out.println("Invalid move,Try again");
                moves--;
            }

        }
        System.out.println("It's a draw");
        sc.close();
    }
}

