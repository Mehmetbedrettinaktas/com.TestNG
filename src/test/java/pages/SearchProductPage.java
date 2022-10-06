package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

import java.util.List;

public class SearchProductPage {
    public SearchProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsTitle;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[@class='title text-center']")  //  (//h2)[3])
    public WebElement searchedProductTitle;

    @FindBy (linkText = "View Product")
    public WebElement viewProduct;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement blueTop;

    @FindBy (xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> searchedProductList;

}