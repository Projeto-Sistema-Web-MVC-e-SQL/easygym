package com.grupo6.easygym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/trab2fdb?serverTimezone=UTC", "root", "");
		} catch (SQLException e) {
			System.out.println("-----------> " + e.getMessage());
			return null;
		}
	}
}
