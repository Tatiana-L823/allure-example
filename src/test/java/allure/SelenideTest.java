package allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.withText;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {
    @Test
    public void testIssueSearch() {
        open("https://github.com");
        $("[data-target='qbsearch-input.inputButtonText']").shouldBe(Condition.visible).click();


        $("#query-builder-test")
                .shouldBe(Condition.visible)
                .setValue("allure-framework/allure2")
                .pressEnter();


        $(byLinkText("allure-framework/allure2")).shouldBe(Condition.visible).click();
        $("#issues-tab").shouldBe(Condition.visible).click();
        $(withText("Pull requests")).shouldBe(Condition.visible);



    }
}
