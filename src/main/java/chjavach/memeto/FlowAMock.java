package chjavach.memeto;

public class FlowAMock {

    private String flowName;
    private int tempRes;
    private String tempState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    public void runPhaseOne(){
        tempRes = 3;
        tempState = "Phase One";
    }

    public void schema1(){
        this.tempState += ",Schema1";
        System.out.println(tempState + " : now run " + tempRes);
        tempRes += 11;
    }

    public void schema2(){
        this.tempState += ",Schema2";
        System.out.println(tempState + " : now run " + tempRes);
        tempRes += 22;
    }

    public FlowAMockMemeto createMemento(){
        return new MementoImpl(tempRes, tempState);
    }

    public void setMemento(FlowAMockMemeto memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        tempRes = mementoImpl.getTempRes();
        tempState = mementoImpl.getTempStr();
    }


    private static class MementoImpl implements FlowAMockMemeto {
        private int tempRes;
        private String tempStr;

        private MementoImpl(int tempRes, String tempStr) {
            this.tempRes = tempRes;
            this.tempStr = tempStr;
        }

        public int getTempRes() {
            return tempRes;
        }

        public String getTempStr() {
            return tempStr;
        }
    }
}
