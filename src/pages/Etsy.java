package pages;

public class Etsy {
    private HomePage _homePage;
    private SignInPage _signInPage;
    private CartPage _cartPage;
    private LoggedInPage _loggedInPage;
    private SearchResultsPage _searchResultsPage;
    private InfoItemPage _infoItemPage;
    private FiltersPage _filtersPage;

    public HomePage homePage() {
        if (_homePage == null) {
            _homePage = new HomePage();
        }
        return _homePage;
    }

    public SignInPage signInPage() {
        if (_signInPage == null) {
            _signInPage = new SignInPage();
        }
        return _signInPage;
    }

    public LoggedInPage loggedInPage() {
        if (_loggedInPage == null) {
            _loggedInPage = new LoggedInPage();
        }
        return _loggedInPage;
    }

    public CartPage cartPage() {
        if (_cartPage == null) {
            _cartPage = new CartPage();
        }
        return _cartPage;
    }

    public SearchResultsPage searchResultsPage() {
        if (_searchResultsPage == null) {
            _searchResultsPage = new SearchResultsPage();
        }
        return _searchResultsPage;
    }

    public InfoItemPage infoItemPage() {
        if (_infoItemPage == null) {
            _infoItemPage = new InfoItemPage();
        }
        return _infoItemPage;
    }

    public FiltersPage filtersPage() {
        if (_filtersPage == null) {
            _filtersPage = new FiltersPage();
        }
        return _filtersPage;
    }
}
