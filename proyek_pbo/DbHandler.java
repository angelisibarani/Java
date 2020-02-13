/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import proyek_pbo.*;

/**
 *
 * @author kylex
 */
public class DbHandler {
	private Connection connection;
	private boolean connected;
        public int counter;
        
        
	public DbHandler() {

		this.connected = false;
	}

	public boolean connect(String _host, String _dbName, String _username, String _password) {
		String connectionString = "jdbc:mariadb://" + _host + "/" + _dbName;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.connection = DriverManager.getConnection(connectionString, _username, _password);
			this.connected = true;
		} catch (Exception _e) {
			System.out.println("Exception: " + _e.getMessage());
			this.connected = false;
		}
		return (this.connected);
	}

	public void disconnect() {
		if (this.connected) {
			try {
				this.connection.close();
			} catch (Exception _e) {
				System.out.println("Exception: " + _e.getMessage());
			}
		}
		this.connected = false;
	}

	public boolean isConnected() {
		return (this.connected);
	}
        
        
        public void addAsrama(String _id ,String _nama, String _jumlahkamar , String _kapasitas , String _pembina ) {
		
		if (this.connected) {
			String query = "INSERT INTO asrama(ID, Nama_Asrama, Jumlah_Kamar, Kapasitas,Pembina_Asrama) VALUES(" + "" + _id
					+ "," + "'" + _nama + "',"+"" + _jumlahkamar + "," + "" + _kapasitas+ ","
					+ "'" + _pembina + "'" + ")";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        
        
        public List<Keasramaan> getallkemahas() {
                this.counter = 0;
		List<Keasramaan> buff = new ArrayList<Keasramaan>();
                Keasramaan buf2 = null;
		if (this.connected) {
			String query = "SELECT Nama,NIK,NO_HP,Jenis_Kelamin FROM db_asrama.keasramaan";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Keasramaan(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}

	
        
        public void addKeasramaan(String _nama, String _nik, String _hp , String _sex  ) {
		
		if (this.connected) {
			String query = "INSERT INTO keasramaan(Nama, NIK, NO_HP,Jenis_Kelamin) VALUES(" + "'" + _nama
					+ "'," + "'" + _nik + "',"+"'" + _hp + "'," + "'" + _sex + "'"
					+  ")";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        
        public List<Asrama> getallasrama() {
                this.counter = 0;
		List<Asrama> buff = new ArrayList<Asrama>();
                Asrama buf2 = null;
		if (this.connected) {
			String query = "SELECT ID,Nama_Asrama,Jumlah_Kamar,Pembina_Asrama,Kapasitas FROM db_asrama.asrama";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Asrama(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}
        
        
        public List<Mahasiswa> getallmahas() {
                this.counter = 0;
		List<Mahasiswa> buff = new ArrayList<Mahasiswa>();
                Mahasiswa buf2 = null;
		if (this.connected) {
			String query = "SELECT NIM,Nama,Jenis_Kelamin,Prodi,Angkatan FROM db_asrama.mahasiswa";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Mahasiswa(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}
        
	
        public void addMahas(String _nim ,String _nama, String _sex , String _prodi , String _angk ) {
		
		if (this.connected) {
			String query = "INSERT INTO mahasiswa(NIM, Nama, Jenis_Kelamin, Prodi,Angkatan) VALUES(" + "'" + _nim
					+ "'," + "'" + _nama + "',"+"'" + _sex + "'," + "'" + _prodi+ "',"
					+ "'" + _angk + "'" + ")";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        
        public Mahasiswa getmahasbynim(String _nim) {
                this.counter = 0;
		Mahasiswa buff = null;
                
		if (this.connected) {
			String query = "SELECT NIM,Nama,Jenis_Kelamin,Prodi,Angkatan FROM db_asrama.mahasiswa WHERE NIM ='"+_nim+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				if (resultSet.next()) {
					buff = new Mahasiswa(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                  	counter++;
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}
        
        public Mahasiswa getmahasbynama(String _nama) {
                this.counter = 0;
		Mahasiswa buff = null;
                
		if (this.connected) {
			String query = "SELECT NIM,Nama,Jenis_Kelamin,Prodi,Angkatan FROM db_asrama.mahasiswa WHERE Nama ='"+_nama+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				if (resultSet.next()) {
					buff = new Mahasiswa(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                  	counter++;
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}
        
        
        public List<Alokasi> getallalloc() {
                this.counter = 0;
		List<Alokasi> buff = new ArrayList<Alokasi>();
                Alokasi buf2 = null;
		if (this.connected) {
			String query = "SELECT ID_Asrama,ID_Kamar,NIM,Nama_Mahasiswa,Nama_Asrama FROM db_asrama.alokasi";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Alokasi(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
	}
        
        
        public void addalloc(String _id_a ,String _id_k, String _nim , String _nama_m , String _nama_a ) {
		
		if (this.connected) {
			String query = "INSERT INTO alokasi(ID_Asrama, ID_Kamar, NIM, Nama_Mahasiswa,Nama_Asrama) VALUES(" + "" + _id_a
					+ "," + "" + _id_k + ","+"'" + _nim + "'," + "'" + _nama_m+ "',"
					+ "'" + _nama_a + "'" + ")";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        public Alokasi getallocbynim(String _nim) {
                this.counter = 0;
		
                Alokasi buf2 = null;
		if (this.connected) {
			String query = "SELECT ID_Asrama,ID_Kamar,NIM,Nama_Mahasiswa,Nama_Asrama FROM db_asrama.alokasi WHERE NIM ='" + _nim+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				if(resultSet.next()) {
					buf2 = new Alokasi(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                        counter++;
                                  
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buf2;
	}
        
        
        public Asrama getasramabynama(String _nama) {
                this.counter = 0;
		
                Asrama buf2 = null;
		if (this.connected) {
			String query = "SELECT ID,Nama_Asrama,Jumlah_Kamar,Pembina_Asrama,Kapasitas FROM db_asrama.asrama WHERE Nama_Asrama ='" + _nama+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				if (resultSet.next()) {
					buf2 = new Asrama(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                                        
                                        counter++;
                                   
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buf2;
	}
        
        
        public void delmahas(String _nim) {
                
		if (this.connected) {
			String query = "DELETE FROM db_asrama.mahasiswa WHERE NIM ='"+_nim+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeQuery(query);
                            
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        public void delalloc(String _nim) {
                
		if (this.connected) {
			String query = "DELETE FROM db_asrama.alokasi WHERE NIM ='"+_nim+"'";
                        
			try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeQuery(query);
                            
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        public void delasrm(String _nim) {
                
		if (this.connected) {
			String query = "DELETE FROM db_asrama.asrama WHERE ID ='"+_nim+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeQuery(query);
                            
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        
        public void delpembina(String _nim) {
                
		if (this.connected) {
			String query = "DELETE FROM db_asrama.keasramaan WHERE NIK ='"+_nim+"'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeQuery(query);
                            
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
        
        
	}

