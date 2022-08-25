package automationexercise;


import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationExercise extends BaseTest{

    String baseUrl ="https://automationexercise.com/";
    @Before
    public void setup(){ openbrowser(baseUrl);
    }
    @Test
    public void testcase2(){

        //3. Verify that home page is visible successfully
        WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        homepage.getText();

        //4. Click on 'Signup / Login' button
        WebElement signup =driver.findElement(By.xpath("//a[@href='/login']"));
        signup.click();

        //5. Verify 'Login to your account' is visible
        WebElement Logintoyouraccount = driver.findElement(By.xpath("//div[@class='login-form']"));
        Logintoyouraccount.getText();

        //6. Enter correct email address and password
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("ketty@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("12345@");

        //7. Click 'login' button
        WebElement Loginbutton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        Loginbutton.click();

        //8. Verify that 'Logged in as username' is visible
       // WebElement username = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
      //  username.getText();
        WebElement VerifyUsernameLogin = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        VerifyUsernameLogin.getText();

        //9. Click 'Delete Account' button
        WebElement Deleteaccount = driver.findElement(By.xpath("//a[@href='/delete_account']"));
        Deleteaccount.click();

      //  //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountdelete = driver.findElement(By.xpath("//a[@href='/delete_account']"));
        accountdelete.getText();


    }
   @Test
    public void LoginUserwithincorrectemailandpassword(){

     //    3. Verify that home page is visible successfully
     //  WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
    //   homepage.getText();
       WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
       String actualText = VerifyText.getText();
       String expectedText = "Home\n" +
              "\uE8F8 Products\n" +
              "Cart\n" +
              "Signup / Login\n" +
              "Test Cases\n" +
              "API Testing\n" +
              "Video Tutorials\n" +
              "Contact us";
       //4. Click on 'Signup / Login' button
       WebElement ClickLogin =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
       ClickLogin.click();

       //5. Verify 'Login to your account' is visible
       WebElement VerifyText3 = driver.findElement(By.xpath("//div[@class='login-form']"));
       String actualText1 = VerifyText3.getText();
       String expectedText1 = "Login to your account";
       Assert.assertEquals(expectedText,actualText);

       //6. Enter incorrect email address and password
       WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
       username.sendKeys("kerty@gmail.com");

       WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
       password.sendKeys("123456");

       //7. Click 'login' button
       WebElement ClickLogin1 = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
       ClickLogin1.click();

       //8. Verify error 'Your email or password is incorrect!' is visible
       WebElement VerifyText5 = driver.findElement(By.xpath("//p[@style='color: red;']"));
       String actualText5 = VerifyText5.getText();
       String expectedText5 = "Your email or password is incorrect!";
       Assert.assertEquals(expectedText5,actualText5);
//
//
//       //4. Click on 'Signup / Login' button
//       WebElement signup =driver.findElement(By.xpath("//a[@href='/login']"));
//       signup.click();
//
//       //5. Verify 'Login to your account' is visible
//       WebElement Logintoyouraccount = driver.findElement(By.xpath("//div[@class='login-form']"));
//       Logintoyouraccount.getText();
//
//       //6. Enter incorrect email address and password
//       WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//       email.sendKeys("ketty12@gmail.com");
//
//       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//       password.sendKeys("123456");
//
//       //7. Click 'login' button
//       WebElement Loginbutton = driver.findElement(By.xpath("//button[@data-qa='login-button"));
//       Loginbutton.click();
//
//       //8. Verify error 'Your email or password is incorrect!' is visible
//       WebElement VerifyText5 = driver.findElement(By.xpath("//p[@style='color: red;']"));
//       String actualText5 = VerifyText5.getText();
//       String expectedText5= "Your email or password is incorrect!";
//       Assert.assertEquals(expectedText5,actualText5);

   }
   @Test
    public void Logoutuser(){

       //3. Verify that home page is visible successfully
       WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
       homepage.getText();

       //4. Click on 'Signup / Login' button
       WebElement signup =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
       signup.click();

       //5. Verify 'Login to your account' is visible
       WebElement Logintoyouraccount = driver.findElement(By.xpath("//div[@class='login-form']"));
       Logintoyouraccount.getText();

       //6. Enter correct email address and password
       WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
       username.sendKeys("ketty@gmail.com");

       WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
       password.sendKeys("12345@");

       //7. Click 'login' button
       WebElement ClickLogin1 = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
       ClickLogin1.click();

       //8. Verify that 'Logged in as username' is visible
       WebElement VerifyUsernameLogin = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
       VerifyUsernameLogin.getText();

       //9. Click 'Logout' button
       WebElement Logout = driver.findElement(By.xpath("//a[@href='/logout']"));
       Logout.click();

       //10. Verify that user is navigated to login page
//       WebElement VerifyText = driver.findElement(By.xpath("//section[@id='form']"));
//       String actualtext = VerifyText.getText();
//       String expectedtext = "Login to your account\n" +
//               "login\n +" +
//               "OR\n +" +
//               "New User Signup!\n +" +
//               "Signup";
//       Assert.assertEquals(expectedtext,actualtext);

   }
   @Test
    public void RegisterUserwithexistingemail(){

       //3. Verify that home page is visible successfully
       WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
       homepage.getText();

       //4. Click on 'Signup / Login' button
       WebElement signup =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
       signup.click();

       //5. Verify 'New User Signup!' is visible
       WebElement Newuser = driver.findElement(By.xpath("//div[@class='signup-form']"));
       Newuser.getText();

       //6. Enter name and already registered email address
       WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
       name.sendKeys("ketty");

       WebElement username = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
       username.sendKeys("ketty@gmail.com");

       //7. Click 'Signup' button
       WebElement Singup =driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
       Singup.click();

       //8. Verify error 'Email Address already exist!' is visible
       WebElement Verifyerror = driver.findElement(By.xpath("//p[@style='color: red;']"));
       Verifyerror.getText();

   }
   @Test
    public void VerifyTestCasesPage (){

       //3. Verify that home page is visible successfully
       WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
       homepage.getText();

       //4. Click on 'Test Cases' button
       WebElement Testcase = driver.findElement(By.xpath("//a[@style='color: orange;']"));
       Testcase.click();

       //5. Verify user is navigated to test cases page successfully
       WebElement Navigateteastcase = driver.findElement(By.xpath("//h2[@class='title text-center']"));
       Navigateteastcase.getText();

    }
    @Test
    public void VerifyAllProductsandproductdetailpage(){

        //3. Verify that home page is visible successfully
        WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        homepage.getText();

        //4. Click on 'Products' button
        WebElement Product = driver.findElement(By.xpath("//a[@style='color: orange;']"));
        Product.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement Nevigateproduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Nevigateproduct.getText();

        //6. The products list is visible
        WebElement visiblelist = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']"));
        visiblelist.getText();

        //7. Click on 'View Product' of first product
        WebElement Viewfirstproduct = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        Viewfirstproduct.getText();

        //8. User is landed to product detail page
        WebElement landedproduct = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']"));
        landedproduct.getText();

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement Verifyproductname = driver.findElement(By.tagName("h2"));
        Verifyproductname.getText();

        WebElement Verifycategory = driver.findElement(By.tagName("p"));
        Verifycategory.getText();

    //    WebElement Verifyprice = driver.findElement(By.tagName(""));
     //   Verifyprice.getText();

        WebElement Verifyavailability = driver.findElement(By.tagName("p"));
        Verifyavailability.getText();

        WebElement Verifycondition = driver.findElement(By.tagName("b"));
        Verifycondition.getText();

        WebElement VerifyBrand = driver.findElement(By.tagName("b"));
        VerifyBrand.getText();
    }
    @Test
    public void SearchProduct(){

        //3. Verify that home page is visible successfully
        WebElement homepage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        homepage.getText();

        //4. Click on 'Products' button
        WebElement Product = driver.findElement(By.xpath("//a[@href='/products']"));
        Product.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement Nevigateproduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Nevigateproduct.getText();

        //6. Enter product name in search input and click search button
        WebElement serchproduct  = driver.findElement(By.xpath("//input[@id='search_product']"));
        serchproduct.sendKeys("");

        WebElement  searchbutton = driver.findElement(By.xpath("//button[@id='submit_search']"));
        searchbutton.click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        WebElement Verifyproduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Verifyproduct.getText();

        //8. Verify all the products related to search are visible
        WebElement Verifyallproduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Verifyallproduct.getText();
    }




}
