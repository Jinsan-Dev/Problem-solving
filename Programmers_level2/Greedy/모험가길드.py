# 한 마을에 모험가가 N명 있다. 모험가는 각각 공포도를 가지고 있는데, X의 공포도를 가진 모험가는 X명 이상으로 구성된 그룹에 들어가야 모험을 떠날 수 있다.
# N명의 모험가 정보가 주어졌을 때, 최대 그룹 수를 구하는 함수를 만들어라.
# 단, 입력은 N, 공포도 배열 로 주어지며 (예시: N, 2 3 1 2 2), 모든 모험가가 마을을 떠나야 하는 것은 아니다.

def answer(N, fear):
  answer = 0
  count = 0
  arr = list(map(int, fear.split()))
  arr.sort()
  for i in arr:
    count+=1
    if count >= i:
      answer+=1
      count = 0
  return answer
