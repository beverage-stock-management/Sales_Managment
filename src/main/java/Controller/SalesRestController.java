package Controller;

import Model.Sales;
import com.beverageStock.sales.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesRestController {
    @Autowired
    SalesRepository salesRepository;


    @GetMapping(value = "/sales") //read all
    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }

    @GetMapping(value = "/sales/{id}") //read by id
    public Sales getSalesById(@PathVariable int id){
        return salesRepository.findSalesBySalesId(id);
    }

    @PostMapping(value = "/sales") //create
    public Sales addSales(@RequestBody Sales sales){
        return salesRepository.save(sales);
    }

    @DeleteMapping(value = "/sales/{id}") //delete
    public void deleteSales(@PathVariable int id){
        salesRepository.deleteById(id);
    }

    @PutMapping(value = "/sales/{id}") //update
    public Sales updateSales(@PathVariable int id , @RequestBody Sales sales){
        salesRepository.deleteById(id);
        return salesRepository.save(sales);
    }

}
