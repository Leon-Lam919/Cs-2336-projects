import java.io.*;
import java.util.*;

public class Matrix{
    // const of the row, col, and matrix
    private int M;
    private int N;
    private double[][] data;
    
    /*********************************************************
     * Function: Matrix()
     * Descr:    contructor for the Matrix, creating
     *           an empty matrix         
     *
     * Input:    int M, int N
     * Return:   ---
     * *******************************************************/

    public Matrix(int M, int N){
        this.M = M;
        this.N = N;
        this.data = new double[M][N];
    }

    /*********************************************************
     * Function: loadFromFile
     * Descr:    Reads file 
     *           
     *
     * Input:    String filename
     * Return:   ---
     * @throws FileNotFoundException
     * *******************************************************/


    public static Matrix loadFromFile(String filename) {
        // read in files name and create scanner for new file
        File readFile = new File(filename);
        Scanner read;

        // try block 
        try{
            read = new Scanner(readFile);
        // reads in row and col
        int M = read.nextInt();
        int N = read.nextInt();
        double data = 0;
        Matrix matrix = new Matrix(M, N);

        if(readFile.length() != 0){
            // for loop to display matrix
            for (int i = 0; i < M; i++){
                for (int j = 0; j < N; j++){
                    data = read.nextDouble();
                    matrix.addNumber(i, j, data);
                }
            }
        }
        else{
            System.out.println("Unable to open file");
        }
        
        // closes file
        read.close();

        return matrix;
    }
    // catch block
    catch(Exception e){
        System.out.println("Unable to open file");
    }
    return null;

    }

    // Rol count setter
    public void setRolCount(int size){
        this.M = size;
    }

    // Col count setter
    public void setColCount(int size){
        this.N = size;
    }

    // Row count getter
    public int getRowCount(){
        return this.M;
    }

    //Col count getter
    public int getColCount(){
        return this.N;
    }

    public double setEntry(int row, int col, double entry){
        
        data[row][col] = entry;
        return entry;
    }

    // method display
    public void display(){
        for( int i = 0; i < M; i++){
            System.out.print(" |");
            for(int j = 0; j < N; j++){
                System.out.printf("%7.2f", data[i][j]);
            }
            System.out.println(" | ");
        }
    }

        /*********************************************************
     * Function: getNorm()
     * Descr:    takes every value of the matrix and squares it,
     *           adds it up, then finds the square root of the
     *           sum, then returns that
     * Input:    ---
     * Return:   norm value
     * *******************************************************/
    public double getNorm(){
        double norm = 0;
        double temp = 0;
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                // square number
                norm = Math.pow(data[i][j], 2);
                // add altogether
                temp = norm + temp;
            }
        }
        // find sqrt
        temp = Math.sqrt(temp);
// good 
        System.out.print(temp);
        return temp;
    }

    /*********************************************************
     * Function: transpose()
     * Descr:    flips the cols and the rows
     *           
     *           
     * Input:    ---
     * Return:   new tranposed matrix
     * *******************************************************/
    public Matrix transpose(){
        double[][] transpose = new double[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                transpose[M][N] = data[N][M];
            }
        }
        
        return null;
    }

        /*********************************************************
     * Function: saveToFile()
     * Descr:    method that takes the transposed matrix and
     *           writes it to the file
     *
     * Input:    String filename
     * Return:   ---
     * *******************************************************/
    public void saveToFile(String filename){
        try {
            double five = 5.231321;
            FileOutputStream fos = new FileOutputStream(filename);
            PrintWriter outFS = new PrintWriter(fos);
            outFS.println("" + five);
            fos.close();
            outFS.close();
        } catch (IOException e) {
            System.out.print("Cannot write to file");
        }
    }

    // puts the numbers from file into the data matrix
    public void addNumber(int row, int col, double data){
        this.data[row][col] = data;
    }
    
    public static void main(String[] args){
        // cannot create new matrix obj to call methods
        
        // sacnner to read from user the file name
        Scanner scnr = new Scanner(System.in);
        // prompt user for file name
        System.out.print("Enter the file to load: ");
        String file = scnr.next();
        System.out.println();

        // File to read the data files
        Matrix matrix = loadFromFile(file);
        
        // load file into new matrix obj is complete with addNumber method, putting numbers from file to data

        // problem: cannot make a static ref to a non static method and display the matrix
        matrix.display();
                
        // completed:  calculate the norm of a matrix and displayed norm of the matrix
        System.out.print("The Frobenius Norm is " /* + norm */);
        matrix.getNorm();

        System.out.println();

        //prompt user for row #
        System.out.print("Enter the row: ");
        int R = scnr.nextInt();
        System.out.println();

        // prompt user for col #
        System.out.print("Enter the col: ");
        int C = scnr.nextInt();
        System.out.println();

        System.out.print("Enter the value: ");
        double value = scnr.nextDouble();
        System.out.println();

        matrix.setEntry(R, C, value);

        matrix.display();

        // TODO: write and display transpose matrix to file
        // completed:  tranpose matrix created

        // TODO: save transpose matrix to file
        String saveToFile = "A1.txt";
        matrix.saveToFile(saveToFile);

        // TODO: diplay untransposed matrix

        // TODO: end program

        scnr.close();
    }

}
