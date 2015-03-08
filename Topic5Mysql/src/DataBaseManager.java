import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseManager {

	public String query;
	public Statement statement;

	public ResultSet doQuery(String query, DataBaseConnection dataBaseConnection) throws SQLException {

		ResultSet resultSet;
		statement = dataBaseConnection.getConecction().createStatement();
		resultSet = statement.executeQuery(query);

		return resultSet;

	}
}
