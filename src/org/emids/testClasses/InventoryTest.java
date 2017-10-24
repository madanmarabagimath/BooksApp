package org.emids.testClasses;

import org.emids.service.Inventory;
import org.emids.util.ScannerClass;
import org.junit.Test;
import org.mockito.Mockito;

public class InventoryTest {
	Inventory inventory = new Inventory();

	@Test
	public void whenUserEntersJavaRelatedBooks() {
		Mockito.when(ScannerClass.nextline()).thenReturn("java");
		inventory.searchByBookName();

	}

}
