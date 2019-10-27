package chjavach.simpleFactory.module;

import chjavach.simpleFactory.module.impl.ApiImplA;
import chjavach.simpleFactory.module.impl.ApiImplB;

public class ApiFactory {

    public static Api createApi(Integer condition){
        if (condition==1) {
            return new ApiImplA();
        }else {
            return new ApiImplB();
        }
    }

}
