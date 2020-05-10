package com.dps.domains;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Balance {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated Balance ID")
    private Integer id;
    @ApiModelProperty(notes = "The auto-generated version of the Balance")
    private Integer version;
    @ApiModelProperty(notes = "The application-specific balance ID")
    private String balanceId;
    @ApiModelProperty(notes = "The balance description")
    private String description;
    @ApiModelProperty(notes = "The image URL of the balance")
    private String imageUrl;
    @ApiModelProperty(notes = "The price of the balance", required = true)
    private BigDecimal price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setProductId(String balanceId) {
        this.balanceId = balanceId;
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
