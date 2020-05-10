package com.dps.services.impl;

import com.dps.domains.Balance;
import com.dps.repo.BalanceRepository;
import com.dps.services.BalanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BalanceRepository balanceRepository;

    @Override
    public Iterable<Balance> listAllBalances() {
        logger.debug("listAllBalances called");
        return balanceRepository.findAll();
    }

    @Override
    public Balance getBalanceById(Integer id) {
        logger.debug("getBalanceById called");
        return balanceRepository.findById(id).orElse(null);
    }

    @Override
    public Balance saveBalance(Balance balance) {
        logger.debug("saveBalance called");
        return balanceRepository.save(balance);
    }

    @Override
    public void deleteBalance(Integer id) {
        logger.debug("deleteProduct called");
        balanceRepository.deleteById(id);
    }

    @Override
    public Iterable<Balance> listAllBalance() {
        return balanceRepository.listAllBalance();
    }

    @Override
    public Balance getProductById(Integer id) {
        return balanceRepository.getProductById(id);
    }
}
