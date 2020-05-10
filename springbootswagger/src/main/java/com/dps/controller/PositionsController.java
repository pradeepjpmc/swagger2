package com.dps.controller;

import com.dps.domains.Balance;
import com.dps.domains.Positions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/positions")
@Api(value="positionsDetails", description="Operations Positions Details")
public class PositionsController {

    @ApiOperation(value = "View a list of available Positions",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Positions> list(Model model){
        Iterable<Positions> positionsList = null;
        return positionsList;
    }

    @ApiOperation(value = "Search a Positions Details with an ID",response = Balance.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Balance showProduct(@PathVariable Integer id, Model model){
        Balance balance = null;
        return balance;
    }

}
