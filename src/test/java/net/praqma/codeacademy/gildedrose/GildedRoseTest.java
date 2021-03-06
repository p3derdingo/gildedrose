package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	//This test is totally awesome. Or not
    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
	
	@Test
	public void fooOne(){
		Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20)};

        GildedRose app = new GildedRose(items);
		//app.updateQuality();
		assertEquals("+5 Dexterity Vest", app.items[0].name);
		assertEquals(10, app.items[0].sellIn);
		assertEquals(20, app.items[0].quality);
	}

}
