import java.io.*;
public class FileOut {
    static final String filename="Names.txt";
    static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void write(String[]names) {
        try {
            PrintWriter outFile=new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            for(int i=0;i<5;i++) {
                outFile.println(names[i]);
            }
            System.out.println("Created file - Directory: C:\\Users\\STEPHEN GEORGE\\IdeaProjects\\grade 11");
            outFile.close();
        }catch(IOException e) {
            System.err.println(e);
        }
    }
    public void read() {
        try {
            FileReader inFile=new FileReader(filename);
            BufferedReader br=new BufferedReader(inFile);
            System.out.println("Names of students:");
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
            inFile.close();
        }catch(IOException e) {
            System.err.println(e);
        }
    }
    public void append(String appendString) {
        try {
            FileWriter outFile=new FileWriter(filename,true);
            BufferedWriter bw=new BufferedWriter(outFile);
            bw.newLine();
            bw.write(appendString);
            bw.close();
            outFile.close();
            System.out.println("\nString appended to file successfully.");
        }catch(IOException e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        FileOut obj=new FileOut();
        try {
            String[] names=new String[5];
            System.out.println("Enter 5 names: ");
            for(int i=0;i<5;i++)
                names[i]=br.readLine();
            obj.write(names);
            System.out.println();
            System.out.println("Reading file... ");
            obj.read();
            System.out.println();
            System.out.println("Enter a string to append: ");
            String appendString=br.readLine();
            obj.append(appendString);
        }catch(IOException e) {
            System.err.println(e);
        }
    }
}
