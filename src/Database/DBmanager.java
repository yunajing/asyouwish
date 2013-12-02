package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class DBmanager {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	public DBmanager(){
		
	}
	public void Action(String tableName,ArrayList<String> attributes){
		
		switch(tableName){
			case "User":
				User creator = new User();
				creator.createUser(attributes);
				break;
			case "Relation":
				//Relation creator = new Relation();
				//creator.createRelation(attributes);
				break;
			case "WishList":
				break;
			case "Items":
				break;
		}
	}
	public boolean checkAvailability(String tableName,String key) throws EntityNotFoundException{
		if (tableName=="User"){
			Key k = KeyFactory.createKey("User", key);
			try{
				Entity User = datastore.get(k);
				return true;
			}
			catch (EntityNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}
}
