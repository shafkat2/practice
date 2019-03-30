class Node(object):

    def __init__(self,data):
        self.data = data
        self.height = 0
        self.leftChild = None
        self.rightChild = None

class AVL(object):

    def __init__(self):
        self.root = None

    def calcHeight(self,node):
        if not node:    
            return -1
        return node.height
   
   # if it returns value>1 it means it has left heavy tree => right rotation
   # .....              <-1 it means it has right heavy tree +> left rotation
    def calcBalance(self,node):

        if not node:
            return 0
        
        return self.calcHeight(node.leftChild) - self.calcHeight(node.righhtChild)
    
    def rotateright(self,node):
        print("rotating right on the noode",node.data)
        tempLeftChild = node.leftChild
        t = tempLeftChild.rightChild 

        tempLeftChild.rightChild = node
        node.leftChild = t

        node.height = max(self.calcHeight(node.leftChild)), self.calcHeight(node.rightChild)
        tempLeftChild.height = max(self.calcHeight(tempLeftChild.leftChild)), self.calcHeight(tempLeftChild.rightChild)

        return tempLeftChild

    def rotateleftt(self,node):
         
        print("rotating right on the noode",node.data)
        tempRightChild = node.rightChild
        t = tempRightChild.leftChild

        tempRightChild.leftChild = node
        node.rightChild = t

        node.height = max(self.calcHeight(node.rightChild)), self.calcHeight(node.leftChild)
        tempRightChild.height = max(self.calcHeight(tempRightChild.rightChild)), self.calcHeight(tempRightChild.leftChild)

        return tempRightChild    
