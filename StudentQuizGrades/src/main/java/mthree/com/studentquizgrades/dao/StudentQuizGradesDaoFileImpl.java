/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades.dao;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import mthree.com.studentquizgrades.dto.Student;

/**
 *
 * @author ta
 */
public class StudentQuizGradesDaoFileImpl implements StudentQuizGradesDao{

    public static final String ROSTER_FILE = "roster1.txt";
    public static final String DELIMETER = "::";
    
    private Map<String, Student> students = new HashMap<>();
    private Map<String, ArrayList<Float>> quizStudents= new HashMap<>();
    
//    @Override
//    public Student addStudent(String studentId, Student student) {
//        Student prevStudent = students.put(studentId, student);
//        return prevStudent;
//    }    
//    @Override
//    public List<Student> getAllStudents() {
//        return new ArrayList<Student>(students.values());
//    }

//    @Override
//    public Student getStudent(String studentId) {
//        return students.get(studentId);
//    }

//    @Override
//    public Student removeStudent(String studentId) {
//       Student removeStudent=students.remove(studentId);
//       return removeStudent;
//    }
    private Student unmarshallStudent(String studentAsText){
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::Lovelace::Java-September1842
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
    
        String[] studentTokens = studentAsText.split(DELIMETER);
        // Given the pattern above, the student Id is in index 0 of the array.
        String studentId = studentTokens[0];
        
        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        Student studentFormFile = new Student(studentId);
        
        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.
        
        //Index 1- FirstName
        studentFormFile.setFirstName(studentTokens[1]);
        
        //Index 2 - LastName
        studentFormFile.setLastName(studentTokens[2]);
        
        //Index3- Cohort
        studentFormFile.setCohort(studentTokens[3]);
        
        float[] quiz = new float[5];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i]=Float.parseFloat(studentTokens[i+4]);    
        }
        studentFormFile.setQuiz(quiz);
        // We have now created a student! Return it!
        return studentFormFile;
    }
    private void loadRoster() throws StudentQuizGradesDaoException{
    
        Scanner scanner;
        
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
        
            throw new StudentQuizGradesDaoException("-_- Could not load roster data into memory.", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        // currentStudent holds the most recent student unmarshalled
        Student currentStudent;
        // Go through ROSTER_FILE line by line, decoding each line into a 
        // Student object by calling the unmarshallStudent method.
        // Process while we have more lines in the file
        while(scanner.hasNext()){
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a Student
            currentStudent=unmarshallStudent(currentLine);
            // We are going to use the student id as the map key for our student object.
            // Put currentStudent into the map using student id as the key
            
            students.put(currentStudent.getStudentId(),currentStudent);
            
            ArrayList<Float> a1=new ArrayList<>();
            for (int i = 0; i < currentStudent.getQuiz().length; i++) {
                a1.add(currentStudent.getQuiz()[i]);
            }          
            quizStudents.put(currentStudent.getFirstName() + " " + currentStudent.getLastName(), a1);
        }
        // close scanner
        scanner.close();
    }
    
    public String marshallStudent(Student aStudent){
        // We need to turn a Student object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842

        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer. 

        // Start with the student id, since that's supposed to be first.
        
        String studentAsText =aStudent.getStudentId() + DELIMETER;
        studentAsText +=aStudent.getFirstName()+DELIMETER;
        studentAsText +=aStudent.getLastName()+DELIMETER;
        studentAsText +=aStudent.getCohort()+DELIMETER;
        float[] quiz= aStudent.getQuiz();
        for (int i = 0; i < quiz.length-1; i++) {
            studentAsText +=quiz[i]+DELIMETER;    
        }
        studentAsText +=quiz[quiz.length-1];
        // We have now turned a student to text! Return it!
        return studentAsText;
    }
    /**
 * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
 * for file format.
 * 
 * @throws StudentQuizGradesDaoException if an error occurs writing to the file
 */
    private void writeRoster() throws StudentQuizGradesDaoException{
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and 
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to 
        // handle any errors that occur.
    
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new StudentQuizGradesDaoException("Could not save student data.", e);
        }
        // Write out the Student objects to the roster file.
        // NOTE TO THE APPRENTICES: We could just grab the student map,
        // get the Collection of Students and iterate over them but we've
        // already created a method that gets a List of Students so
        // we'll reuse it.
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
            // turn a Student int a String
            studentAsText = marshallStudent(currentStudent);
            
            // write the Student object to the file
            out.println(studentAsText);
            //force PrintWriter to write Line to the file
            out.flush();
        }
        // clean up
        out.close();
    }
    
    @Override
    public Student addStudent(String studentID, Student student) throws StudentQuizGradesDaoException{
        loadRoster();
        Student newStudent = students.put(studentID, student);
        writeRoster();
        return newStudent;  
    }
    
    @Override
    public List<Student> getAllStudents() throws StudentQuizGradesDaoException{
        loadRoster();
        return new ArrayList<>(students.values());
    }
    @Override
    public Student getStudent(String studentId)throws StudentQuizGradesDaoException{
        loadRoster();
        return students.get(studentId);
    }
    @Override
    public ArrayList<Float> getStudentQuiz(String studentId)throws StudentQuizGradesDaoException{
        Student currentStudent= getStudent(studentId); 
        String studentName= currentStudent.getFirstName() + " " + currentStudent.getLastName();        
        return quizStudents.get(studentName);
    }
    
    @Override
    public Student removeStudent(String studentId) throws StudentQuizGradesDaoException{
        loadRoster();
        Student removedStudent= students.remove(studentId);
        writeRoster();
        return removedStudent;
    }
    

    @Override
    public HashMap<String, ArrayList<Float>> getAllStudentGrade()throws StudentQuizGradesDaoException{
        loadRoster();
        return new HashMap<>(quizStudents);
    }
    

    @Override
    public float averageStudentQuiz(String studentId)throws StudentQuizGradesDaoException{
            
    //    String studentId=student.getStudentId();
            ArrayList<Float> studentQuiz = getStudentQuiz(studentId);
            float sum=0;
           for(float i: studentQuiz){
               sum +=i;
           }
           return sum/studentQuiz.size();
    }
    
    @Override
    public float ClassQuizAverage(HashMap <String, ArrayList<Float>> studentQuiz)throws StudentQuizGradesDaoException{   
        float sumAvg=0; 
        for(HashMap.Entry i: studentQuiz.entrySet()){
            ArrayList<Float> arrQuiz=(ArrayList<Float>)i.getValue();
            float sum=0;
            for(float j:arrQuiz)
               sum +=j;
            sumAvg +=sum/arrQuiz.size();
        }   
        return sumAvg/studentQuiz.size();
   }
    
    @Override
    public float highestScore()throws StudentQuizGradesDaoException{
        HashMap<String, ArrayList<Float>> allStudentsGrades=getAllStudentGrade();
           float highest=0; 
           for(HashMap.Entry i: allStudentsGrades.entrySet()){
                ArrayList<Float> arrQuiz=(ArrayList<Float>)i.getValue();
                float sum=0;
                for(float j:arrQuiz)
                  sum +=j;
                if(sum/arrQuiz.size() > highest)
                    highest=sum/arrQuiz.size();
           }
           return highest;
    }
    @Override
    public float lowestScore()throws StudentQuizGradesDaoException{
        HashMap<String, ArrayList<Float>> allStudentsGrades=getAllStudentGrade();
           float lowest=Float.MAX_VALUE; 
           for(HashMap.Entry i: allStudentsGrades.entrySet()){
                ArrayList<Float> arrQuiz=(ArrayList<Float>)i.getValue();
                float sum=0;
                for(float j:arrQuiz)
                  sum +=j;
                if(sum/arrQuiz.size() < lowest)
                    lowest=sum/arrQuiz.size();
           }
           return lowest;
    }
    
}
