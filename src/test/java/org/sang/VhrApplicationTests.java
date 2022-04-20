package org.sang;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.bean.Menu;
import org.sang.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VhrApplicationTests {

	@Autowired
	MenuService menuservice;
    @Test
    public void getAllMenus() {
    	List<Menu> lists = menuservice.getAllMenu();
    	Assert.assertTrue(lists.size() > 0);
    }

}
