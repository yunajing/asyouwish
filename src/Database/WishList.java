package Database;

import java.util.ArrayList;

public class WishList {
	private String userID;
	private String wishID;
	private String contentID;
	public WishList(ArrayList<String> attr) {
		if(attr.size()!=3){
			System.out.println("incorrect input");
		}else{
			userID = attr.get(0);
			wishID = attr.get(1);
			contentID = attr.get(2);		
		}
	}
	
	public void setUserID(String userID){
		this.userID = userID;
	}
	
	public void setWishID(String wishID){
		this.wishID = wishID;
	}
	
	public void setContentID(String contentID){
		this.contentID = contentID;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public String getWishID(){
		return wishID;
	}

	public String getContentID(){
		return contentID;
	}
}
