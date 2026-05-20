public class BuyAndSellStocks{

    public static void CalcelateMaxProfit(int StockPrices[]){
        //Buyprice set to +Infinity
        int BuyPrice=Integer.MAX_VALUE;
        int Profit=0;
        int max=0;
        for (int i = 0; i < StockPrices.length; i++) {
            int SellPrice=StockPrices[i];  
            if(BuyPrice<SellPrice){
               Profit=SellPrice-BuyPrice;   //today's Profit
               if(max<Profit){
                max=Profit;                //Maximum profit
               }
            }
            else{
                BuyPrice=SellPrice;}
        }
        System.out.println("Maximum Profit is "+max);
    }
    public static void main(String args[]){
        int StockPrices[]={7,1,5,3,6,4};
        CalcelateMaxProfit(StockPrices);
    }
}