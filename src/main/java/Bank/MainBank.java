package Bank;
import java.util.ArrayList;
import java.util.List;

public class MainBank {


        static Integer customerNumber = 0;
        static Integer accountNumber = 0;

        private String name;
        private List<Customer> customers;

	public MainBank(String name) {
            this.name = name;
            customers = new ArrayList<>();
        }

        public boolean addCustomer(Customer customer) {
            if(checkCustomerOnList(customer)) {
                System.out.println("Klient " + customer + " już jest w systemie.");
                return false;
            }
            customer.setId(customerNumber.toString());
            customers.add(customer);
            customerNumber++;
            System.out.println("Klient " + customer + " dodany");
            return true;
        }

        public boolean removeCustomer(Customer customer) {
            if(checkCustomerOnList(customer)) {
                return removeCustomerIfHasNoAccounts(customer);
            }
            return customerNotFound(customer);
        }

        private boolean customerNotFound(Customer customer) {
            System.out.println("Klienta " + customer + " nie znaleziono w systemie.");
            return false;
        }

        private boolean removeCustomerIfHasNoAccounts(Customer customer) {
            if(customer.getAccounts().isEmpty()) {
                return removeCustomerWithEmptyAccountList(customer);
            }
            System.out.println("Nie można usunąć klienta " + customer
                    + " bo ma otwarte rachunki");
            return false;
        }

        private boolean removeCustomerWithEmptyAccountList(Customer customer) {
            customers.remove(customer);
            System.out.println("Klient " + customer + " usunięty.");
            return true;
        }

        public boolean addAccount(Customer customer, AccountKind accountKind) {
            if(checkCustomerOnList(customer)) {
                List<Account> customerAccounts = customer.getAccounts();
                Account account = new Account("IBAN"+accountNumber.toString());
                account.setAccountKind(accountKind);
                customerAccounts.add(account);
                accountNumber++;
                System.out.println("Dla klienta " + customer +
                        " założono konto " + account);
                return true;
            }
            return customerNotFound(customer);
        }

        private boolean checkCustomerOnList(Customer customer) {
            return customers.contains(customer);
        }


    public void printCustomerList(boolean b) {
    }

    public void deposit(Customer customer1, Account account, int i) {
    }

    public void printAllBankAccounts() {
    }
}

