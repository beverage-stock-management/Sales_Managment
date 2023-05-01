package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data //no getter setter
@AllArgsConstructor //no constructor
public class Sales {
@Id
    private int salesId;
    private int productId;
    private String productName;
    private int productQty;
    private String address;

}
