package util;

public class OracleQueries {
	
    public final static String GETSTUDENTBYEMAIL = "SELECT * FROM STUDENT "
            + "WHERE EMAIL = ?";
    
    public final static String GETSTUDENTBYPASS = "SELECT * FROM STUDENT "
            + "WHERE PASS = ?";
    
    public final static String GETAllINSTRUCTOR = "SELECT * FROM INSTRUCTOR";

    public final static String GETINSTRUCTORBYEMAIL = "SELECT * FROM INSTRUCTOR "
            + "WHERE EMAIL = ?";
    
    public final static String GETINSTRUCTORBYPASS = "SELECT * FROM INSTRUCTOR "
            + "WHERE PASS = ?";
    
    public final static String GETAllCOURSE = "SELECT * FROM COURSE";
    
    public final static String GETCOURSEBYINSTRUCTOR = "SELECT c.COURSE_ID, c.COURSE_NAME, c.MINIMUN_GPA FROM COURSE c "
    		+ "LEFT OUTER JOIN TEACHING t "
    		+ "ON c.COURSE_ID = t.COURSE_ID "
            + "WHERE INSTRUCTOR_ID = ?";
    
    public final static String ADDSTUDENTTOCOURSE = "INSERT INTO ATTENDING "
		    + "(COURSE_ID, STUDENT_ID)"
		    + "VALUES(?,?)";
    
    public final static String GETATTENDINGBYSTUDENT = "SELECT DISTINCT c.COURSE_NAME, i.FULL_NAME, i.EMAIL FROM ATTENDING a "
    		+ "INNER JOIN COURSE c "
    		+ "ON a.COURSE_ID = c.COURSE_ID "
    		+ "INNER JOIN TEACHING t "
    		+ "ON c.COURSE_ID = t.COURSE_ID "
    		+ "INNER JOIN INSTRUCTOR i "
    		+ "ON t.INSTRUCTOR_ID = i.INSTRUCTOR_ID "
            + "WHERE STUDENT_ID = ?";
    
    public final static String ADDINSTRUCTORTOCOURSE = "INSERT INTO TEACHING "
		    + "(COURSE_ID, INSTRUCTOR_ID)"
		    + "VALUES(?,?)";
    
    public final static String GETAllINSTRUCTORFROMTEACHING = "SELECT DISTINCT c.COURSE_NAME, c.MINIMUN_GPA, i.FULL_NAME, i.EMAIL FROM TEACHING t "
    		+ "LEFT OUTER JOIN COURSE c "
    		+ "ON t.COURSE_ID = C.COURSE_ID "
    		+ "LEFT OUTER JOIN INSTRUCTOR i "
    		+ "ON t.INSTRUCTOR_ID = i.INSTRUCTOR_ID";
        
}
