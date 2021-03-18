package invoice;

import java.util.List;

public class TestInvoiceDao implements InvoiceDao {
    @Override
    public List<Invoice> all() {
        return List.of(new Invoice("Test1", 10.0),
                new Invoice("Test2", 101.0));
    }

    @Override
    public void save(Invoice inv) {

    }

    @Override
    public void close() {

    }
}
