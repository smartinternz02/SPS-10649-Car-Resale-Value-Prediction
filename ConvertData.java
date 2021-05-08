import java.util.*;
import java.lang.*;
import java.io.*;
public class ConvertData {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("E:/oracleProject/test-data_b.csv"));
BufferedWriter bw = new BufferedWriter(new FileWriter("E:/oracleProject/test_data_b.csv"));
String line = "";
while ((line = br.readLine()) != null) {
String[] values = line.split(",", -1);
// make an array out of line
String writableString = "";
//initial string which will be the final output for the row
ArrayList al = new ArrayList();
// use array list because can edit array and modify size easily
for (String element : values) {
if (element==null || element.length()==0) {
al.add("0");
} else {
al.add(element);
}
}
for (Object s : al){ // add commas between each element of arraylist
writableString += s + ",";
}
writableString = writableString.substring(0, // remove last comma
writableString.length() - 1);
bw.write(writableString + "\n");

//writes the line and carriage return
}
br.close();
bw.close();
}
}