package Database;
import java.util.ArrayList;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;


public class User {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	public User(ArrayList<String> attributes){
		if (attributes.isEmpty()) return ;
		Entity User = new Entity("User",attributes.get(0));
		User.setProperty("userName", attributes.get(1));
		User.setProperty("passWord", attributes.get(2));
		datastore.put(User);
	}
}	
