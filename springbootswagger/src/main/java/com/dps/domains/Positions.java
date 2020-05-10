package com.dps.domains;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Positions {

    @ApiModelProperty(notes = "The database generated Positions ID")
    private Integer id;
    @ApiModelProperty(notes = "The auto-generated version of the Positions")
    private Integer version;
    @ApiModelProperty(notes = "The application-specific Positions ID")
    private String balanceId;
    @ApiModelProperty(notes = "The Positions description")
    private String description;
    @ApiModelProperty(notes = "The image URL of the Positions")
    private String imageUrl;
    @ApiModelProperty(notes = "The price of the Positions", required = true)
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
