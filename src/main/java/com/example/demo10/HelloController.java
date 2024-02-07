package com.example.demo10;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class HelloController
{
    @FXML
    private Label password,label;
    @FXML
    private TextField name;
    @FXML
    private Button button;
    @FXML
    private Button close;
    public void newPassword(ActionEvent E) throws IOException
    {

        Connection connection= null;
        PreparedStatement ps=null;
        try{
            if(name.getText().isEmpty())
            {
                password.setText(null);
                label.setText("*Username is required");
            }
            else {
                Password pass = new Password();
                String p=pass.pass;
                password.setText(p);
                label.setText(null);
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Gayu@2003");
                ps = connection.prepareStatement("INSERT INTO users (username,password) VALUES (?,?)");
                ps.setString(1, name.getText());
                ps.setString(2, p);
                ps.executeUpdate();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try{
                    connection.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try{
                    ps.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void close(ActionEvent event) throws IOException
    {
        System.exit(0);
    }
}