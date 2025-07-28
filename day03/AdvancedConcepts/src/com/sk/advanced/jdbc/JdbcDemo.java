package com.sk.advanced.jdbc;

import java.sql.*;

public class JdbcDemo {

    final private static String url = "jdbc:postgresql://localhost:5432/inventory_db";
    final private static String username = "postgres";
    final private static String password = "tiger";

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            DELETE OPERATION
//            String query = String.format("DELETE FROM products WHERE id = %d", 3);

//            USING PREPARED STATEMENT
//            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
//            preparedStatement.setInt(1, 2);
//            int rowsAffected = preparedStatement.executeUpdate();
//            if(rowsAffected > 0 ){
//                System.out.println("Deleted record successfully.");
//            }else{
//                System.out.println("Unable to delete the record.");
//            }

//            UPDATE OPERATION
//            String query = String.format("UPDATE products SET price=%d WHERE id=%d", 89, 1);
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0 ){
//                System.out.println("Updated record successfully.");
//            }else{
//                System.out.println("Unable to update the record.");
//            }

//            CREATE OPERATION
//            String query = String.format("INSERT INTO products(title, price, quantity) VALUES ('%s', %d, %d)", "Pen", 19, 100);
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0 ){
//                System.out.println("Inserted record successfully.");
//            }else{
//                System.out.println("Unable to insert the record.");
//            }

//            READ OPERATION
//            String query = "SELECT * FROM products";
//            ResultSet resultSet = statement.executeQuery(query);
//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String title = resultSet.getString("title");
//                int price = resultSet.getInt("price");
//                int quantity = resultSet.getInt("quantity");
//                System.out.println(id + " " + title + " " + price + " " + quantity );
//            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
