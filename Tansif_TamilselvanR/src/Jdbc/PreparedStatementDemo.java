package Jdbc;
import java.sql.*;

public class PreparedStatementDemo {

	    public static void main(String[] args) {

	        String url = "jdbc:postgresql://localhost:5432/Student_portal";
	        String username = "postgres";
	        String password = "Tamil@2005";

	        String query = "INSERT INTO student_details (first_name, last_name, age, dob, department, email) VALUES (?, ?, ?, ?, ?, ?)";

	        try {
	            // Load PostgreSQL driver
	            Class.forName("org.postgresql.Driver");

	            // Establish connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            // Create PreparedStatement
	            PreparedStatement st = con.prepareStatement(query);

	            // ---------- 1st row ----------
	            st.setString(1, "joe");
	            st.setString(2, "K");
	            st.setInt(3, 21);
	            st.setDate(4, Date.valueOf("2004-06-15"));
	            st.setString(5, "IT");
	            st.setString(6, "joe@example.com");
	            st.addBatch(); // ✅ add first row to batch

	            // ---------- 2nd row ----------
	            st.setString(1, "veer");
	            st.setString(2, "R");
	            st.setInt(3, 22);
	            st.setDate(4, Date.valueOf("2003-04-10"));
	            st.setString(5, "CSE");
	            st.setString(6, "veer@example.com");
	            st.addBatch(); // ✅ add second row to batch

	            st.setString(1, "raju");
	            st.setString(2, "K");
	            st.setInt(3, 21);
	            st.setDate(4, Date.valueOf("2004-06-15"));
	            st.setString(5, "IT");
	            st.setString(6, "raju224@example.com");
	            st.addBatch(); // ✅ add first row to batch
	            // Execute both insertions at once
	            int[] results = st.executeBatch();
	            System.out.println(results.length + " rows inserted successfully!");

	            // Close resources
	            st.close();
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

