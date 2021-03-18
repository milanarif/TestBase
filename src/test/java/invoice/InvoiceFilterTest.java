package invoice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceFilterTest {

    @Test
    void keepUnder100() {
        InvoiceDao invoiceDao = new TestInvoiceDao();
        InvoiceFilter invoiceFilter = new InvoiceFilter(invoiceDao);

        var actual = invoiceFilter.filter();

        assertThat(actual).containsExactly(new Invoice("Test1", 10.0));
    }
}