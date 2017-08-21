package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class AuthorTest {
    Author author = new Author("Jan", "email@", 'm');

    @Test
    public void AuthorGetNameTest() {
        Assert.assertEquals("Jan", author.getName());
    }

    @Test
    public void AuthorGetEmailTest() {
        Assert.assertEquals("email@", author.getEmail());
    }

    @Test
    public void AuthorSetEmailTest() {
        author.setEmail("email@2");
        Assert.assertEquals("email@2", author.getEmail());
    }

    @Test
    public void AuthorGetGenderTest() {
        // storzyłem nowy obiekt Charakter
        Assert.assertEquals(new Character('m'), author.getGender());

    }

    @Test
    public void AuthorToStringTest() {
        Assert.assertEquals("Author[name= Jan,email=email@,gender=m]", author.toString());
    }


}
