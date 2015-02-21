package Topic_3.tests.Exercise_3;

import Topic_3.main.Exercise_3.RecentList;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RecentListTest {

	@Test
	public void RecentList_Add_Overflow_Removes_Older_Returns_Ok(){
		RecentList<String> recentList = new RecentList<String>(15);

		for (int i = 0; i < 16; i++) {
			recentList.add("hola" + i);
		}

		assertEquals("hola1", recentList.get(0).toString());
	}

	@Test
	public void RecentList_Add_Overflow_Not_Remove_Older_Returns_Fail(){
		RecentList<String> recentList = new RecentList<String>(15);

		for (int i = 0; i < 16; i++) {
			recentList.add("hola" + i);
		}

		assertNotEquals("hola0", recentList.get(0).toString());
	}

	@Test
	public void RecentList_Add_Not_Existing_Returns_Ok(){
		RecentList<String> recentList = new RecentList<String>(5);

		recentList.add("hola1");
		recentList.add("hola2");
		recentList.add("hola7");

		List<String> expected = Arrays.asList("hola1", "hola2", "hola7");

		assertEquals(expected, recentList);
	}

	@Test
	public void RecentList_Add_Size_Not_Exceeded_Returns_Ok(){
		RecentList<String> recentList = new RecentList<String>(15);

		for (int i = 0; i < 20; i++) {
			recentList.add("hola" + i);
		}

		assertEquals(recentList.size(), 15);
	}

	@Test
	public void RecentList_Add_Existing_Bumps_Up_Returns_Ok(){
		RecentList<String> recentList = new RecentList<String>(5);

		recentList.add("hola1");
		recentList.add("hola2");
		recentList.add("hola7");
		recentList.add("hola2");

		List<String> expected = Arrays.asList("hola1", "hola7", "hola2");

		assertEquals(expected, recentList);
	}

	@Test
	public void RecentList_Add_Existing_Not_Bump_Up_Returns_Fail(){
		RecentList<String> recentList = new RecentList<String>(5);

		recentList.add("hola1");
		recentList.add("hola2");
		recentList.add("hola7");
		recentList.add("hola2");

		List<String> expected = Arrays.asList("hola1", "hola2", "hola7");

		assertNotEquals(expected, recentList);
	}
}
