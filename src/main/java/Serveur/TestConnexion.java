package Serveur;

import utils.ConnexionToDb;
import java.sql.Connection;

public class TestConnexion {
    public static void main(String[] args) {
        Connection conn = ConnexionToDb.getConnection();
        if (conn != null) {
            System.out.println("Connexion établie !");
        } else {
            System.out.println("Échec de la connexion !");
        }
    }
}
