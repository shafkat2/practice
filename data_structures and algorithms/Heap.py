class Heap(object):

    HEAP_SIZE = 10

    def __init__(self):
        self.heap = [0]*Heap.HEAP_SIZE
        self.currentPosition = -1

    def insert(self,item):
        
        if self.isFull():
            print("heap is full")
            return
        self.currentPosition = self.currentPosition +1
        self.heap[self.currentPosition] = item
        self.fixUp(self.currentPosition)

    def isFull(self):
        if self.currentPosition == Heap.HEAP_SIZE:
            return True
        else:
            return False
    
    def fixUp(self,index):
        parentIndex = int((index-1)/2)


        while parentIndex >= 0 and self.heap[parentIndex] < self.heap[index]:
            temp = self.heap[index]
            self.heap[index] = self.heap[parentIndex]
            self.heap[parentIndex] = temp
            parentIndex = int((index-1)/2)

    def heapsort(self):

        for i in range(0,self.currentPosition+1):
            temp = self.heap[0]
            print("%d"% temp)
            self.heap[0] = self.heap[self.currentPosition-i]
            self.heap[self.currentPosition- i ] = temp
            self.fixDown(0,self.currentPosition - i -1)

    def fixDown(self, index, upto):
        
        while index <= upto:

            leftChild = 2*index+1
            rightChild = 2*index+2

            if leftChild < upto:
                childtoSwap = None

                if leftChild > upto:
                    childtoSwap = leftChild
                else:
                    if self.heap[leftChild] >self.heap[rightChild]:
                        childtoSwap = leftChild
                    else:
                        childtoSwap = rightChild
                if self.heap[index] <self.heap[childtoSwap]:
                    temp = self.heap[index]
                    self.heap[index] = self.heap[childtoSwap]
                    self.heap[childtoSwap] = temp
                else:
                    break
                index = childtoSwap    
            else:
                break


heap = Heap()

heap.insert(10)
heap.insert(2)
heap.insert(-1)
heap.insert(5)
heap.insert(3)
heap.insert(12)
heap.insert(6)

heap.heapsort()
