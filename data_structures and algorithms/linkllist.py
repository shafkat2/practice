class Node(object):

    def __init__(self, data):
        self.data = data
        self.nextNode = None

class LinkedList(object):

    def __init__(self):
        self.head = None
        self.size = 0

    def insertStart(self,data):

        self.size = self.size + 1
        newNode = Node(data)

        if not self.head:
            self.head = newNode
        else:
            newNode.nextNode = self.head
            self.head = newNode

    def size(self):
        return self.size
    def size2(self):
        actualNode = self.head
        size = 0
        while actualNode is not None:
            size+=1
            actualNode - actualNode.nextNode
        
        return size

    def insertEnd(self,data):
        
        self.size = self.size +1
        newNode = Node(data)
        acutalNode = self.head

        while acutalNode is not None:
            acutalNode = acutalNode.nextNode

        acutalNode.nextNode = newNode
    
    def traverellist(self):

        actualNode = self.head

        while actualNode is not None:
            print("%d",actualNode)
            acutalNode = acutalNode.nextNode
    
    def remove(self, data):

        if self.head is None:
            return

        self.size = self.size -1
        
        currentNode = self.head
        previousNode = None
        
        while currentNode.data != data:
            previousNode = currentNode
            currentNode = currentNode.nextNode
        if(previousNode is None):
            self.head = currentNode.nextNode
        else:
            previousNode.newNode = currentNode.nextNode    
