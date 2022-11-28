import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TransactionRecord {
    int ac_no;
    double amount;

    public TransactionRecord(int ac_no, double amount) {
        this.ac_no = ac_no;
        this.amount = amount;
    }

    public int getAc_no() {
        return ac_no;
    }

    public void setAc_no(int ac_no) {
        this.ac_no = ac_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

class AccountRecord {
    TransactionRecord tr;
    double balance;

    double combine(TransactionRecord tr) {
        double combined_value = tr.getAmount() + balance;
        return combined_value;
    }
}


class FileMatch {
    String oldmast;
    String trans;

    public FileMatch(String oldmast, String trans) {
        this.oldmast = oldmast;
        this.trans = trans;
    }

    List<String[]> readFile(String filename) throws IOException {
        List<String[]> values = new ArrayList<>();
        File file = new File(filename);
        //BufferedReader br=new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(file);
        String st;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            values.add(line.split(","));
        }
        return values;
    }


    void fileMatch(String file1,String file2) throws IOException {
        List<String[]> file1cols;
        List<String[]> file2cols;

        file1cols=readFile(file1);
        file2cols=readFile(file2);

        //System.out.println(file1cols.get(0)[0]);


        for(int i=0;i< file1cols.size();i++){
            for(int j=0;j<file2cols.size();j++){
                if(file1cols.get(i)[0].equals(file2cols.get(j)[0])){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }

        }

    }}


public class Main {
    public static void main(String[] args) throws IOException {
       FileMatch fm=new FileMatch("oldmast.txt","trans.txt");
       fm.fileMatch("oldmast.txt","trans.txt");
    }
}