package Database;
import java.util.ArrayList;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;


public class User {
	DatastoreService datastore;
	public User(){
		datastore = DatastoreServiceFactory.getDatastoreService();
	}
	public boolean createUser(ArrayList<String> attributes){
		if (attributes.isEmpty()) return false;
		try{
		Entity User = new Entity("User",attributes.get(0));
		User.setProperty("passWord", attributes.get(1));
		datastore.put(User);
		System.out.println(attributes.get(0)+" was created");
		return true;
		}
		catch (Exception e){
			return false;
		}
	}
}	
