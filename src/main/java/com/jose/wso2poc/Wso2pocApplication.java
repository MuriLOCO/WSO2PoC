package com.jose.wso2poc;

import com.jose.wso2poc.entities.MenuItem;
import com.jose.wso2poc.services.MenuItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Wso2pocApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Wso2pocApplication.class);

	@Autowired
	private MenuItemService menuItemService;

	public static void main(String[] args) {
		SpringApplication.run(Wso2pocApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		//save couple of menu items
		MenuItem item1 = new MenuItem();
		item1.setName("Chicken Parmesan");
		item1.setDescription("Grilled chicken, fresh tomatoes, feta and mozzarella cheese");
		item1.setPrice(12.09);
		item1.setImage("000001");
		menuItemService.saveMenuItem(item1);

		MenuItem item2 = new MenuItem();
		item2.setName("Spicy Italian");
		item2.setDescription("Pepperoni and a double portion of spicy Italian sausage");
		item2.setPrice(11.23);
		item2.setImage("000002");
		menuItemService.saveMenuItem(item2);

		MenuItem item3 = new MenuItem();
		item3.setName("Garden Fresh");
		item3.setDescription("Slices onions and green peppers, gourmet " +
				"mushrooms, black olives and ripe Roma tomatoes");
		item3.setPrice(13.00);
		item3.setImage("000003");
		menuItemService.saveMenuItem(item3);

		MenuItem item4 = new MenuItem();
		item4.setName("Tuscan Six Cheese");
		item4.setDescription("Six cheese blend of mozzarella, Parmesan, Romano, Asiago and Fontina");
		item4.setPrice(10.22);
		item4.setImage("000004");
		menuItemService.saveMenuItem(item4);

		MenuItem item5 = new MenuItem();
		item5.setName("Spinach Alfredo");
		item5.setDescription("Rich and creamy blend of spinach and garlic Parmesan with Alfredo sauce");
		item5.setPrice(9.98);
		item5.setImage("000005");
		menuItemService.saveMenuItem(item5);

		LOGGER.info("Getting all menu");

		for (MenuItem menuItem : menuItemService.getAllMenuItems()) {
			LOGGER.info("Menu item :" + menuItem.toString());
		}

	};
}

