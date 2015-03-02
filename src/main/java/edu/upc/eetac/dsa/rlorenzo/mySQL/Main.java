package edu.upc.eetac.dsa.rlorenzo.mySQL;



public class Main {
  public static void main(String[] args) throws Exception {
    MySQLAccess dao = new MySQLAccess();
    dao.readDataBase();
  }

} 