package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

public class DBmanager {
	public DBmanager(String tableName,ArrayList<String> attributes){
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		switch(tableName){
			case "User":
				User creator = new User(attributes);
				break;
			case "Relation":
				break;
			case "WishList":
				break;
			case "Items":
				break;
		}
	}
}
