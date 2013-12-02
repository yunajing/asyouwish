package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class WishList {
	 String userID;
	 String wishID;
	 String contentID;	
	 DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	public WishList(ArrayList<String> attr) {
		if(attr.size()!=3){
			System.out.println("incorrect input");
		}else{
			Entity list = new Entity("WishList", attr.get(0));

			userID = attr.get(0);
			wishID = attr.get(1);
			contentID = attr.get(2);	
			datastore.put(list);
		}
	}	
}
