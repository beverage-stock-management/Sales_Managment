package Controller;

import Model.Return;
import com.beverageStock.sales.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReturnRestController {
    @Autowired
    ReturnRepository returnRepository;

    @GetMapping(value = "/return") //read all
    public List<Return> getAllReturns(){
        return returnRepository.findAll();
    }

    @GetMapping(value = "/return/{id}") //read by id
    public Return getReturnById(@PathVariable int id){
        return returnRepository.findReturnByReturnId(id);
    }

    @PostMapping(value = "/return") //create
    public Return addReturn(@RequestBody Return returns){
        return returnRepository.save(returns);
    }

    @DeleteMapping(value = "/return/{id}") //delete
    public void deleteReturns(@PathVariable int id){
        returnRepository.deleteById(id);
    }

    @PutMapping(value = "/return/{id}") //update
    public Return update(@PathVariable int id,@RequestBody Return returns){
        returnRepository.deleteById(id);
        return returnRepository.save(returns);
    }
}
