package org.qsoft.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/17/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceTest {

    private List<String> stackString;

    public void createStark() {
        stackString = new ArrayList<String>();
    }

    public void createStarkAutoTenObject() {
        stackString = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            stackString.add("String " + i);
        }
    }

    public int getSizeStack() {
        return stackString.size();
    }

    public void pushObject(String string) {
        this.stackString.add(string);
    }

    public String top() {
        if (stackString != null && stackString.size() == 0) {
            return null;
        } else {
            return stackString.get(stackString.size() - 1);
        }
    }

    public String pop() throws Exception{
        return stackString.get(stackString.size() - 1);
    }
}
