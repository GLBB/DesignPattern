package chjavach.simpleFactory;

import chjavach.simpleFactory.module.Api;
import chjavach.simpleFactory.module.ApiFactory;

/**
 * 简单工厂模式：
 * 面向接口编程，使客户端不感知实现类
 * 工厂负责选择合适的候选类
 * 如何选择：
 *   1. 通过客户传入的条件
 *   2. 通过配置文件
 *   3. 程序运行时某个值
 * 缺点：
 *   需要用户感知条件，了解条件的含义
 */
public class Client {

    public static void main(String[] args) {
        Api api = ApiFactory.createApi(2);
        String result = api.operation("hello");
        System.out.println(result);
    }
}
