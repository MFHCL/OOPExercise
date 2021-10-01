package Training;

public class Invoice {

    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            quantity = 0;
        }else{
        this.quantity = quantity;}
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0){
            pricePerItem = 0.0;
        }else{
        this.pricePerItem = pricePerItem;}
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);


//        this.quantity = quantity;
//        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
//        if (quantity<0){
//            quantity = 0;
//        }
//
//        if (pricePerItem < 0){
//            pricePerItem = 0.0;
//        }
        return quantity*pricePerItem;
    }



}
class TestApp{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Invoice invoice = new Invoice("42","Training Book", -2,112);
        System.out.println(invoice.getInvoiceAmount());
        System.out.println();

    }
}