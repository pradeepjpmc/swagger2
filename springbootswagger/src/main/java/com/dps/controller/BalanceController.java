package com.dps.controller;

import com.dps.domains.Balance;
import com.dps.services.BalanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
@Api(value="balanceDetails", description="Operations Balance Details")
public class BalanceController {

    private BalanceService balanceService;

    @Autowired
    public void setBroductService(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @ApiOperation(value = "View a list of available Balance",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Balance> list(Model model){
        Iterable<Balance> balanceList = balanceService.listAllBalance();
        return balanceList;
    }
    @ApiOperation(value = "Search a Balance Details with an ID",response = Balance.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Balance showProduct(@PathVariable Integer id, Model model){
        Balance balance = balanceService.getProductById(id);
        return balance;
    }

    @ApiOperation(value = "Add a Balance")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveBalance(@RequestBody Balance balance){
        balanceService.saveBalance(balance);
        return new ResponseEntity("Balance saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update a balance")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody Balance balance){
        Balance storedBalance = balanceService.getBalanceById(id);
        storedBalance.setDescription(balance.getDescription());
        storedBalance.setImageUrl(balance.getImageUrl());
        storedBalance.setPrice(balance.getPrice());
        balanceService.saveBalance(storedBalance);
        return new ResponseEntity("Balance updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a Balance")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id){
        balanceService.deleteBalance(id);
        return new ResponseEntity("Balance deleted successfully", HttpStatus.OK);

    }

}
