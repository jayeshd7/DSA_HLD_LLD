package AugustBatchProblem.LLD.Factory.theme.dark;


import AugustBatchProblem.LLD.Factory.theme.Theme;
import AugustBatchProblem.LLD.Factory.theme.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeFactory() {
        return new DarkComponentFactory();
    }

    @Override
    public boolean changePrimaryColour(String colour) {
        return false;
    }
}
