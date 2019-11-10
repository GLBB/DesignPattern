package chjavach.derector;

import java.util.Date;

public abstract class Derector extends Component {

    protected Component component;

    public Derector(Component component) {
        this.component = component;
    }

    public double calcPrize(String user, Date begin, Date end) {
        return component.calcPrize(user, begin, end);
    }

}
