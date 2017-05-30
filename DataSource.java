package dbconn;

import com.mysql.jdbc.Connection;

import java.sql.SQLException;

public class DataSource {

    static JdbcConnectionPool pool = new JdbcConnectionPool();

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn = pool.getConnectionFromPool();
        return conn;
    }

    public static void returnConnection(Connection connection) {
        pool.returnConnectionToPool(connection);
    }
}

