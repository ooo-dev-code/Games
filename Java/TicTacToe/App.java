package java.ticTacToe;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        int boardWidth = 360;
        int boardHeight = 640; 

        JFrame frame = new JFrame("TICTACTOE");
        frame.setSize(boardWidth, boardHeight);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
