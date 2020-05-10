package com.dps.services;


import com.dps.domains.Balance;
import org.springframework.stereotype.Service;

@Service
public interface BalanceService {
    Iterable<Balance> listAllBalances();

    Balance getBalanceById(Integer id);

    Balance saveBalance(Balance balance);

    void deleteBalance(Integer id);

    Iterable<Balance> listAllBalance();

    Balance getProductById(Integer id);
}
