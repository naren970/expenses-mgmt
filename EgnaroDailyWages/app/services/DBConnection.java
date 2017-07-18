package services;

import com.github.jmkgreen.morphia.Datastore;
import com.github.jmkgreen.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import play.*;

public class DBConnection {

	
    //private static final Logger.ALogger logger = Logger.of(DBConnection.class);

	@SuppressWarnings("deprecation")
	public static Datastore getDBconnection(String serverIP,String dbName,  int port){
		Logger.trace("DB Details :", serverIP, dbName, port);
		Mongo mongo = new MongoClient(serverIP);
		Logger.info("Monog Object is intilized");
		Morphia morphia = new Morphia();
		Logger.info("Morphia Object is initilized");
		return morphia.createDatastore(mongo, dbName);
	}
}
