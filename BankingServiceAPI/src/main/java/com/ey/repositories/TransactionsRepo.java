package com.ey.repositories;


import com.ey.models.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepo extends CrudRepository<Transactions, Integer> {
}
