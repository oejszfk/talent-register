/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.jszfk;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author szakkolegium
 */
public class TagokKezeleseTest {

    public TagokKezeleseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class TagokKezelese.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        TagBean tb = new TagBean(1, "Gizi", new Date(System.currentTimeMillis()));
        TagokKezelese instance = new TagokKezelese();
        try {
            instance.add(tb);
            assertTrue(true);
        } catch (Exception ex) {
            assertTrue(false);
        }

    }

    @Test
    public void testUgyanAzAdd() {
        System.out.println("add");
        TagBean tb = new TagBean(1, "Gizi", new Date(System.currentTimeMillis()));
        TagokKezelese instance = new TagokKezelese();

        try {
            instance.add(tb);
            assertTrue(true);

            try {
                instance.add(tb);
                assertTrue(false);
            } catch (Exception ex) {
                assertTrue(true);
            }

        } catch (Exception ex) {
            assertTrue(false);
        }


        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testNullAdd() {
        System.out.println("add");
        TagBean tb = null;
        TagokKezelese instance = new TagokKezelese();
        try {
            instance.add(tb);
            assertTrue(false);
        } catch (Exception ex) {
            assertTrue(true);
        }

    }

    @Test
    public void testRemove() {
        System.out.println("Remove");
        TagBean tb = new TagBean(1, "Gizi", new Date(System.currentTimeMillis()));
        TagokKezelese instance = new TagokKezelese();
        try {
            instance.add(tb);
            instance.Remove(1);
            assertTrue(true);
        } catch (Exception ex) {
            assertTrue(false);
        }


    }

    @Test
    public void testRemovenotexist() {
        System.out.println("Remove");

        TagokKezelese instance = new TagokKezelese();
        try {

            instance.Remove(1);
            assertTrue(false);
        } catch (Exception ex) {
            assertTrue(true);
        }

    }

    @Test
    public void testModifie() {
        TagBean tb = new TagBean(1, "Gizi", new Date(System.currentTimeMillis()));
        TagokKezelese instance = new TagokKezelese();
        try {
            instance.add(tb);
            TagBean returnTb = instance.Find(1);
            returnTb.setJelszo("12345");
            instance.Modifie(returnTb);
            returnTb = instance.Find(1);
            if (returnTb.getJelszo().equals("12345")) {
                assertTrue(true);
            } else {
                assertTrue(false);
            }
        } catch (Exception ex) {
            assertTrue(false);
        }
    }
    
    @Test
    public void testModifieNotListObject() {
        TagBean tb = new TagBean(1, "Gizi", new Date(System.currentTimeMillis()));
        TagokKezelese instance = new TagokKezelese();
        try {
            instance.add(tb);
            TagBean returnTb = instance.Find(1);
            try{
            instance.Modifie(new TagBean(1, "Jóska", new Date(System.currentTimeMillis())));
            assertTrue(false);
            }catch(Exception ex){
                assertTrue(true);
            }
        } catch (Exception ex) {
            assertTrue(false);
        }
    }
}
