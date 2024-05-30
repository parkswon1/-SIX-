import itertools
from collections import deque

N = int(input())
SCVS = tuple(list(map(int, input().split())) + [0])
move = list(itertools.permutations([1,3,9]))
visited = set([])

count = float('inf')
queue = deque([SCVS])
visited.add(SCVS[0:N])
last = tuple([0] * N)
if SCVS[0:N] == [0,0,0]:
    print(0)
else:
    while (queue):
        node = queue.popleft()
        for mv in move:
            nextNode = [0] * N + [node[N] + 1]
            for i in range(N):
                nextNode[i] = max(0, node[i] - mv[i])
            tupleNode = tuple(nextNode)
            if node[:N] == last:
                count = min(node[N], count)
            elif tupleNode[:N] not in visited:
                queue.append(tupleNode)
                visited.add(tupleNode[:N])

print(count)
# BFS로 푼 문제 set구조로된 visited에 방문을 기록해나가면서 풀었다
# 모든 가짓수를 다 봐야하니 재귀를 사용하자
#
# BFS
#
# [scv1, scv2, scv3, [0,0,0]]
#
# 뒤에가 0일경우 때린적없음
# 뒤에가 9인경우 9댐으로 9위치 scv를 한번때림
# 뒤에가 3인경우 3댐으로 3위치 scv를 한번때림
# 뒤에가 1인경우 1댐으로 1위치 scv를 한번때림
# 모두때려봤기 때문에 다음엔 [0,0,0]을 넘김
#
# 18 18 18
# 9 15 17
# 8 12 8
# 5 3  7
#
# 17 15 9
# 8 12 8
#
# 중복 처리를 해야함 set으로 (scv1, scv2, scv3) 이렇게가 set에 있는지 확인하기
#
# 그냥 9,3,1로 만들수 있는 가짓수를 list에다 적어두고 빼는식이 더빠를듯
# 파괴된 scv는 못때린다고 했을때 큰 숫자로 떄리는 것이 작은 숫자로 떄리는 것보다 무조건 빠를거기 떄문에
#
# DP방식으로 풀경우 3차원 DP로 풀면된다.
# 내가 만든 코드의 경우 형변환을 계속 해줘야해서 시간 복잡도에서 손해를 본다
# DP방식으로 연습해봐야겠다.