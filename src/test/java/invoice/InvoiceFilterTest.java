package invoice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InvoiceFilterTest {

    @Test
    void keepUnder100() {
        InvoiceDao invoiceDao = new TestInvoiceDao();
        InvoiceFilter invoiceFilter = new InvoiceFilter(invoiceDao);

        var actual = invoiceFilter.filter();

        assertThat(actual).containsExactly(new Invoice("Test1", 10.0));
    }

    @Test
    void keepUnder100WithMock() {
        InvoiceDao invoiceDao = mock(InvoiceDao.class);
        when(invoiceDao.all()).thenReturn(List.of(new Invoice("Test1", 10.0),
                new Invoice("Test2", 101.0)));

        InvoiceFilter invoiceFilter = new InvoiceFilter(invoiceDao);

        var actual = invoiceFilter.filter();

        assertThat(actual).containsExactly(new Invoice("Test1", 10.0));
    }
}