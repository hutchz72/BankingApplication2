package FinalExam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exam4 {
    public static void main(String[] args) {
        Student S1 = new Student("64130500999", "SuSu KubNong", 99.99);
        Student S2 = new Student("64130500888", "Sirena Miko", 88.88);
        Student S3 = new Student("64130500777", "Adam Warlock", 77.77);
            ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(new FileOutputStream("Exam5.dat"));
            output.writeObject(S1);
            output.writeObject(S2);
            output.writeObject(S3);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Exam4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
