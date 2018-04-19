package edu.testproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karray
 */
public class DataSource {

	private static DataSource instance;
	String url = "jdbc:mysql://localhost:3306/base";
	String login = "root";
	String pwd = "root";
	Connection cnx;

	private DataSource() {
		try {
			cnx = DriverManager.getConnection(url, login, pwd);
			System.out.println("Connexion etablie!");
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
	}

	public Connection getConnection() {
		return cnx;
	}

	public static DataSource getInstance() {
		if (instance == null) {
			instance = new DataSource();
		}
		return instance;
	}

}
