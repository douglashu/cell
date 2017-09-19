package com.lj.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * 类目
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /* 类目Id */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /* 类目名字 */
    private String categoryName;
    /* 类目编号 */
    private Integer categoryType;

    public ProductCategory() {
        super();
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
