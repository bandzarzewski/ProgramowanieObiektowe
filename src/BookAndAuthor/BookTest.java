package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class BookTest {
    Author author = new Author("Jan", "email@", 'm');
    Book book = new Book("LotR", author, 24.78, 4);

    @Test
    public void BookGetNameTest() {
        Assert.assertEquals("LotR", book.getName());
    }

    @Test
    public void BookGetAuthorTest() {
        Assert.assertEquals(author, book.getAuthor());
    }

    @Test
    public void BookGetPriceTest() {
        Assert.assertEquals(24.78, book.getPrice(), 0.01);
    }

    @Test
    public void BookSetPriceTest() {
        book.setPrice(24.78);
        Assert.assertEquals(24.78, book.getPrice(), 0.01);
    }

    @Test
    public void BookGetQtyTest() {
        Assert.assertEquals(4, book.getQty(), 0.01);
    }

    @Test
    public void BookSetQtyTest() {
        book.setQty(3);
        Assert.assertEquals(3, book.getQty(), 0.01);
    }

    @Test
    public void BookSetToStringTest() {
        Assert.assertEquals("Book[name=LotR Author[name= Jan,email=email@,gender=m] ,price=24,780000, qty=4]", book.toString());
    }


}
