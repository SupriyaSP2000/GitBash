package Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

            public static void main(String[] args) {
                        WebDriver driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.get("https://developer.mozilla.org/en/docs/Web/HTML/Element/select");

                       // 1. getting drop down menu

                       WebElement categoriesDropDown = driver.findElement(By.name("select"));
                       Select categories = new Select(categoriesDropDown);

                       // 2. getting all options of menu

                        List<WebElement> optionsList = categories.getOptions();
                        System.out.println("The options list : ");
                        for (WebElement option : optionsList) {
                                 System.out.println(option.getText());
                        }

                       System.out.println();

                        // 3. selecting dropdown menu 

                       categories.selectByVisibleText("Value 1");

                       // categories.selectByIndex(0);
                      // categories.selectByValue(“”);

                      // 4. Deselecting dropdown menu
                      categories.deselectByVisibleText("Value 1");

                      // categories.deselectByIndex(0);
                      // categories.deselectByValue(“”);
                      // 5. Getting all selected options
                      List<WebElement> allSelectedOptions = categories.getAllSelectedOptions();

                      for (WebElement selectedOption : allSelectedOptions) {
                             System.out.println("Selected option is : "+ selectedOption.getText());
                     }

                      // 6. Gets first selected option

                      WebElement firstSelected = categories.getFirstSelectedOption();
                      System.out.println("First selected options is : "+ firstSelected.getText());

                      // 7. supports multiple select or not.

                      System.out.println(categories.isMultiple());

                      driver.quit();
           }
}
