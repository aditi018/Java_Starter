public class Pizza {
    private int Price;
    private Boolean veg;
    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isTakeAwayOpted = false;
    private int extraCheesePrice = 100;
    private int extraToppingprice = 150;
    private int backPack = 20;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.Price = 300;
        }else{
            this.Price = 400;
        }
        basePizzaPrice = this.Price;
    }

    public void addExtraCheese(){
        this.Price += extraCheesePrice;
        isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        this.Price += extraToppingprice;
        isExtraToppingsAdded = true;
    }

    public void takeAway(){
        this.Price += backPack;
        isTakeAwayOpted = true;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza : \t\t\t\t\t"+ basePizzaPrice);

        if(isExtraCheeseAdded){
            bill += "Extra cheese is added: \t\t\t" + extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings is added: \t\t" + extraToppingprice+ "\n";
        }
        if(isTakeAwayOpted){
            bill += "Take away: \t\t\t\t\t\t" + backPack+ "\n";
        }
        bill += "------------------------------------"+ "\n";
        bill += "Total: \t\t\t\t\t\t\t" + this.Price +"\n";
        System.out.println(bill);
    }
}
