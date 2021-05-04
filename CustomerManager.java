public class CustomerManager implements CustomerService{

    ValidationManager validationManager;

    public CustomerManager(ValidationManager validationManager){
        this.validationManager=validationManager;
    }

    @Override
    public void add(Customer customer) {
        if(validationManager.checkIfRealPerson(customer))
            System.out.println("Müşteri eklendi: " + customer.getFirstName());
        else
            System.out.println("Geçersiz müşteri, eklenemedi!");
    }

    @Override
    public void delete(Customer customer) {
        if(validationManager.checkIfRealPerson(customer))
            System.out.println("Müşteri silindi: " + customer.getFirstName());
        else
            System.out.println("Geçersiz müşteri, silinemedi!");

    }

    @Override
    public void update(Customer customer) {
        if(validationManager.checkIfRealPerson(customer))
            System.out.println("Müşteri bilgileri güncellendi: " + customer.getFirstName());
        else
            System.out.println("Geçersiz müşteri, bilgiler güncellenemedi!");

    }
}
