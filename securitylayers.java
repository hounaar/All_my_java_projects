package programin.desktop.java.koligari;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
public class securitylayers{
    public static String Appname = "SQL Mail";
    public static String Appversion = "0.0.3";
    public static String AppAuthor = "Jeffrey Cob";
    public static String AppDate = "August 8th,2007";
    public static String AppPath = System.getProperty("user.dir");
    public static String AppDriver = "asallsql.database.SSDriver";
    public static String AppDBMangaer = "jdbc:saallsql:";
    public static String AppDBPath = AppPath + "/sqlmail/";
    public static String AppPreferences = AppPath + "sqlmail_prefs";
    public securitylayers(){}
    public static void main(String[] args) throws Exception {
        boolean bDBConnect = false;
        int result =0; 
        for(int i=0;i<=999999999;i++){
        securitylayers SQLMainForm = new securitylayers();
        System.out.println("\t\n" + Appname + "\r\nVersion" + Appversion + "\r\n Author: " + AppAuthor + "\r\n date" + AppDate + "\r\nPath" + AppPath +"\r\ndriver" + AppDriver +
         "\r\nDBManager" + AppDBMangaer + "\r\nDBPath" + AppDBPath + "\r\npreference" + AppPreferences);
         Toolkit tk = Toolkit.getDefaultToolkit();
         Dimension screen = tk.getScreenSize();
         System.out.println(screen.getWidth() + "..." + screen.getHeight());
        }
    }
}