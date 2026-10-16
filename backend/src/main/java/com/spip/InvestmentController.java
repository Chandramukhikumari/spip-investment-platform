package com.spip;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("/api/investments")
@CrossOrigin(origins="http://localhost:5173")
public class InvestmentController {
    private final InvestmentRepository repo;
    public InvestmentController(InvestmentRepository repo){this.repo=repo;}
    @GetMapping public List<Investment> all(@RequestParam(required=false) String owner) {
        return owner==null || owner.isBlank()?repo.findAll():repo.findByOwnerNameIgnoreCase(owner);
    }
    @GetMapping("/{id}") public Investment one(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Investment not found"));
    }
    @PostMapping public Investment create(@RequestBody Investment item) {
        Investment investment = new Investment(
                item.getOwnerName(), item.getAssetName(), item.getAssetType(), item.getAmount());
        return repo.save(investment);
    }
    @PutMapping("/{id}") public Investment update(@PathVariable Long id,@RequestBody Investment item) {
        Investment old=one(id); old.setOwnerName(item.getOwnerName()); old.setAssetName(item.getAssetName());
        old.setAssetType(item.getAssetType()); old.setAmount(item.getAmount()); return repo.save(old);
    }
    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){repo.delete(one(id));}
}
