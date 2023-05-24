package kilimani.project.Controller;

import kilimani.project.Model.Sale;
import kilimani.project.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("/sale")
    public Sale savesale(@RequestBody Sale sale){
        return saleService.savesale(sale);
    }

    @GetMapping
    public List<Sale> fetchSaleList(){
        return saleService.fetchSaleList();
    }
    @GetMapping("/sale{id}")
    public Sale fetchSaleById(@PathVariable("id") Long saleId){
        return saleService.fetchSaleById(saleId);
    }

}
