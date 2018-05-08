public class Passenger {
    private  String customerNAme;

    public Passenger(String customerNAme) {
        this.customerNAme = customerNAme;
    }

    public String getCustomerNAme() {
        return customerNAme;
    }


    //tostring method to display passenger object
    @Override
    public String toString() {
        return  customerNAme ;

    }
}