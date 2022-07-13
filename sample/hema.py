class hema:
    def __init__(self,a,b):
        self.a=a
        self.b=b
    def const(self):
        print(self.a,self.b)
        obj=hema()
        obj=const()
t1=hema(10,20)
t2=hema(20,10)
t1.display()
t2.display()