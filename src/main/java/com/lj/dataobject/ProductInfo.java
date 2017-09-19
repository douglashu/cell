package com.lj.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal producePrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    /* 0正常 1下架 */
    private Integer productStatus;

    private Integer categoryType;

    public ProductInfo() {
        super();
    }

    public ProductInfo(String productId, String productName, BigDecimal producePrice, Integer productStock, String productDescription, String productIcon, Integer productStatus, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.producePrice = producePrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.productStatus = productStatus;
        this.categoryType = categoryType;
    }
}
