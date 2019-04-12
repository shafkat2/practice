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
    
    def getPredecessor(self,node):

         if node.rightChild:
             return self.getPredecessor(node.rightChild)      
         return node
    
   
    def remove(self,data):
        if self.root:
            self.root = self.removeNode(data,self.root)

    def insert(self,data):
        self.root = self.insertNode(data, self.root)

    def insertNode(self, data, node):
        if not node:
            return Node(data)

        if data < node.data:
            node.leftChild = self.insertNode(data, node.leftChild)
        else:
            node.rightChild = self.insertNode(data, node.rightChild)
        
        node.height = max(self.calcHeight(node.leftChild) , self.calcHeight(node.rightChild)) +1

        return self.settleVioltations(data, node)

    def settleVioltations(self,data,node):
        balance = self.calcBalance(node)

        #left heavy situation

        if balance > 1 and data < node.leftChild.data:
            print("left left heavy situation....")
            return self.rotateright(node)
        #right heavy situation    
        if balance < - 1 and data>node.rightChild.data:
            print("righ right heavy situation....")
            return self.rotateleft(node)

        if balance > 1 and data > node.leftChild.data:
            print("left right heavy situtaion.....")
            node.leftChild = self.rotateleft(node.leftChild)
            return self.rotateright(node)

        if balance < -1 and data < node.rightChild.data:
            print("right left heavy situtaion....")
            node.rightChild = self.rotateright(node.rightChild)
            return self.rotateleft(node)

        return node



   # if it returns value>1 it means it has left heavy tree => right rotation
   # .....              <-1 it means it has right heavy tree +> left rotation
    def calcBalance(self,node):

        if not node:
            return 0
        
        return self.calcHeight(node.leftChild) - self.calcHeight(node.rightChild)
    
    def rotateright(self,node):
        print("rotating right on the noode",node.data)
        tempLeftChild = node.leftChild
        t = tempLeftChild.rightChild 

        tempLeftChild.rightChild = node
        node.leftChild = t

        node.height = max(self.calcHeight(node.leftChild)), self.calcHeight(node.rightChild)
        tempLeftChild.height = max(self.calcHeight(tempLeftChild.leftChild)), self.calcHeight(tempLeftChild.rightChild)

        return tempLeftChild

    def travers(self):
            if self.root:
                self.traverseInorder(self.root)


    def traverseInorder(self,node):
        if node.leftChild:
            self.traverseInorder(node.leftChild)
        
        print("%s" %node.data)

        if node.rightChild:
            self.traverseInorder(node.rightChild)

    def rotateleft(self,node):
         
        print("rotating right on the noode",node.data)
        tempRightChild = node.rightChild
        t = tempRightChild.leftChild

        tempRightChild.leftChild = node
        node.rightChild = t

        node.height = max(self.calcHeight(node.rightChild), self.calcHeight(node.leftChild))
        tempRightChild.height = max(self.calcHeight(tempRightChild.rightChild), self.calcHeight(tempRightChild.leftChild))

        return tempRightChild

    def removeNode(self,data,node):
         if not node:
             return node

         if data < node.data:
            node.leftChild = self.removeNode(data, node.leftChild)
         elif data >node.data:
             node.rightChild = self.removeNode(data,node.rightChild)
         else:

             if not node.leftChild and not node.rightChild:
                 print("removing a leaf node")
                 del node
                 return None
             if not node.leftChild:
                 print("removing a node with left child")
                 tempNode = node.leftChild
                 del node
                 return tempNode
            
             elif not node.rightChild:
                 print("removing a node with right child")
                 tempNode = node.leftChild
                 del node
                 return tempNode

             print("removing node with two child")
             tempNode = self.getPredecessor(node.leftChild)
             node.data = tempNode.data 
             node.leftChild = self.removeNode(tempNode.data, node.leftChild)
         
         if not node:
                return node
        
         node.height = max(self.calcHeight(node.leftChild), self.calcHeight(node.rightChild))+1

         balance = self.calcBalance(node)

         if balance > 1 and self.calcBalance(node.leftChild) >= 0:
             return self.rotateright(node)
         
         if balance > 1 and self.calcBalance(node.leftChild) < 0:
             node.leftChild = self.rotateleft(node.leftChild)
             return self.rotateright(node)

         if balance < -1 and self.calcBalance(node.rightChild) <= 0:
             return self.rotateleft(node)

         if balance > -1 and self.calcBalance(node.leftChild) > 0:
             node.rightChild = self.rotateright(node.rightChild)
             return self.rotateleft(node)
         return node

avl = AVL()

avl.insert(10)
avl.insert(20)
avl.insert(30)

avl.remove(20)

avl.travers()