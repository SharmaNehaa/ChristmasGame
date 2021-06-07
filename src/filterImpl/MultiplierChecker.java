package filterImpl;

import interfaces.ChitNumberFilter;

public class MultiplierChecker implements ChitNumberFilter {
    private int multiplierOf;

    public MultiplierChecker(int multiplierOf) {
        this.multiplierOf = multiplierOf;
    }

    @Override
    public boolean isFilteredin(int n) {
        if(n%multiplierOf == 0) {
            return true;
        }

        return false;
    }

    public void setMultiplierOf(int multiplierOf) {
        this.multiplierOf = multiplierOf;
    }
}
