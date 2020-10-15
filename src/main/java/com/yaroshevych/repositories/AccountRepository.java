package com.yaroshevych.repositories;

import com.yaroshevych.models.Account;
import com.yaroshevych.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
    Account findById(User accountId);
}
