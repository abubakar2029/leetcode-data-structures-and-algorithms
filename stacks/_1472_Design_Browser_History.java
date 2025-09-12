package stacks;

import java.util.*;

public class _1472_Design_Browser_History {
    class BrowserHistory {
        Stack<String> browser;
        Stack<String> forward;
        String current;

        public BrowserHistory(String homepage) {
            browser = new Stack();
            // browser.push(homepage);
            forward = new Stack();
            current = homepage;
        }

        public void visit(String url) {
            forward.clear();
            if (current != null)
                browser.push(current);
            current = url;
        }

        public String back(int steps) {

            for (int i = 0; i < steps; i++) {
                int x = browser.size();
                if (x == 0)
                    break;
                System.out.println(current);
                forward.push(current);
                current = browser.pop();
            }
            return current;
        }

        public String forward(int steps) {

            for (int i = 0; i < steps; i++) {
                int x = forward.size();
                if (x == 0)
                    break;
                browser.push(current);
                current = forward.pop();
            }
            return current;
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
