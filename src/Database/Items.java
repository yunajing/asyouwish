package Database;

import java.util.ArrayList;

public class Items {
	private String itemID;
	private String category;
	private String itemName;
	private double price;
	public Items(ArrayList<String> attr) {
		if(attr.size()!=4){
			System.out.println("incorrect input");
		}else{
			itemID = attr.get(0);
			category = attr.get(1);
			itemName = attr.get(2);
			price = Double.parseDouble(attr.get(3));
		}
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getItemID(){
		return itemID;
	}
	
	public String getCategory(){
		return category;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public double getPrice(){
		return price;
	}
}
