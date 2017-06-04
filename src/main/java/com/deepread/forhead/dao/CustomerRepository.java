package com.deepread.forhead.dao;

import com.deepread.forhead.entity.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}