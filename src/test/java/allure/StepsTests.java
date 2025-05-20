package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class StepsTests {
    private static final String REPOSITORY = ;

    @Test
    public void testLambdaStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());

step("Open home page", () -> {
        open("https://github.com");
});
step("searching for repository" + REPOSITORY, () -> {
    @Override
    public void run(Allure.StepContext context) throws Throwable {

    }
        });

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