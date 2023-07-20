package patikaOdev;

import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private int[][] mines;
    private int rows;
    private int cols;
    private int remainingCells;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
        this.mines = new int[rows][cols];
        this.remainingCells = rows * cols;

        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = -1; // -1 represents unopened cell
            }
        }
    }

    private void placeMines() {
        int numMines = (rows * cols) / 4; // A quarter of total cells will have mines

        for (int i = 0; i < numMines; i++) {
            int randRow, randCol;
            do {
                randRow = (int) (Math.random() * rows);
                randCol = (int) (Math.random() * cols);
            } while (mines[randRow][randCol] == 1); // Ensure that there is no mine in the same position

            mines[randRow][randCol] = 1;
        }
    }

    private void displayBoard() {
        System.out.println("Mayın Tarlası:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == -1) {
                    System.out.print("# "); // Unopened cell
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i, j) && mines[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (remainingCells > 0) {
            displayBoard();

            System.out.print("Satır seçin (0-" + (rows - 1) + "): ");
            int selectedRow = scanner.nextInt();
            System.out.print("Sütun seçin (0-" + (cols - 1) + "): ");
            int selectedCol = scanner.nextInt();

            if (!isValidCell(selectedRow, selectedCol) || board[selectedRow][selectedCol] != -1) {
                System.out.println("Geçersiz seçim. Tekrar seçin.");
                continue;
            }

            if (mines[selectedRow][selectedCol] == 1) {
                System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                displayBoard();
                break;
            } else {
                int adjacentMines = countAdjacentMines(selectedRow, selectedCol);
                board[selectedRow][selectedCol] = adjacentMines;
                remainingCells--;

                if (adjacentMines == 0) {
                    // If selected cell is empty, recursively open adjacent empty cells
                    openAdjacentEmptyCells(selectedRow, selectedCol);
                }

                if (remainingCells == (rows * cols) / 4) {
                    System.out.println("Tebrikler! Tüm mayınları temizlediniz. Oyunu kazandınız.");
                    displayBoard();
                    break;
                }
            }
        }

        scanner.close();
    }

    private void openAdjacentEmptyCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i, j) && board[i][j] == -1) {
                    int adjacentMines = countAdjacentMines(i, j);
                    board[i][j] = adjacentMines;
                    remainingCells--;

                    if (adjacentMines == 0) {
                        // If adjacent cell is empty, recursively open its adjacent empty cells
                        openAdjacentEmptyCells(i, j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın Tarlası boyutu (satır, sütun): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.close();

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}

