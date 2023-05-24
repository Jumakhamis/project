package kilimani.project.Service;

import kilimani.project.Model.Sale;
import kilimani.project.Repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService{

    @Autowired
    private SaleRepository saleRepository;
    @Override
    public Sale savesale(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> fetchSaleList() {
        return saleRepository.findAll();
    }

    @Override
    public Sale fetchSaleById(Long saleId) {
        return saleRepository.findById(saleId).get();
    }
}
