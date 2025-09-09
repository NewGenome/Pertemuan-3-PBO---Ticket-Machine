

public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        cost = 0;
    }

    public int getPrice()
    {
        
        return price;
    }
    public int getBalance() {
        return balance;
    }
    public void insertMoney(int amount)
    {
        if(amount >0){
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than : " + amount);
        }
    }
    public void printticket()
    {
        if (balance >= price) {
            System.out.println("#####");
            System.out.println("# The Arima Line");
            System.out.println("# Winning Ticket");
            System.out.println("# " + price + "yen.");
            System.out.println("#####");
            System.out.println();
            total = total + price;
            balance = balance - price;
        }
        else{
            System.out.println("Please insert atleast: " + (price-balance) + " yen.");
        }
    }
    public int refundbalance()
    {
        int amountrefund;
        amountrefund = balance;
        balance = 0;
        return amountrefund;
    }
}
    
