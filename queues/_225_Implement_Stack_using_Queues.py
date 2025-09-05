class MyStack:

    def __init__(self):
        self.input = []
        self.output = []

    def push(self, x) -> None:
        self.input.append(x)

    def pop(self) :
        while self.input:
            self.output.insert(0,self.input.pop())
        return self.output.pop()

    def top(self) :
        while self.input:
            self.output.insert(0,self.input.pop())
        return self.output[-1]

    def empty(self) :
        return (not self.output and not self.input)


m_stack = MyStack()
m_stack.push(1)
m_stack.push(2)
m_stack.top()
m_stack.push(3)
m_stack.top()

# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()