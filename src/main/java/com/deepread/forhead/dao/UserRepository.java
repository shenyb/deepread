package com.deepread.forhead.dao;

import com.deepread.forhead.entity.*;
import org.springframework.data.repository.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}