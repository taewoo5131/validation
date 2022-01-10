package hello.itemservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

@SpringBootTest
class ItemServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		boolean result = StringUtils.hasLength("test");
		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void test2() {
		boolean result = StringUtils.hasText("test");
		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void test4() {
		String result = StringUtils.trimWhitespace("      test");
		Assertions.assertThat(result).isEqualTo("test");
	}

	@Test
	void test5() {
		String result = StringUtils.trimWhitespace("      test      ");
		Assertions.assertThat(result).isEqualTo("test");
	}

	@Test
	void test6() {
		String result = StringUtils.trimLeadingCharacter("^test",'^');
		Assertions.assertThat(result).isEqualTo("test");
	}

	@Test
	void test7() {
		String result = StringUtils.trimTrailingCharacter("test^",'^');
		Assertions.assertThat(result).isEqualTo("test");
	}

	@Test
	void test8() {
		int result = StringUtils.countOccurrencesOf("test", "t");
		Assertions.assertThat(result).isEqualTo(2);
	}

	@Test
	void test9() {
		String result = StringUtils.getFilename("/test/home.png");
		Assertions.assertThat(result).isEqualTo("home.png");
	}

	@Test
	void test10() {
		String result = StringUtils.getFilenameExtension("/test/home.png");
		Assertions.assertThat(result).isEqualTo("png");
	}

	@Test
	void test11() {
		String result = StringUtils.stripFilenameExtension("/test/home.png");
		Assertions.assertThat(result).isEqualTo("/test/home");
	}
}
