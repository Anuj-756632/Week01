//Program to calculate Profit and Loss
public class CalculateProfitLoss{
       public static void main(String[] args){
	          //Cost price of INR
			int costPrice=129;
			
			//Selling Price of INR
			int sellingPrice=191;
			
			//To calculate Profit
			int profit=sellingPrice-costPrice;
			
			//To calculate Profit percent
			double profitPercent=(profit*100)/costPrice;
			
			//Display Cost price and Selling price of INR
			System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);
			
			//Display Profit and Profit Percentage
			System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercent);
		}
    }
			