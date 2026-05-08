/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        std::stack<ListNode*> front;
        std::stack<ListNode*> rear;
        std::stack<ListNode*> temp_stack;
        int size = 0;
        //   insert all Nodes in rear
        ListNode* temp_node = head;
        while (temp_node != nullptr) {
            size++;
            rear.push(temp_node);
            temp_stack.push(temp_node);
            temp_node = temp_node->next;
        }

        //   insert all Nodes in front
        while (!temp_stack.empty()) {
            front.push(temp_stack.top());
            temp_stack.pop();
        }

        // iterate on both
        // ListNode* result = front.top();
        // ListNode* newHead = result;
        front.pop();
        head->next = rear.top();
        rear.pop();
        head = head->next;
        int i = 0;
        int mid;
        if (size % 2 == 0) {
            mid = size / 2 - 1;
        } else {
            mid = size / 2;
        }
        while (i < mid) {
            i++;
            head->next = front.top();
            head = head->next;
            front.pop();
            head->next = rear.top();
            rear.pop();
            head = head->next;
        }
        head->next = nullptr;
        return;
    }
};