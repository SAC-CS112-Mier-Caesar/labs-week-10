public class RandomNumber {

	private int high

	public RandomNumber(int high){
	highNumber = high;
	
}

	public int getAnumber(){
	
	getAnumber(lowNumber, highNumber);
	return randomNumber;
}
	public void setLowNumber(int low){
		lowNumber= low;
}

	public void setHighNumber(int high){
		highNumber = high;

}

	private void getANumber(int low, int high){
		randomNumber = (int)(Math.floor(Math.random() * ((high - low) + low));
		
	}

}


////////////////////////////////////////////////////////////////////////////////////////////////


public class RandomNumer{

private int low;
private int high;

public RandomNumber(int low, int high){

	this.high = high;
	this.low = low;

}

public RandomNumber(int high)
{
	this.high = high;
}

public int getANumber()
{
	int randomNum = 1+(int)(Math.random()*high);
	return randomNum;
}

/////////////////////////////////////////////////////////////////////////////////////////////////

