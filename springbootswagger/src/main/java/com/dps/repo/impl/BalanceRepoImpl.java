package com.dps.repo.impl;

import com.dps.domains.Balance;
import com.dps.repo.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class BalanceRepoImpl implements BalanceRepository {


    @Override
    public Iterable<Balance> findAll() {
        return null;
    }

    @Override
    public Optional<Balance> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Balance save(Balance balance) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Iterable<Balance> listAllBalance() {
        return null;
    }

    @Override
    public Balance getProductById(Integer id) {
        return null;
    }
}
