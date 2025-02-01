public class Customer {

    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus CustomerStatus;

    public Customer(){}

    public Customer(String name, String email, String phone, Address address, CustomerStatus  CustomerStatus){
        this.name = name;
        this.email = email;
        this. phone = phone;
       // this. address = address;
        this.CustomerStatus = CustomerStatus;
    }

//    public boolean makeTransaction(){
//
//    }

}
