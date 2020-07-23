public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = null;
    int count;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void setSoldOutState() {
        state = soldOutState;
    }

    public void setNoQuarterState() {
        state = noQuarterState;
    }

    public void setHasQuarterState() {
        state = hasQuarterState;
    }

    public void setSoldState() {
        state = soldState;
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
