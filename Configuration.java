package dbconn;

/**
 * Created by user on 30.05.2017.
 */
public class Configuration {

    public String DB_USER_NAME ;

    public String DB_PASSWORD ;

    public String DB_URL;

    public String DB_DRIVER;

    public Integer DB_MAX_CONNECTIONS;

    public Configuration(){
        init();
    }

    private static Configuration configuration = new Configuration();

    public static Configuration getInstance(){
        return configuration;
    }

    private void init() {
        DB_USER_NAME = "slav";
        DB_PASSWORD = "111";
        DB_URL = "jdbc:mysql://176.114.4.120:3306/zam?autoReconnect=true";
        DB_DRIVER = "com.mysql.jdbc.Driver";
        DB_MAX_CONNECTIONS = 5;
    }
}
