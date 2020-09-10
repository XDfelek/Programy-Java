import org.apache.commons.math3.util.Precision;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMainMenu();
        menu.showMenuSwitcher(menu);


    }
}
