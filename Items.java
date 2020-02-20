package library;

public abstract class Items {
	
	private String name;
	private int itemNum;
	private int numOfCopies;
	
	
	
	
	public Items(String name, int itemNum, int numOfCopies) {
		this.name = name;
		this.itemNum = itemNum;
		this.numOfCopies = numOfCopies;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	

}
