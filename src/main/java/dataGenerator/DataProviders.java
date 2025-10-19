package dataGenerator;

import org.testng.annotations.DataProvider;
import utilities.PropertyManager;

public class DataProviders {
    @DataProvider(name = "FailedLoginDataSet")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]
                {
                        {PropertyManager.getInstance().getInvalidUsername(), PropertyManager.getInstance().getValidPassword(), "Epic sadface: Username and password do not match any user in this service"},
                        {"standard_user", "pogresnaLozinka", "Epic sadface: Username and password do not match any user in this service"},
                        {"", "", "Epic sadface: Username is required"},
                        {"", "nekaSifra", "Epic sadface: Username is required"},
                        {"pogresanUsername", "", "Epic sadface: Password is required"}
                };
    }
}

