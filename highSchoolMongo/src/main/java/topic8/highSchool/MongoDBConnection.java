package topic8.highSchool;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;


public class MongoDBConnection {
	private MongoClient mongoClient;
	private DB db;

	public MongoDBConnection(String host, int port, String database) {
		try {
			this.mongoClient = new MongoClient("localhost", 27017);
			this.setDb(mongoClient.getDB(database));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public DB getDb() {
		return db;
	}

	public void setDb(DB db) {
		this.db = db;
	}
}
