package kilimani.project.Service;

import kilimani.project.Model.Sale;

import java.util.List;

public interface SaleService {
   public Sale savesale(Sale sale);

  public List<Sale> fetchSaleList();

  public Sale fetchSaleById(Long saleId);
}
