package com.example.demo10;
public class Password
{
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Spec_char = "-*!&%$#";
    String num = "1234567890";
    String pass = " ";
    {
        for(int i=0;i<10;i++)
        {
            int rand = (int)(5*Math.random());
            switch(rand)
            {
                case 0:
                    pass += String.valueOf((int)(Math.random()));
                    break;

                case 1:
                    rand = (int)(lower_case.length()*Math.random());
                    pass += String.valueOf(lower_case.charAt(rand));
                    break;

                case 2:
                    rand = (int)(upper_case.length()*Math.random());
                    pass += String.valueOf(upper_case.charAt(rand));
                    break;

                case 3:
                    rand = (int)(Spec_char.length()*Math.random());
                    pass += String.valueOf(Spec_char.charAt(rand));
                    break;

                case 4:
                    rand = (int)(num.length()*Math.random());
                    pass += String.valueOf(num.charAt(rand));
                    break;

            }
        }
        System.out.println(pass);
    }
}
//package com.example.demo10;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Random;
//
//public class Password {
//
//    public static void main(String[] args) {
//        // Launch your JavaFX application
//        // Example: Application.launch(YourApplication.class, args);
//    }
//
//    // Method to generate a random password
//    public static String generateRandomPassword() {
//        String lower_case = "abcdefghijklmnopqrstuvwxyz";
//        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String special_chars = "-*!&%$#";
//        String digits = "1234567890";
//        String password = "";
//
//        String allChars = lower_case + upper_case + special_chars + digits;
//
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            int randIndex = rand.nextInt(allChars.length());
//            password += allChars.charAt(randIndex);
//        }
//        return password;
//    }
//
//    // Method to store username and password in the database
//    public static void storeInDatabase(String username, String password) {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//
//        try {
//            // Establish connection to MySQL database
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Gayu@2003");
//
//            // Prepare SQL statement for insertion
//            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, username);
//            preparedStatement.setString(2, password);
//
//            // Execute the SQL statement
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close resources in the finally block
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
