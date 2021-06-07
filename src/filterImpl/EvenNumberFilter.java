package filterImpl;

import interfaces.ChitNumberFilter;

public class EvenNumberFilter implements ChitNumberFilter {
    @Override
    public boolean isFilteredin(int n) {
        if(n%2 == 0) {
            return true;
        }

        return false;
    }
}
