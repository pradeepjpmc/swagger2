package com.dps.repo;

import com.dps.domains.Balance;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BalanceRepository {
    Iterable<Balance> findAll();

    Optional<Balance> findById(Integer id);

    Balance save(Balance balance);

    void deleteById(Integer id);

    Iterable<Balance> listAllBalance();

    Balance getProductById(Integer id);
}
