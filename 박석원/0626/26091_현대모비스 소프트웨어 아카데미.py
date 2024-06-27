import sys
from collections import deque

N, M = map(int, input().split())

people = list(map(int, sys.stdin.readline().split()))
people.sort()
people = deque(people)

answer = 0
while(len(people) > 1):
    back = people.pop()
    front = people.popleft()

    if back + front >= M:
        answer += 1

print(answer)