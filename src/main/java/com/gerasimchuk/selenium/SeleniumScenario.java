package com.gerasimchuk.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumScenario {
    public static void main(String[] args) {
        try {

            System.setProperty("webdriver.chrome.driver", "C:\\ChromeSeleniumDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("localhost:8080/worldwidelogistics");

//            //adminpage
            // login
            WebElement loginField = driver.findElement(By.id("text"));
            loginField.sendKeys("7777777777");
            WebElement passwordField = driver.findElement(By.id("pwd"));
            passwordField.sendKeys("password");
            Thread.sleep(5000);
            WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
            loginBtn.click();
            Thread.sleep(40000);
            // add cargo:
            WebElement manageCargosLink = ((ChromeDriver) driver).findElementByLinkText("Manage cargos");
            manageCargosLink.click();
            Thread.sleep(5000);
            WebElement addNewCargoBtn = driver.findElement(By.id("addNewCargoBtn"));
            addNewCargoBtn.click();
            Thread.sleep(5000);
            WebElement nameField = driver.findElement(By.id("cargo_name"));
            nameField.sendKeys("HeinekenBeerBox");
            Thread.sleep(200);
            WebElement weightField = driver.findElement(By.id("weight"));
            weightField.sendKeys("20");
            Thread.sleep(200);
            Select cityFromSelect = new Select(driver.findElement(By.id("city_from")));
            cityFromSelect.selectByVisibleText("Moscow");
            Thread.sleep(200);
            Select cityToSelect = new Select(driver.findElement(By.id("city_to")));
            Thread.sleep(200);
            cityToSelect.selectByVisibleText("Saint-Petersburg");
            Thread.sleep(200);
            WebElement commitAddCargoBtn = driver.findElement(By.id("commitAddNewCargo"));
            Thread.sleep(10000);
            commitAddCargoBtn.click();
            Thread.sleep(5000);
            WebElement actionSuccessHomeBtn = driver.findElement(By.xpath("//button[text()='Go home']"));
            actionSuccessHomeBtn.click();
            Thread.sleep(500);
            // add cargo2:
            WebElement manageCargosLink2 = ((ChromeDriver) driver).findElementByLinkText("Manage cargos");
            manageCargosLink2.click();
            Thread.sleep(500);
            WebElement addNewCargoBtn2 = driver.findElement(By.id("addNewCargoBtn"));
            addNewCargoBtn2.click();
//            Thread.sleep(2000);
            WebElement nameField2 = driver.findElement(By.id("cargo_name"));
//            Thread.sleep(2000);
            nameField2.sendKeys("AmstelBeerBox");
//            Thread.sleep(2000);
            WebElement weightField2 = driver.findElement(By.id("weight"));
//            Thread.sleep(2000);
            weightField2.sendKeys("20");
//            Thread.sleep(2000);
            Select cityFromSelect2 = new Select(driver.findElement(By.id("city_from")));
//            Thread.sleep(2000);
            cityFromSelect2.selectByVisibleText("Petrozavodsk");
//            Thread.sleep(2000);
            Select cityToSelect2 = new Select(driver.findElement(By.id("city_to")));
//            Thread.sleep(2000);
            cityToSelect2.selectByVisibleText("Saint-Petersburg");
//            Thread.sleep(2000);
            WebElement commitAddCargoBtn2 = driver.findElement(By.id("commitAddNewCargo"));
            Thread.sleep(10000);
            commitAddCargoBtn2.click();
            Thread.sleep(2000);
            WebElement actionSuccessHomeBtn2 = driver.findElement(By.xpath("//button[text()='Go home']"));
            Thread.sleep(2000);
            actionSuccessHomeBtn2.click();
            // add truck
            WebElement manageTrucksLink = ((ChromeDriver) driver).findElementByLinkText("Manage trucks");
            manageTrucksLink.click();
            Thread.sleep(7000);
            WebElement addNewTruckBtn = driver.findElement(By.id("addNewTruckBtn"));
//            Thread.sleep(2000);
            addNewTruckBtn.click();
//            Thread.sleep(2000);
            WebElement regNumField = driver.findElement(By.id("registration_number"));
//            Thread.sleep(2000);
            regNumField.sendKeys("xx77777");
            Thread.sleep(500);
            WebElement numOfDriversField = driver.findElement(By.id("num_of_drivers"));
//            Thread.sleep(500);
            numOfDriversField.sendKeys("2");
            Thread.sleep(500);
            WebElement capacityField = driver.findElement(By.id("capacity"));
//            Thread.sleep(2000);
            capacityField.sendKeys("5");
            Thread.sleep(500);
            Select citySelect = new Select(driver.findElement(By.id("change_city")));
//            Thread.sleep(2000);
            citySelect.selectByVisibleText("Pskov");
            Thread.sleep(500);
            WebElement commitAddNewTruckBtn = driver.findElement(By.id("commitAddNewTruck"));
            Thread.sleep(40000);
            commitAddNewTruckBtn.click();
            Thread.sleep(2000);
            WebElement actionSuccessHomeBtn3 = driver.findElement(By.xpath("//button[text()='Go home']"));
            Thread.sleep(2000);
            actionSuccessHomeBtn3.click();
            Thread.sleep(2000);

            // add user
            WebElement manageUsersLink = ((ChromeDriver) driver).findElementByLinkText("Manage users");
            manageUsersLink.click();
            Thread.sleep(3000);
            WebElement addNewUserBtn = driver.findElement(By.id("addNewUserBtn"));
            addNewUserBtn.click();
//            Thread.sleep(2000);
            WebElement userNameField = driver.findElement(By.id("driver_name"));
//            Thread.sleep(2000);
            userNameField.sendKeys("Ivanov");
            Thread.sleep(500);
            WebElement userMiddleNameField = driver.findElement(By.id("driver_middle_name"));
//            Thread.sleep(2000);
            userMiddleNameField.sendKeys("Petr");
            Thread.sleep(500);
            WebElement userLastNameField = driver.findElement(By.id("driver_last_name"));
//            Thread.sleep(2000);
            userLastNameField.sendKeys("Alekseevich");
            Thread.sleep(500);
            WebElement userPwdField = driver.findElement(By.id("driver_password"));
//            Thread.sleep(500);
            userPwdField.sendKeys("password");
            Thread.sleep(500);

//            Thread.sleep(2000);
            Select roleSelect = new Select(driver.findElement(By.id("user_role")));
            roleSelect.selectByVisibleText("DRIVER");
            Thread.sleep(500);
            WebElement hoursWorkedField = driver.findElement(By.id("hours_worked"));
//            Thread.sleep(2000);
            hoursWorkedField.sendKeys("0");
            Thread.sleep(500);
            Select currentCitySelect = new Select(driver.findElement(By.id("driver_current_city")));
//            Thread.sleep(2000);
            currentCitySelect.selectByVisibleText("Pskov");
            Thread.sleep(500);
            Select assignedTruckSelect = new Select(driver.findElement(By.id("driver_current_truck")));
//            Thread.sleep(2000);
            assignedTruckSelect.selectByVisibleText("xx77777");
            Thread.sleep(500);
            WebElement commitAddNewDriverBtn = driver.findElement(By.id("commitAddNewUser"));
            Thread.sleep(50000);
            commitAddNewDriverBtn.click();
//            Thread.sleep(1000);
            WebElement actionSuccessHomeBtn4 = driver.findElement(By.xpath("//button[text()='Go home']"));
            Thread.sleep(1000);
            actionSuccessHomeBtn4.click();
//            Thread.sleep(1000);
            // add new order
            WebElement addNewOrderBtn = driver.findElement(By.xpath("//button[text()='Add new']"));
//            Thread.sleep(2000);
            addNewOrderBtn.click();
//            Thread.sleep(5000);
            WebElement orderDescriptionField = driver.findElement(By.id("item_descr"));
//            Thread.sleep(2000);
            orderDescriptionField.sendKeys("New order");
            Thread.sleep(500);
            WebElement cargosSelectWebElement = driver.findElement(By.id("add_cargos"));
//            Thread.sleep(2000);
            Select cargosSelect = new Select(cargosSelectWebElement);
            Thread.sleep(500);
            cargosSelect.selectByVisibleText("AmstelBeerBox: from Petrozavodsk to Saint-Petersburg");
            Thread.sleep(500);
            cargosSelect.selectByVisibleText("HeinekenBeerBox: from Moscow to Saint-Petersburg");
//            Thread.sleep(2000);
            WebElement goToAssignTruckBtn = driver.findElement(By.xpath("//button[text()='Go to assign truck']"));
            Thread.sleep(40000);
            goToAssignTruckBtn.click();
//            Thread.sleep(2000);
            Select assignTruckSelect = new Select(driver.findElement(By.id("add_truck")));
//            Thread.sleep(2000);
            assignTruckSelect.selectByVisibleText("Reg.num: xx77777, current city: Pskov");
//            Thread.sleep(500);
            WebElement commitAddNewOrderBtn = driver.findElement(By.id("commitAddNewOrder"));
            Thread.sleep(30000);
            commitAddNewOrderBtn.click();
//            Thread.sleep(2000);
            WebElement actionSuccessHomeBtn5 = driver.findElement(By.xpath("//button[text()='Go home']"));
            Thread.sleep(1000);
            actionSuccessHomeBtn5.click();
            Thread.sleep(2000);
            WebElement showOnMapBtn = driver.findElement(By.xpath("//button[text()='Show on map']"));
//            Thread.sleep(2000);
            showOnMapBtn.click();
            Thread.sleep(30000);

            WebElement goBackBtn = driver.findElement(By.id("goBackBtn"));
            goBackBtn.click();
            // get driver personal number
            WebElement manageUsersLink2 = ((ChromeDriver) driver).findElementByLinkText("Manage users");
            manageUsersLink2.click();
            WebElement showMoreUsersBtn = driver.findElement(By.xpath("//button[text()='Show more users']"));
            showMoreUsersBtn.click();
            String driverPersonalNumber = null;
            Thread.sleep(3000); // sleep - waiting for table elements!
            WebElement usersTable = driver.findElement(By.id("myTable3"));
            List<WebElement> usersRows = usersTable.findElements(By.tagName("tr"));
            for(WebElement row: usersRows){
                List<WebElement> usersTDs = row.findElements(By.tagName("td"));
                if (!usersTDs.isEmpty()) {
                    if (usersTDs.get(2).getText().equals("Ivanov") && usersTDs.get(3).getText().equals("Petr") && usersTDs.get(4).getText().equals("Alekseevich")) {
                        driverPersonalNumber = usersTDs.get(5).getText();
                    }
                }
            }
            // logout
            // login as driver

            System.out.println("pNum=" + driverPersonalNumber);
            WebElement logoutLink = ((ChromeDriver) driver).findElementByLinkText("Log out");
            logoutLink.click();

            WebElement loginField2 = driver.findElement(By.id("text"));
            loginField2.sendKeys(driverPersonalNumber);
            WebElement passwordField2 = driver.findElement(By.id("pwd"));
            passwordField2.sendKeys("password");
            Thread.sleep(1000);
            WebElement loginBtn2 =  driver.findElement(By.xpath("//button[text()='Login']"));
            loginBtn2.click();
            Thread.sleep(500);
            WebElement showAssistantsBtn = driver.findElement(By.id("driverStatusDropdownBtn"));
            showAssistantsBtn.click();
            Thread.sleep(4000);
            WebElement showRouteBtn = driver.findElement(By.id("routeStatusDropdownBtn"));
            showRouteBtn.click();
            Thread.sleep(4000);
            Select driverStatusSelect = new Select(driver.findElement(By.id("driver_status")));

            driverStatusSelect.selectByVisibleText("FREE");
            Thread.sleep(2000);
            driverStatusSelect.selectByVisibleText("DRIVING");
            Thread.sleep(500);
            WebElement updateStatusBtn = driver.findElement(By.xpath("//button[text()='Update your status']"));
            updateStatusBtn.click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.accept();


            WebElement cargosTable = driver.findElement(By.id("myCargoDetailsTable"));
            List<WebElement> cargosRows = cargosTable.findElements(By.tagName("tr"));
            for(WebElement row: cargosRows){
                List<WebElement> usersTDs = row.findElements(By.tagName("td"));
                if (!usersTDs.isEmpty()) {
                    Select select = new Select(usersTDs.get(4).findElement(By.tagName("select")));
                    select.selectByVisibleText("DELIVERED");
//                usersTDs.get(4)
                    Thread.sleep(1000);
                    WebElement changeCargoStatus = usersTDs.get(5);
                    changeCargoStatus.click();
                    Thread.sleep(1000);
                    Alert alert2 = driver.switchTo().alert();
                    Thread.sleep(3000);
                    alert2.accept();
                    Thread.sleep(500);
                }
            }

            Select orderStatusSelect = new Select(driver.findElement(By.id("order_status")));
            orderStatusSelect.selectByVisibleText("EXECUTED");
            WebElement updateOrderStatusBtn = driver.findElement(By.xpath("//button[text()='Update order status']"));
            updateOrderStatusBtn.click();
            Thread.sleep(1000);
            Alert alert3 = driver.switchTo().alert();
            Thread.sleep(1000);
            alert3.accept();
            Thread.sleep(15000);
            WebElement logoutLink2 = ((ChromeDriver) driver).findElementByLinkText("Log out");
            logoutLink2.click();

            driver.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
