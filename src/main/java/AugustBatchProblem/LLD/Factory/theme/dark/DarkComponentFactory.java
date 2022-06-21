package AugustBatchProblem.LLD.Factory.theme.dark;


import AugustBatchProblem.LLD.Factory.theme.Button;
import AugustBatchProblem.LLD.Factory.theme.Dropdown;
import AugustBatchProblem.LLD.Factory.theme.Menu;
import AugustBatchProblem.LLD.Factory.theme.ThemeComponentFactory;

public class DarkComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new DarkDropdown();
    }
}
