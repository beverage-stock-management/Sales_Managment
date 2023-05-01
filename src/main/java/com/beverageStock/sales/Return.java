package com.beverageStock.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Return {
@Id
    private int returnId;
    private int itemId;
    private String itemName;
    private String itemQty;
}
