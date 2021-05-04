public class ValidationManager implements ValidationService{




    @Override
    public boolean checkIfRealPerson(Customer customer) {
        if (customer.getNationalityId().length() == 11) {
            return true;
        } else {
            return false;
        }
    }
}
