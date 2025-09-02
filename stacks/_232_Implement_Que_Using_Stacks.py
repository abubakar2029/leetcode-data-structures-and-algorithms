class MyQueue:
    input = []
    output = []

    def __init__(self):
        self.input = []
        self.output = []

    def push(self, x: int) -> None:
        while (self.input):
            self.output.append(self.input.pop())

        self.input.append(x)

        while (self.output):
            self.input.append(self.output.pop())

    def pop(self) -> int:
        if not self.input:
            return -1

        return self.input.pop()

    def peek(self) -> int:
        if not self.input:
            return -1

        return self.input[-1]


    def empty(self) -> bool:
        if self.input:
            return False
        return True

