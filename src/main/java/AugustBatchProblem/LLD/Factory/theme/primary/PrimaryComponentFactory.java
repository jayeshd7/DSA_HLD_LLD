package AugustBatchProblem.LLD.Factory.theme.primary;


import AugustBatchProblem.LLD.Factory.theme.Button;
import AugustBatchProblem.LLD.Factory.theme.Dropdown;
import AugustBatchProblem.LLD.Factory.theme.Menu;
import AugustBatchProblem.LLD.Factory.theme.ThemeComponentFactory;

public class PrimaryComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new PrimaryDropdown();
    }
}
