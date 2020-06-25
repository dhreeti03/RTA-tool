package com.dhreeti.springbootRTA;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
@SpringBootTest(classes = UserController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class UserUnitTests {

	@Test
	public void testPageStatus() {

		expect().statusCode(200).log().all().when().get("/demo/user");
	}

	@Test
	public void getUserDetails() {

		when().get("/demo/{id}", 6).then().statusCode(200).contentType("application/json\r\n").body("id", equalTo(6),
				"firstName", equalTo("dhreeti"), "lastName", equalTo("shah"), "email",
				equalTo("dhreeti2000@gmail.com"));

	}

	@Test
	public void postUserDetails() {

		User user = new User();

		user.setFirstName("xxxx");
		user.setLastName("yyyy");
		user.setEmail("123@gmail.com");

		given().contentType("application/json").body(user).when().post("/demo/user");

	}

}
