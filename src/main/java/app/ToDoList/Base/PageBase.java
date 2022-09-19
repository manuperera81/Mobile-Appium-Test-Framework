package app.ToDoList.Base; /**
 * @author manup on 9/19/2022
 */

import app.ToDoList.ActionDriver.Action;
import app.ToDoList.ActionDriver.ActionInterface;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();


    public static AppiumDriver getDriver() {
        return driver.get();
    }

}
