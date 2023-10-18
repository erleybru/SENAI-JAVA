package br.com.senaisp.erley.principal;

import java.sql.*;

public class SQLiteJDBC {

/*	public static void main(String[] args) {
		// Estabelece conexao com o banco de dados
		connectDB();
		createDB();
		insertDB();
		selectDB();
		// updateDB();
		// deleteDB();
	} // final do método main */

	// conecta banco de dados
	public static void connectDB() {
		Connection c = null;

		try {
			// Class.forName("org.xerial.sqlite-jdbc");
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} // final do try/catch

		// se chegar aqui é porque deu certo a abertura do arquivo
		System.out.println("Conexao com o banco de dados teve sucesso");
	} // final do método connectDB

	// cria uma tabela dinamicamente
	public static void createDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "CREATE TABLE web_blog " + "(ID INTEGER PRIMARY KEY autoincrement,"
					+ " NAME           CHAR(50)    NOT NULL, " + " message        TEXT     NOT NULL, "
					+ " date_added     datetime)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} // final do try/catch

		System.out.println("Table created successfully");
	} // final do método createDB

	public static void insertDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO web_blog (NAME,message,date_added) "
					+ "VALUES ('Ken', 'Hello every one!!!', datetime())," + " ('Jim', 'whats up!!!',datetime());";
			stmt.executeUpdate(sql);
			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	} // final do método insertDB

	public static void selectDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM web_blog;");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String message = rs.getString("message");
				String date_added = rs.getString("date_added");
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Message : " + message);
				System.out.println("Date Added : " + date_added);
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	} // final do método selectDB

	public static void updateDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "UPDATE web_blog set message = 'This is updated by updateDB()' where ID=1;";
			stmt.executeUpdate(sql);
			c.commit();

			ResultSet rs = stmt.executeQuery("SELECT * FROM web_blog;");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String message = rs.getString("message");
				String date_added = rs.getString("date_added");
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Message : " + message);
				System.out.println("Date Added : " + date_added);
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	} // final do método selectDB

	public static void deleteDB() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.BDCadastro");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "DELETE from web_blog where ID=1;";
			stmt.executeUpdate(sql);
			c.commit();

			ResultSet rs = stmt.executeQuery("SELECT * FROM web_blog;");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String message = rs.getString("message");
				String date_added = rs.getString("date_added");
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Message : " + message);
				System.out.println("Date Added : " + date_added);
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	} // final do método deleteDB

} // final da classe
