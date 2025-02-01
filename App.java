package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMpper;
import in.sp.resoueces.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    { 
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        // ----------------INSERT OPERATION---------------
//        int std_rollno=103;
//    	String std_name="Sonu maurya";
//    	float std_marks=98.5f;
//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//         int count = jdbcTemplate.update(insert_sql_query,std_rollno,std_name,std_marks);
//         
//         if(count>0) {
//        	 System.out.println("insertion success");
//        	 
//         }
//         else {
//        	 System.out.println("insertion failed");
//         }
        
        //------------UPDATE OPERATION-----------------
       
//        float marks=99.5f;
//        int rollno = 102;
//        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
//        
//        int count = jdbcTemplate.update(update_sql_query,marks,rollno);
//        
//        if (count>0) {
//        	
//        	System.out.println("updation sucess");
//        }
//        else {
//        	System.out.println("updation failed");
//        }
        
        //---------DELETE OPERATION-----------
        
//        int rollno=102;
//        String delete_sql_quary = "DELETE FROM student WHERE std_roll=?";
//        int count = jdbcTemplate.update(delete_sql_quary,rollno);
//        
//        if(count>0) {
//        	
//        	System.out.println("Deletion success");
//        }
//        else {
//        	System.out.println("Deletion failed");
//        }
        
        //----------SELECT OPERATION-------------over all data can print in this method
//        String select_sql_query = "SELECT * FROM student";
//        List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMpper());
//        for(Student std : std_list) {
//        	
//        	System.out.println("Roll no :"+std.getRollno());
//        	System.out.println("Name :"+std.getName());
//        	System.out.println("Marks :"+std.getMarks());
//        	System.out.println("--------------------------");
//        }
        
        //-----------select operation-2-------- only one data get the database
        
        int rollno=101;
        String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
        List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMpper(),rollno);
        for(Student std : std_list) {
        	
        	System.out.println("Roll no :"+std.getRollno());
        	System.out.println("Name :"+std.getName());
        	System.out.println("Marks :"+std.getMarks());
        	System.out.println("--------------------------");
        }
        
    }
}
