
public class PoemAnalyzer {
    
    private String[][] wordsArray;
    private int rows;
    private int cols;
    
    public PoemAnalyzer(int rows, int cols) {
        this.wordsArray = new String[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }
    
    public void setRow(int r, String[] strRow) {
        for (int w=0; w<strRow.length; w++) {
            wordsArray[r][w] = strRow[w];
        }
    }
    
    public String getWord(int r, int c) {
        return wordsArray[r][c];
    }
    
    public String findLongest() {
        String longest = "";
        for (int r=0; r<wordsArray.length; r++) {
            for (int c=0; c<wordsArray[0].length; c++) {
                if (wordsArray[r][c] != null && wordsArray[r][c].length() > longest.length()) {
                    longest = wordsArray[r][c];
                }
            }
        }
        return longest;
    }
    
    public boolean contains(String str) {
        for (int r=0; r<wordsArray.length; r++) {
            for (int c=0; c<wordsArray[0].length; c++) {
                if (wordsArray[r][c] != null && wordsArray[r][c].equals(str)) return true;
            }
        }
        return false;
    }
    
    public String toString() {
        String str = "";
        for (int r=0; r<wordsArray.length; r++) {
            for (int c=0; c<wordsArray[0].length; c++) {
                if (wordsArray[r][c] != null) {
                    if ( ! (wordsArray[r][c].equals(".") || wordsArray[r][c].equals(","))) str += " ";
                    str += wordsArray[r][c];
                }
            }
            str += "\n";
        }
        return str;
    }
    
}
