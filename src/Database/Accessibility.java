package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Accessibility {
	String userID;
	String wishID;
	String state;
	String visible;//this is the id of a user which can access to this list
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	public Accessibility(ArrayList<String> attr) {
		System.out.println("Creating A1");
		if(attr.isEmpty()) return;
		Entity access = new Entity("Accessibility", attr.get(0));
		System.out.println("Creating A2");
		userID = attr.get(0);
		wishID = attr.get(1);
		state = attr.get(2);
		datastore.put(access);
		System.out.println("Creating A3");
	}
	 
	public void setVisible(String visible){
		this.visible = visible;
	}
	
	public Accessibility getVisit(String uID){
		if(visible.equals(uID) && state.equals("private"))
			return this;
		else if (state.equals("public"))	
			return this;
		else{
			System.out.println("List is invisible");
			return null;
		}
	}
	
}
