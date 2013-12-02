package Database;

import java.util.ArrayList;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Items {
	 String itemID;
	 String category;
	 String itemName;
	 double price;
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	public Items(ArrayList<String> attr) {
		if(attr.size()!=4){
			System.out.println("incorrect input");
		}else{
			Entity item = new Entity("Items", attr.get(0));
			itemID = attr.get(0);
			category = attr.get(1);
			itemName = attr.get(2);
			price = Double.parseDouble(attr.get(3));
			datastore.put(item);
		}
	}
}
