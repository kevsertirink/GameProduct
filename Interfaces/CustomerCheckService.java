package Interfaces;

import Entities.Customer;

public abstract interface CustomerCheckService {
        public abstract boolean checkIfRealPerson(Customer customer);
}
