package AugustBatchProblem.LLD.Factory.theme.primary;

import AugustBatchProblem.LLD.Factory.theme.Theme;
import AugustBatchProblem.LLD.Factory.theme.ThemeComponentFactory;


public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeFactory() {
        return new PrimaryComponentFactory();
    }

    @Override
    public boolean changePrimaryColour(String colour) {
        return false;
    }
}
