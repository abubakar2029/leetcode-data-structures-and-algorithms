def solve(A,B):
    ptr1 = 0
    ptr2 = 0

    while ptr1 < len(A) and len(B):
        if ptr2+1<len(B) and A[ptr1] == "P" and B[ptr2] =="N" and B[ptr2+1]=="P":
                    ptr1+=1
                    ptr2+=2
        if ptr1+1<len(A) and A[ptr1]=="N" and A[ptr1+1] =="P" and B[ptr2]=="P":
                    ptr1+=2
                    ptr2+=1
        if A[ptr1]==B[ptr2]:
            ptr1+=1
            ptr2+=1
        else:
            print(ptr1,ptr2)
            print("NO")
            return
    
    if ptr1>=len(B):
        print("YEs")
    else:
        print("No") 
        
solve("PNPP","PPNNNNNNNNNNNNNNNNNNP")
if __name__ == "__main__":
    T = int(input())   

    for _ in range(T):
        A, B = input().split()
        solve(A, B)