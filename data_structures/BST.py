
class Node(objext):
    def __init__(self,data):
        self.data = data
        self.leftchild = None
        self.rightchild = None

    

class bnarySearchTree(object):

    def __init__(self,):
        if not self.root:
            self.root = Node(data)
        else:
            self.insertNode(data,self.root)

    #O(logN) ---- only for balanced tree
    def insertNode(self,data,node):

        if data< node.data:
            if node.leftchild:
                self.insertNode(data,node.leftchild)
            else:
                node.leftchild = Node(data)
        else:
            if node.rightchild:
                self.insertNode(data, node.rightchild)
            else:
                node.rightchild = node(data)
    
    def getMinValue(self):
        if self.root:
            return self.getMin(self.root)

    def getMin(self,node):

        if node.leftchild:
            return self.getMin(node.leftchild)

        return node.data

    def getMaxValue(self):
        if self.root:
            return self.getMax(self.root)    

    def getMax(self,node):

        if node.rightchild:
            return self.getMax(node.rightchild)

        return node.data

    def traverse(self):
        if self.root:
            self.traverseinOrder(self.root)

    def traverseinOrder(self,node):
        if node.leftchild:
            self.traverseinOrder(node.leftchild) 
        print("%s"%node.data)

        if node.rightchild:
            self.traverseinOrder(node.rightchild)
        
