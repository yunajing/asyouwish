package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Relationship {
	String userA;
	String userB;
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	public void createRelaion(ArrayList<String> attr) {
		if(attr.isEmpty()) return;
		
		Entity relation = new Entity("Relationship",attr.get(0));
		userA = attr.get(0);
		userB = attr.get(1);
		datastore.put(relation);
	}
	
	

}
